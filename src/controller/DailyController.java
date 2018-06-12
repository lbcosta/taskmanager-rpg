package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import persistence.AvatarDao;
import persistence.DailyDao;

import static Application.App.avatarUnico;

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

    private DailyDao dailyDao;

    private AvatarDao avatarDao;

    @FXML
    public void initialize() {
        dailyDao = new DailyDao();
        avatarDao = new AvatarDao();
    }

    public void checkDaily(ActionEvent actionEvent) {
        if(checkBoxDaily.isSelected()) {
            dailyDao.check(null, true, nomeDaily.getText());
            avatarDao.buff(1);
        } else {
            dailyDao.check(null, false, nomeDaily.getText());
            avatarDao.debuff(1);
        }

        avatarUnico = new AvatarDao().searchById(avatarUnico.getId());
        main.updateScreen();

    }

    public void deleteDaily(ActionEvent actionEvent) {
        TilePane tp = (TilePane) paneDaily.getParent();
        tp.getChildren().remove(paneDaily);
        avatarUnico.removeTask(nomeDaily.getText());
        dailyDao.delete(nomeDaily.getText());
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
