package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import model.Dao;
import model.Habit;

import static application.App.avatarUnico;

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

    private Dao dao;

    @FXML
    public void initialize() {
        dao = new Dao();
    }


    public void deleteHabit(ActionEvent actionEvent) {
        TilePane tp = (TilePane) paneHabit.getParent();
        tp.getChildren().remove(paneHabit);


        Habit habit = dao.buscar(Habit.class, "name", nomeHabit.getText());
        dao.excluir(habit.getClass(), habit.getId());

        main.updateScreen();
    }

    public void incPosHabit(ActionEvent actionEvent) {
        Habit habit = dao.buscar(Habit.class, "name", nomeHabit.getText());
        habit.setPositivePoints(habit.getPositivePoints() + 10);
        dao.alterar(habit, habit.getId());

        avatarUnico.buff();
        dao.alterar(avatarUnico, avatarUnico.getId());

        main.updateScreen();
    }

    public void incNegHabit(ActionEvent actionEvent) {
        Habit habit = dao.buscar(Habit.class, "name", nomeHabit.getText());
        habit.setNegativePoints(habit.getNegativePoints() + 10);
        dao.alterar(habit, habit.getId());

        avatarUnico.debuff();
        dao.alterar(avatarUnico, avatarUnico.getId());

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
