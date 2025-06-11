package tugaspraktikum09.scene;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import tugaspraktikum09.model.User;

import java.io.File;

public class RegisterScene {
    private Image profileImage;

    public Scene create(Stage primaryStage, Runnable goToHome, UserHolder userHolder) {
        TextField tfNick = new TextField();
        TextField tfFull = new TextField();
        ImageView imageView = new ImageView();
        Button btnUpload = new Button("Upload Foto Profil");
        Button btnRegister = new Button("Submit");

        btnUpload.setOnAction(e -> {
            FileChooser fc = new FileChooser();
            File file = fc.showOpenDialog(primaryStage);
            if (file != null) {
                profileImage = new Image(file.toURI().toString());
                imageView.setImage(profileImage);
                imageView.setFitHeight(100);
                imageView.setFitWidth(100);

                // Buat gambar profil jadi lingkaran
                Circle clip = new Circle(50, 50, 50); // pusat x=50, y=50, radius=50
                imageView.setClip(clip);
            }
        });

        btnRegister.setOnAction(e -> {
            String nick = tfNick.getText();
            String full = tfFull.getText();
            if (nick.isEmpty() || full.isEmpty() || profileImage == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Semua data harus diisi!");
                alert.show();
            } else {
                userHolder.user = new User(nick, full, profileImage);
                goToHome.run();
            }
        });

        VBox root = new VBox(10,
            new Label("Input User Account"),
            new Label("Nick Name:"), tfNick,
            new Label("Full Name:"), tfFull,
            btnUpload,
            imageView,
            btnRegister
        );
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-padding: 20; -fx-background-color: #f4f4f4;");

        return new Scene(root, 400, 450);
    }

    public static class UserHolder {
        public User user;
    }
}
