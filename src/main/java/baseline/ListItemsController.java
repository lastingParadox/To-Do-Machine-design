/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Zander Preston
 */

package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ListItemsController {

    @FXML
    private Button addItemButton;

    @FXML
    private TableColumn<Item, CheckBox> checkboxColumn;

    @FXML
    private TableColumn<Item, String> dateColumn;

    @FXML
    private TextField dateField;

    @FXML
    private Button deleteItemButton;

    @FXML
    private Button deleteListButton;

    @FXML
    private TableColumn<Item, String> descriptionColumn;

    @FXML
    private TextField descriptionField;

    @FXML
    private Label itemCountLabel;

    @FXML
    private TableView<Item> itemTable;

    @FXML
    private TextField listNameField;

    @FXML
    private Button saveListButton;

    //Create private ToDoList list
    //Create private String date
    //Create private dateValidate = false

    @FXML
    public void initialize() {
        //listNameField.getText(list.getTitle())
        //ObservableList "itemList" of items = list.getItems()

        //setCellValueFactory of descriptionColumn to a new PropertyValueFactory ("description")
        //setCellValue Factory of dateColumn to new PropertyValueFactory ("dueDate")

        //Add both columns to listTable
        //itemTable.getItems().addAll(itemList)
    }

    @FXML
    public void editListName(ActionEvent event) {
        //String name = listNameField.getText()
        //If name is less than three characters:
            //listNameField.setText("")
            //Alert invalidName = new Alert (Type Error)
            //Set invalidName's content text = "A list name must be at least 3 characters"
            //invalidName.show()
            //return
        //list.setTitle(name)
    }

    @FXML
    public void editItemDate(ActionEvent event) {
        //date = event.getNewValue()
        //If date does not match the regEx /^\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$/:
            //set dateCell text to event.getOldValue()
            //Alert invalidName = new Alert (Type Error)
            //Set invalidName's content text = "A list name must be greater than 3 characters"
            //invalidName.show()
            //return
        //Set the CellFactory of dateColumn based on editing the item date column:
            //(Lambda expression) CellEditEvent<Item, String> t ->
                //Get the items in t.tableView
                    //Get the position and row of the item
                        //setDate(t.getNewValue)
    }

    @FXML
    public void editItemDescription(ActionEvent event) {
        //Set the CellFactory of descriptionColumn based on editing the item description column:
            //(Lambda expression) CellEditEvent<Item, String> t ->
                //Get the items in t.tableView
                    //Get the position and row of the item
                    //setDescription(t.getNewValue)
    }

    @FXML
    public void onAddItemClicked(ActionEvent event) {
        //validateDateField()
        //Item temp = new Item with constructors "descriptionField.getText()" and "dateField.getText()"
        //list.getItems().add(temp)
        //ObservableList "itemList" of items = list.getItems()
        //itemTable.getItems().addAll(itemList)
        //itemTable.refresh()
    }

    @FXML
    public void onDeleteItemClicked(ActionEvent event) {
        //Item removed = Item selected on itemTable (itemTable.getSelectionModel().getSelectedItem())
        //list.getItems().remove(removed)
        //ObservableList "itemList" of items = list.getItems()
        //itemTable.getItems().addAll(itemList)
        //itemTable.refresh()
    }

    @FXML
    public void onDeleteListClicked(ActionEvent event) {
        //Parent root set to loader.load() ("listItems.fxml")

        //Create new applicationController appController set to loader.getController()
        //appContoller.removeList(list)

        //Stage stage is a new stage()
        //stage.setScene(new Scene(root))
        //stage.setTitle("Editing 'listName')
        //stage.show()
        //stage = (Stage) saveListButton.getScene().getWindow
        //Close the current stage
    }

    @FXML
    public void onSaveListClicked(ActionEvent event) {

        //Parent root set to loader.load() ("listItems.fxml")

        //Create new applicationController appController set to loader.getController()
        //appContoller.addNewList(list)

        //Stage stage is a new stage()
        //stage.setScene(new Scene(root))
        //stage.setTitle("Editing 'listName')
        //stage.show()
        //stage = (Stage) saveListButton.getScene().getWindow
        //Close the current stage
    }

    @FXML
    public void validateDateField(ActionEvent event) {
        //date = dateField.getText()
        //If date does not match the regEx /^\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$/:
            //set dateField text to ""
            //Alert invalidName = new Alert (Type Error)
            //Set invalidName's content text = "A list name must be greater than 3 characters"
            //invalidName.show()
            //dateValidate = false
            //return
        //dateValidate = true
    }

    public void addList(ToDoList temp) {
        //list = temp
    }

    //Methods for Unit Testing below

    public ToDoList getList() {
        //return list
        return null;
    }

    public TextField getDateField() {
        //return dateField
        return null;
    }

    public TextField getListNameField() {
        //return listNameField
        return null;
    }

}
