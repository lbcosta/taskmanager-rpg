package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import model.Daily;
import model.Dao;
import persistence.AvatarDao;
import persistence.DailyDao;

import static application.App.avatarUnico;

public class DailyController {

    @FXML
    private StackPane paneDaily;

    @FXML
    private Label nomeDaily;

    @FXML
    private Label descDaily;

    @FXML
    private Label difDaily;

    @FXML
    private CheckBox checkBoxDaily;

    private MainWindowController main;

    private Dao dao;

    @FXML
    public void initialize() {
        dao = new Dao();
    }

    public void checkDaily(ActionEvent actionEvent) {
        Daily daily = dao.buscar(Daily.class, "name", nomeDaily.getText());

        if(checkBoxDaily.isSelected()) {
            daily.setDailyDone(true);
            dao.alterar(daily, daily.getId());
            avatarUnico.buff();
        } else {
            daily.setDailyDone(false);
            dao.alterar(daily, daily.getId());
            avatarUnico.debuff();
        }

        dao.alterar(avatarUnico, avatarUnico.getId());
        main.updateScreen();

    }

    public void deleteDaily(ActionEvent actionEvent) {
        TilePane tp = (TilePane) paneDaily.getParent();
        tp.getChildren().remove(paneDaily);

        Daily daily = dao.buscar(Daily.class, "name", nomeDaily.getText());
        dao.excluir(Daily.class, daily.getId());

        main.updateScreen();
    }

    public void setNomeDaily(String nomeDaily) {
        this.nomeDaily.setText(nomeDaily);
    }

    public void setDescDaily(String descDaily) {
        this.descDaily.setText(descDaily);
    }

    public void setDifDaily(String difDaily) {
        this.difDaily.setText(difDaily);
    }

    public void setMain(MainWindowController mainWindowController) {
        this.main = mainWindowController;
    }
}
