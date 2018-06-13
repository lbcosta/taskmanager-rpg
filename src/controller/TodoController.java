package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import model.Dao;
import model.Todo;

import static application.App.avatarUnico;

public class TodoController {

    @FXML
    private StackPane paneTodo;

    @FXML
    private Label nomeTodo;

    @FXML
    private Label descTodo;

    @FXML
    private Label difTodo;

    @FXML
    private CheckBox checkBoxTodo;

    private MainWindowController main;

    private Dao dao;

    @FXML
    public void initialize() {
        dao = new Dao();
    }


    public void checkTodo(ActionEvent actionEvent) {
        Todo todo = dao.buscar(Todo.class, "name", nomeTodo.getText());

        if (checkBoxTodo.isSelected()) {
            todo.setTodoDone(true);
            dao.alterar(todo, todo.getId());
            avatarUnico.buff();
        } else {
            todo.setTodoDone(false);
            dao.alterar(todo, todo.getId());
            avatarUnico.debuff();
        }

        dao.alterar(avatarUnico, avatarUnico.getId());
        main.updateScreen();

    }

    public void deleteTodo(ActionEvent actionEvent) {
        TilePane tp = (TilePane) paneTodo.getParent();
        tp.getChildren().remove(paneTodo);

        Todo todo = dao.buscar(Todo.class, "name", nomeTodo.getText());
        dao.excluir(Todo.class, todo.getId());

        main.updateScreen();
    }

    public void setNomeTodo(String nomeTodo) {
        this.nomeTodo.setText(nomeTodo);
    }

    public void setDescTodo(String descTodo) {
        this.descTodo.setText(descTodo);
    }

    public void setDifTodo(String difTodo) {
        this.difTodo.setText(difTodo);
    }

    public void setMain(MainWindowController mainWindowController) {
        this.main = mainWindowController;
    }
}
