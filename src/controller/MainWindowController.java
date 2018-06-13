package controller;

import application.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;
import java.util.ArrayList;

import static application.App.avatarUnico;

public class MainWindowController {

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

    @FXML
    private Button todoButton;

    @FXML
    private Button habitButton;

    @FXML
    private Button dailyButton;

    @FXML
    private Button statusButton;

    @FXML
    private Button itemsButton;

    @FXML
    private Button storeButton;

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
    private Button strPointsBtn;

    @FXML
    private Label intPoints;

    @FXML
    private Button intPointsBtn;

    @FXML
    private Label conPoints;

    @FXML
    private Button conPointsBtn;

    @FXML
    private Label agiPoints;

    @FXML
    private Button agiPointsBtn;

    @FXML
    private ImageView avatarImage1;

    @FXML
    private Tab itens;

    @FXML
    private TilePane itemsPane;

    @FXML
    private Tab loja;

    @FXML
    private TilePane storePane;

    @FXML
    private Button addButton;

    private Stage stage;

    private Dao dao;

    public MainWindowController() {
        dao = new Dao();
    }


    @FXML
    public void initialize() {
        stage = new Stage();

        mountStore();
        updateScreen();
    }

    public void updateScreen() {
        dailyPane.getChildren().clear();
        habitPane.getChildren().clear();
        todoPane.getChildren().clear();
        itemsPane.getChildren().clear();

        hpBar.setProgress(0.01 * App.avatarUnico.getHealth());
        xpBar.setProgress(0.01 * App.avatarUnico.getExperience());
        lvLabel.setText(String.valueOf(App.avatarUnico.getLevel()));
        goldLabel.setText(String.valueOf(App.avatarUnico.getCoins()));
        nomeLabel.setText(App.avatarUnico.getName());

        nomeLabelStatus.setText(App.avatarUnico.getName());
        lvLabelStatus.setText(String.valueOf(App.avatarUnico.getLevel()));
        points.setText(String.valueOf(App.avatarUnico.getPoints()));

        Status status = dao.buscar(Status.class, "avatarId", avatarUnico.getId());

        strPoints.setText(String.valueOf(status.getStrength()));
        intPoints.setText(String.valueOf(status.getIntelligence()));
        conPoints.setText(String.valueOf(status.getConstitution()));
        agiPoints.setText(String.valueOf(status.getAgility()));

        for (Habit h : dao.listarComFiltro(Habit.class, "avatarId", avatarUnico.getId())) {
            insertHabit(h);
        }

        for (Daily d : dao.listarComFiltro(Daily.class, "avatarId", avatarUnico.getId())) {
            insertDaily(d);
        }

        for (Todo t : dao.listarComFiltro(Todo.class, "avatarId", avatarUnico.getId())) {
            insertTodo(t);
        }

        ArrayList<Integer> itemIds = new ArrayList<>();
        for (ItemDoAvatar item : dao.listarComFiltro(ItemDoAvatar.class, "avatarId", avatarUnico.getId())) {
            itemIds.add(item.getItemId());
        }

        for (int itemId : itemIds) {
            insertItem(dao.buscar(Item.class, "id", itemId));
        }
    }

    public void openTodo(ActionEvent actionEvent) {
        colorChange("#e0e0e0","white","white","white","white", "white");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(toDo);
    }

    public void openHabit(ActionEvent actionEvent) {
        colorChange("white","#e0e0e0","white","white","white", "white");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(habit);
    }

    public void openDaily(ActionEvent actionEvent) {
        colorChange("white","white","#e0e0e0","white","white", "white");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(daily);
    }

    public void openStatus(ActionEvent actionEvent) {
        colorChange("white","white","white","#e0e0e0","white", "white");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(perfil);
    }

    public void openItens(ActionEvent actionEvent) {
        colorChange("white","white","white","white","#e0e0e0", "white");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(itens);
    }

    public void openStore(ActionEvent actionEvent) {
        colorChange("white","white","white","white","white","#e0e0e0");
        SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
        selectionModel.select(loja);
    }

    private void colorChange(String todo, String habit, String daily, String status, String items, String store) {
        todoButton.getParent().setStyle("-fx-background-color:"+todo);
        habitButton.getParent().setStyle("-fx-background-color:"+habit);
        dailyButton.getParent().setStyle("-fx-background-color:"+daily);
        statusButton.getParent().setStyle("-fx-background-color:"+status);
        itemsButton.getParent().setStyle("-fx-background-color:"+items);
        storeButton.getParent().setStyle("-fx-background-color:"+store);
    }

    public void addStr(ActionEvent actionEvent) {
        if (avatarUnico.getPoints() > 0) {
            avatarUnico.setPoints(avatarUnico.getPoints() - 1);

            Status status = dao.buscar(Status.class, "avatarId", avatarUnico.getId());

            status.setStrength(status.getStrength() + 1);

            dao.alterar(status, status.getId());
            dao.alterar(avatarUnico, avatarUnico.getId());

            updateScreen();
        }
    }

    public void addInt(ActionEvent actionEvent) {
        if (avatarUnico.getPoints() > 0) {
            avatarUnico.setPoints(avatarUnico.getPoints() - 1);

            Status status = dao.buscar(Status.class, "avatarId", avatarUnico.getId());

            status.setIntelligence(status.getIntelligence() + 1);

            dao.alterar(status, status.getId());
            dao.alterar(avatarUnico, avatarUnico.getId());

            updateScreen();
        }

    }

    public void addAgi(ActionEvent actionEvent) {
        if (avatarUnico.getPoints() > 0) {
            avatarUnico.setPoints(avatarUnico.getPoints() - 1);

            Status status = dao.buscar(Status.class, "avatarId", avatarUnico.getId());

            status.setAgility(status.getAgility() + 1);

            dao.alterar(status, status.getId());
            dao.alterar(avatarUnico, avatarUnico.getId());

            updateScreen();
        }

    }

    public void addCon(ActionEvent actionEvent) {
        if (avatarUnico.getPoints() > 0) {
            avatarUnico.setPoints(avatarUnico.getPoints() - 1);

            Status status = dao.buscar(Status.class, "avatarId", avatarUnico.getId());

            status.setConstitution(status.getConstitution() + 1);

            dao.alterar(status, status.getId());
            dao.alterar(avatarUnico, avatarUnico.getId());

            updateScreen();
        }

    }

    public void OpenNewWindow(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/NewTask.fxml"));
        Parent root1 = fxmlLoader.load();

        NewTaskController ntc = fxmlLoader.getController();

        ntc.setMain(this);

        stage.setTitle("Cadastro");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void insertHabit(Habit habit) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/HabitTemplate.fxml"));
            Pane pane = fxmlLoader.load();
            HabitController habitController = fxmlLoader.getController();

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
            DailyController dailyController = fxmlLoader.getController();

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
            TodoController todoController = fxmlLoader.getController();

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

    public void insertItem(Item item) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/ItemTemplate.fxml"));
            Pane pane = fxmlLoader.load();
            ItemController itemController = fxmlLoader.getController();

            itemController.setItemName(item.getName());
            itemController.setItemStr(Integer.toString(item.getStrength()));
            itemController.setItemInt(Integer.toString(item.getIntelligence()));
            itemController.setItemAgi(Integer.toString(item.getAgility()));
            itemController.setItemCon(Integer.toString(item.getConstitution()));
            itemController.setPrice(Integer.toString(item.getPrice()));

            itemController.setItemImage(new Image("file:src/img/items/" + item.getName() + ".png"));

            itemController.alterButton();

            itemController.setMain(this);

            itemsPane.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void mountStore() {

        try {
            for (Item item : dao.listar(Item.class)) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/ItemTemplate.fxml"));
                Pane pane = fxmlLoader.load();
                ItemController itemController = fxmlLoader.getController();
                itemController.setMain(this);
                itemController.setItemName(item.getName());
                itemController.setItemStr(Integer.toString(item.getStrength()));
                itemController.setItemInt(Integer.toString(item.getIntelligence()));
                itemController.setItemAgi(Integer.toString(item.getAgility()));
                itemController.setItemCon(Integer.toString(item.getConstitution()));
                itemController.setPrice(Integer.toString(item.getPrice()));

                itemController.setItemImage(new Image("file:src/img/items/" + item.getName() + ".png"));

                storePane.getChildren().add(pane);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}