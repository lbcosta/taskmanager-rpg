package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import persistence.AvatarDao;
import persistence.HabitDao;
import static Application.App.avatarUnico;

public class HabitController {

    @FXML
    private StackPane paneHabit;

    @FXML
    private Label nomeHabit;

    @FXML
    private Label descHabit;

    @FXML
    private Label difHabit;

    private MainWindowController main;

    private HabitDao habitDao;

    private AvatarDao avatarDao;

    @FXML
    public void initialize() {
        habitDao = new HabitDao();
        avatarDao = new AvatarDao();
    }


    public void deleteHabit(ActionEvent actionEvent) {
        TilePane tp = (TilePane) paneHabit.getParent();
        tp.getChildren().remove(paneHabit);
        avatarUnico.removeTask(nomeHabit.getText());
        habitDao.delete(nomeHabit.getText());
        main.updateScreen();
    }

    public void incPosHabit(ActionEvent actionEvent) {
        habitDao.incPosPoints(nomeHabit.getText());
        avatarDao.buff(avatarUnico.getId());
        avatarUnico = new AvatarDao().searchById(avatarUnico.getId());
        main.updateScreen();
    }

    public void incNegHabit(ActionEvent actionEvent) {
        habitDao.incNegPoints();
        avatarDao.debuff(avatarUnico.getId());
        avatarUnico = new AvatarDao().searchById(avatarUnico.getId());
        main.updateScreen();
    }

    public void setNomeHabit(String nomeHabit) {
        this.nomeHabit.setText(nomeHabit);
    }

    public void setDescHabit(String descHabit) {
        this.descHabit.setText(descHabit);
    }

    public void setDifHabit(String difHabit) {
        this.difHabit.setText(difHabit);
    }

    public void setMain(MainWindowController mainWindowController) {
        this.main = mainWindowController;
    }
}
