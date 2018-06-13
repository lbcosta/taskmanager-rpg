package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Avatar;
import model.Dao;
import persistence.AvatarDao;

public class App extends Application {

    public static Avatar avatarUnico;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        avatarUnico = new Dao().buscar(Avatar.class, "id", 1);

        Parent root = FXMLLoader.load(getClass().getResource("../view/MainWindow.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("LRT TaskManager");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        new Dao().alterar(avatarUnico, avatarUnico.getId());
        super.stop();
    }
}
