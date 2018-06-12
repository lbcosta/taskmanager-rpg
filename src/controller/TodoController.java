package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import persistence.AvatarDao;
import persistence.TodoDao;
import static Application.App.avatarUnico;
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

    private TodoDao todoDao;

    private AvatarDao avatarDao;

    @FXML
    public void initialize() {
        todoDao = new TodoDao();
        avatarDao = new AvatarDao();
    }


    public void checkTodo(ActionEvent actionEvent) {
        if(checkBoxTodo.isSelected()) {
            todoDao.check(null, true, nomeTodo.getText());
            avatarDao.buff(avatarUnico.getId());
        } else {
            todoDao.check(null, false, nomeTodo.getText());
            avatarDao.debuff(avatarUnico.getId());
        }

        avatarUnico = new AvatarDao().searchById(avatarUnico.getId());
        main.updateScreen();

    }

    public void deleteTodo(ActionEvent actionEvent) {
        TilePane tp = (TilePane) paneTodo.getParent();
        tp.getChildren().remove(paneTodo);
        avatarUnico.removeTask(nomeTodo.getText());
        todoDao.delete(nomeTodo.getText());
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
