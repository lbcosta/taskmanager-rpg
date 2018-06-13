package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.*;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import static application.App.avatarUnico;

public class NewTaskController {

    @FXML
    private TabPane tabPaneNewTask;

    @FXML
    private TextField nomeNewHabit;

    @FXML
    private ComboBox<String> difNewHabit;

    @FXML
    private TextField descNewHabit;

    @FXML
    private CheckBox posNewHabit;

    @FXML
    private CheckBox negNewHabit;

    @FXML
    private TextField nomeNewDaily;

    @FXML
    private ComboBox<String> difNewDaily;

    @FXML
    private TextField descNewDaily;

    @FXML
    private DatePicker startDateNewDaily;

    @FXML
    private TextField repNewDaily;

    @FXML
    private TextField nomeNewTodo;

    @FXML
    private ComboBox<String> difNewTodo;

    @FXML
    private TextField descNewTodo;

    @FXML
    private DatePicker dueDateNewTodo;

    @FXML
    private DatePicker reminderNewTodo;

    private ArrayList<Date> reminders;

    private MainWindowController main;

    private ObservableList<String> difficulties;

    private Dao dao;

    public NewTaskController() {
        dao = new Dao();
    }


    @FXML
    public void initialize() {
        tabPaneNewTask.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    reminders = new ArrayList<>();
                }
        );

        ArrayList<String> difs = new ArrayList<>();
        difs.add("Fácil");
        difs.add("Médio");
        difs.add("Difícil");
        difficulties = FXCollections.observableArrayList(difs);

        difNewDaily.setItems(difficulties);
        difNewHabit.setItems(difficulties);
        difNewTodo.setItems(difficulties);
    }


    public void addNewHabit(ActionEvent actionEvent) {
        String nome = nomeNewHabit.getText();
        String dificuldade = difNewHabit.getValue();
        String descricao = descNewHabit.getText();
        Boolean posInf = posNewHabit.isSelected();
        Boolean negInf = negNewHabit.isSelected();

        Habit habit = dao.inserir(
                new Habit(nome, dificuldade, descricao, posInf, negInf, 0, 0, avatarUnico.getId())
        );

        main.insertHabit(habit);

        main.openHabit(null);
    }

    public void addNewDaily(ActionEvent actionEvent) {
        String nome = nomeNewDaily.getText();
        String dificuldade = difNewDaily.getValue();
        String descricao = descNewDaily.getText();
        Date startDate =  Date.from(startDateNewDaily.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
        int repeats = Integer.parseInt(repNewDaily.getText());

        Daily daily = dao.inserir(new Daily(nome, dificuldade, descricao, false, avatarUnico.getId()));

        dao.inserir(new Frequency(startDate, repeats, daily.getId()));

        main.insertDaily(daily);

        main.openDaily(null);
    }


    public void addNewTodo(ActionEvent actionEvent) {
        String nome = nomeNewTodo.getText();
        String dificuldade = difNewTodo.getValue();
        String descricao = descNewTodo.getText();
        Date dueDate = Date.from(dueDateNewTodo.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());

        Todo todo = dao.inserir(new Todo(nome, dificuldade, descricao, false, dueDate, avatarUnico.getId()));

        for(Date remind : reminders) {
            dao.inserir(new Reminder(remind, todo.getId()));
        }

        main.insertTodo(todo);

        main.openTodo(null);
    }


    public void addRemNewTodo(ActionEvent actionEvent) {
        reminders.add(Date.from(reminderNewTodo.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }


    public void setMain(MainWindowController mainWindowController) {
        this.main = mainWindowController;
    }
}
