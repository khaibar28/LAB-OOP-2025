package tugaspraktikum09;

import javafx.application.Application;
import javafx.stage.Stage;
import tugaspraktikum09.model.User;
import tugaspraktikum09.scene.HomeScene;
import tugaspraktikum09.scene.RegisterScene;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        RegisterScene registerScene = new RegisterScene();
        RegisterScene.UserHolder userHolder = new RegisterScene.UserHolder();

        Runnable goToHome = () -> {
            HomeScene homeScene = new HomeScene();
            primaryStage.setScene(homeScene.create(primaryStage, userHolder.user));
        };

        primaryStage.setTitle("MyMoment");
        primaryStage.setScene(registerScene.create(primaryStage, goToHome, userHolder));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
