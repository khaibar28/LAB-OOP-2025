package tugaspraktikum09.scene;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import tugaspraktikum09.model.User;
import tugaspraktikum09.model.Post;

import java.io.File;

public class HomeScene {
    private final TilePane postContainer = new TilePane(10, 10);

    public Scene create(Stage primaryStage, User user) {

        ImageView profileImageView = new ImageView(user.getProfileImage());
        profileImageView.setFitWidth(100);
        profileImageView.setFitHeight(100);
        Circle clip = new Circle(50, 50, 50);
        profileImageView.setClip(clip);

        Label nickLabel = new Label(user.getNickName());
        nickLabel.setStyle("-fx-font-size: 16; -fx-font-weight: bold;");
        Label fullNameLabel = new Label(user.getFullName());

        VBox nameBox = new VBox(5, nickLabel, fullNameLabel);
        nameBox.setAlignment(Pos.CENTER_LEFT);

        Button btnAddPost = new Button("Add Post");

        HBox header = new HBox(20, profileImageView, nameBox);
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        HBox topBar = new HBox(10, header, spacer, btnAddPost);
        topBar.setPadding(new Insets(10));
        topBar.setAlignment(Pos.CENTER_LEFT);
        topBar.setStyle("-fx-background-color: #eeeeee;");

        postContainer.setPrefColumns(3); 
        postContainer.setPadding(new Insets(10));
        postContainer.setPrefTileWidth(150);
        postContainer.setPrefTileHeight(150);
        postContainer.setTileAlignment(Pos.CENTER);

        ScrollPane scrollPane = new ScrollPane(postContainer);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background-color: transparent;");

        VBox root = new VBox(10, topBar, scrollPane);
        root.setStyle("-fx-padding: 10;");

        btnAddPost.setOnAction(e -> showPostWindow(primaryStage));

        return new Scene(root, 600, 500);
    }

    private void showPostWindow(Stage owner) {
        Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(owner);
        dialog.setTitle("Upload post");

        TextField captionField = new TextField();
        captionField.setPromptText("Caption");

        Button uploadBtn = new Button("Upload Image");
        Button submitBtn = new Button("Submit");

        ImageView preview = new ImageView();
        final Image[] selectedImage = new Image[1];

        uploadBtn.setOnAction(e -> {
            FileChooser fc = new FileChooser();
            File file = fc.showOpenDialog(dialog);
            if (file != null) {
                selectedImage[0] = new Image(file.toURI().toString());
                preview.setImage(selectedImage[0]);
                preview.setFitWidth(250);
                preview.setFitHeight(150);
            }
        });

        submitBtn.setOnAction(e -> {
            if (selectedImage[0] != null && !captionField.getText().isEmpty()) {
                Post post = new Post(captionField.getText(), selectedImage[0]);
                addPost(post);
                dialog.close();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Gambar dan caption harus diisi!");
                alert.show();
            }
        });

        VBox layout = new VBox(10, uploadBtn, preview, new Label("Caption"), captionField, submitBtn);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));
        layout.setStyle("-fx-background-color: #fefefe;");

        dialog.setScene(new Scene(layout, 300, 400));
        dialog.show();
    }

    private void addPost(Post post) {
        ImageView postImageView = new ImageView(post.getPostImage());
        postImageView.setFitWidth(150);
        postImageView.setFitHeight(100);

        Tooltip captionTooltip = new Tooltip(post.getCaption());
        Tooltip.install(postImageView, captionTooltip);

        postContainer.getChildren().add(postImageView);
    }
}
