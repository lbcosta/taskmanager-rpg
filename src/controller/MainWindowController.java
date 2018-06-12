package controller;

import Application.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import model.*;
import persistence.AvatarDao;

import java.io.IOException;

import static Application.App.avatarUnico;
public class MainWindowController {

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab toDo;

    @FXML
    private TilePane todoPane;

    @FXML
    private Tab habit;

    @FXML
    private TilePane habitPane;

    @FXML
    private Tab daily;

    @FXML
    private TilePane dailyPane;

    @FXML
    private Tab perfil;

    @FXML
    private Label points;

    @FXML
    private Label nomeLabelStatus;

    @FXML
    private Label lvLabelStatus;

    @FXML
    private Label strPoints;

    @FXML
    private Label intPoints;

    @FXML
    private Label conPoints;

    @FXML
    private Label agiPoints;

    @FXML
    private Tab itens;

    @FXML
    private Tab loja;

    @FXML
    private ProgressBar hpBar;

    @FXML
    private ProgressBar xpBar;

    @FXML
    private Label goldLabel;

    @FXML
    private Label nomeLabel;

    @FXML
    private Label lvLabel;

    private Stage stage;


    @FXML
    public void initialize() {
        stage = new Stage();
        updateScreen();
    }

    public void updateScreen() {
        dailyPane.getChildren().clear();
        habitPane.getChildren().clear();
        todoPane.getChildren().clear();

        hpBar.setProgress(0.01 * App.avatarUnico.getHealth());
        xpBar.setProgress(0.01 * App.avatarUnico.getExperience());
        lvLabel.setText(String.valueOf(App.avatarUnico.getLevel()));
        goldLabel.setText(String.valueOf(App.avatarUnico.getCoins()));
        nomeLabel.setText(App.avatarUnico.getName());

        nomeLabelStatus.setText(App.avatarUnico.getName());
        lvLabelStatus.setText(String.valueOf(App.avatarUnico.getLevel()));
        points.setText(String.valueOf(App.avatarUnico.getPoints()));
        strPoints.setText(String.valueOf(App.avatarUnico.getStatus().getStrength()));
        intPoints.setText(String.valueOf(App.avatarUnico.getStatus().getIntelligence()));
        conPoints.setText(String.valueOf(App.avatarUnico.getStatus().getConstitution()));
        agiPoints.setText(String.valueOf(App.avatarUnico.getStatus().getAgility()));

        for(Task t: App.avatarUnico.getTasks()) {
            if(t instanceof Habit)
                insertHabit((Habit) t);
            if(t instanceof Daily)
                insertDaily((Daily) t);
            if(t instanceof Todo)
                insertTodo((Todo) t);
        }
    }

    public void openTodo(ActionEvent actionEvent) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(toDo);
    }

    public void openHabit(ActionEvent actionEvent) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(habit);
    }

    public void openDaily(ActionEvent actionEvent) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(daily);
    }

    public void openStatus(ActionEvent actionEvent) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(perfil);
    }

    public void openItens(ActionEvent actionEvent) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(itens);
    }

    public void openStore(ActionEvent actionEvent) {
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(loja);
    }

    public void addStr(ActionEvent actionEvent) {
        if(avatarUnico.getPoints() > 0) {
            avatarUnico.setPoints(avatarUnico.getPoints() - 1);
            avatarUnico.getStatus().setStrength(avatarUnico.getStatus().getStrength() + 1);
            new AvatarDao().update(avatarUnico);
            updateScreen();
        }
    }

    public void addInt(ActionEvent actionEvent) {
        if(avatarUnico.getPoints() > 0) {
            avatarUnico.setPoints(avatarUnico.getPoints() - 1);
            avatarUnico.getStatus().setIntelligence(avatarUnico.getStatus().getIntelligence() + 1);
            new AvatarDao().update(avatarUnico);
            updateScreen();
        }

    }

    public void addAgi(ActionEvent actionEvent) {
        if(avatarUnico.getPoints() > 0) {
            avatarUnico.setPoints(avatarUnico.getPoints() - 1);
            avatarUnico.getStatus().setAgility(avatarUnico.getStatus().getAgility() + 1);
            new AvatarDao().update(avatarUnico);
            updateScreen();
        }

    }

    public void addCon(ActionEvent actionEvent) {
        if(avatarUnico.getPoints() > 0) {
            avatarUnico.setPoints(avatarUnico.getPoints() - 1);
            avatarUnico.getStatus().setConstitution(avatarUnico.getStatus().getConstitution() + 1);
            new AvatarDao().update(avatarUnico);
            updateScreen();
        }

    }

    public void OpenNewWindow(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/NewTask.fxml"));
        Parent root1 = fxmlLoader.load();

        NewTaskController ntc = (NewTaskController) fxmlLoader.getController();

        ntc.setMain(this);

        stage.setTitle("Cadastro");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void insertHabit(Habit habit) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/HabitTemplate.fxml"));
            Pane pane = fxmlLoader.load();
            HabitController habitController = (HabitController) fxmlLoader.getController();

            habitController.setNomeHabit(habit.getName());
            habitController.setDescHabit(habit.getDescription());
            habitController.setDifHabit(habit.getDifficulty());

            habitController.setMain(this);

            habitPane.getChildren().add(pane);

            stage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void insertDaily(Daily daily) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/DailyTemplate.fxml"));
            Pane pane = fxmlLoader.load();
            DailyController dailyController = (DailyController) fxmlLoader.getController();

            dailyController.setNomeDaily(daily.getName());
            dailyController.setDescDaily(daily.getDescription());
            dailyController.setDifDaily(daily.getDifficulty());

            dailyController.setMain(this);

            dailyPane.getChildren().add(pane);

            stage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void insertTodo(Todo todo) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/TodoTemplate.fxml"));
            Pane pane = fxmlLoader.load();
            TodoController todoController = (TodoController) fxmlLoader.getController();

            todoController.setNomeTodo(todo.getName());
            todoController.setDescTodo(todo.getDescription());
            todoController.setDifTodo(todo.getDifficulty());

            todoController.setMain(this);

            todoPane.getChildren().add(pane);

            stage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}