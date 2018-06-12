package controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.*;
import persistence.DailyDao;
import persistence.HabitDao;
import persistence.TodoDao;

import java.time.LocalDate;
import java.util.ArrayList;

import static Application.App.avatarUnico;

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

    private ArrayList<CheckListItem> clItem;

    private ArrayList<LocalDate> reminders;

    private MainWindowController main;

    private ObservableList<String> difficulties;


    @FXML
    public void initialize() {
        tabPaneNewTask.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    clItem = new ArrayList<>();
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

        Habit habit = new Habit(nome, dificuldade, descricao, posInf, negInf, 0, 0 );

        avatarUnico.addTask(new HabitDao().insert(avatarUnico, habit));

        main.insertHabit(habit);

        main.openHabit(null);
    }

    public void addNewDaily(ActionEvent actionEvent) {
        String nome = nomeNewDaily.getText();
        String dificuldade = difNewDaily.getValue().toString();
        String descricao = descNewDaily.getText();

        LocalDate startDate =  startDateNewDaily.getValue();
        int repeats = Integer.parseInt(repNewDaily.getText());

        Frequency freq = new Frequency(startDate, repeats);

        Daily daily = new Daily(nome, dificuldade, descricao, false, clItem, freq);

        avatarUnico.addTask(new DailyDao().insert(avatarUnico, daily));

        main.insertDaily(daily);

        main.openDaily(null);
    }


    public void addNewTodo(ActionEvent actionEvent) {
        String nome = nomeNewTodo.getText();
        String dificuldade = difNewTodo.getValue().toString();
        String descricao = descNewTodo.getText();
        LocalDate dueDate = dueDateNewTodo.getValue();

        Todo todo = new Todo(nome, dificuldade, descricao, false, dueDate, reminders);

        avatarUnico.addTask(new TodoDao().insert(avatarUnico, todo));

        main.insertTodo(todo);

        main.openTodo(null);
    }


    public void addRemNewTodo(ActionEvent actionEvent) {
        reminders.add(reminderNewTodo.getValue());
    }


    public void setMain(MainWindowController mainWindowController) {
        this.main = mainWindowController;
    }
}
