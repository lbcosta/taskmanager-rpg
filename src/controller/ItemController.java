package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import model.*;

import static application.App.avatarUnico;

public class ItemController {

    @FXML
    private StackPane itemPane;

    @FXML
    private Label itemInt;

    @FXML
    private Label itemStr;

    @FXML
    private Label itemName;

    @FXML
    private ImageView itemImage;

    @FXML
    private Label itemAgi;

    @FXML
    private Label itemCon;

    @FXML
    private Button buyButton;

    @FXML
    private Label price;

    private MainWindowController main;

    private Dao dao;

    public ItemController() {
        dao = new Dao();
    }


    public void comprarItem(ActionEvent actionEvent) {
        int preco = Integer.parseInt(price.getText());
        if (avatarUnico.getCoins() >= preco) {
            int str = Integer.parseInt(itemStr.getText());
            int intl = Integer.parseInt(itemInt.getText());
            int agi = Integer.parseInt(itemAgi.getText());
            int con = Integer.parseInt(itemCon.getText());

            Status status = dao.buscar(Status.class, "id", avatarUnico.getId());
            status.setStrength(status.getStrength() + str);
            status.setIntelligence(status.getIntelligence() + intl);
            status.setAgility(status.getAgility() + agi);
            status.setConstitution(status.getConstitution() + con);
            dao.alterar(status, status.getId());


            avatarUnico.setCoins(avatarUnico.getCoins() - preco);
            dao.alterar(avatarUnico, avatarUnico.getId());

            Item itemDaLoja = dao.buscar(Item.class, "name", itemName.getText());

            ItemDoAvatar item = new ItemDoAvatar(avatarUnico.getId(), itemDaLoja.getId());

            dao.inserir(item); //Depois faz upload da UI e carrega todos os items do ItemDoAvatar

            main.updateScreen();
        }

    }

    public void alterButton() {
        int str = Integer.parseInt(itemStr.getText());
        int intl = Integer.parseInt(itemInt.getText());
        int agi = Integer.parseInt(itemAgi.getText());
        int con = Integer.parseInt(itemCon.getText());

        buyButton.setText("X");
        buyButton.setStyle("-fx-background-color: #990000");

        buyButton.setOnAction(e -> {
            Status status = dao.buscar(Status.class, "id", avatarUnico.getId());
            status.setStrength(status.getStrength() - str);
            status.setIntelligence(status.getIntelligence() - intl);
            status.setAgility(status.getAgility() - agi);
            status.setConstitution(status.getConstitution() - con);
            dao.alterar(status, status.getId());

            Item i = dao.buscar(Item.class, "name", itemName.getText());
            ItemDoAvatar item = dao.buscar(ItemDoAvatar.class, "itemId", i.getId());
            dao.excluir(ItemDoAvatar.class, item.getId());
            main.updateScreen();
        });
    }

    public void setMain(MainWindowController mainWindowController) {
        this.main = mainWindowController;
    }

    public void setItemInt(String itemInt) {
        this.itemInt.setText(itemInt);
    }

    public void setItemStr(String itemStr) {
        this.itemStr.setText(itemStr);
    }

    public void setItemName(String itemName) {
        this.itemName.setText(itemName);
    }

    public void setItemImage(Image itemImage) {
        this.itemImage.setImage(itemImage);
    }

    public void setItemAgi(String itemAgi) {
        this.itemAgi.setText(itemAgi);
    }

    public void setItemCon(String itemCon) {
        this.itemCon.setText(itemCon);
    }

    public void setPrice(String price) {
        this.price.setText(price);
    }
}
