/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Zander Preston
 */

package baseline;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ApplicationController {

    @FXML
    private Button createToDoButton;

    @FXML
    private Button exportButton;

    @FXML
    private MenuItem exportMenu;

    @FXML
    private Button importButton;

    @FXML
    private MenuItem importMenu;

    @FXML
    private TableView<ToDoList> listTable;

    @FXML
    private TableColumn<ToDoList, String> listTitleColumn;

    @FXML
    private TextField newListField;

    @FXML
    private Button removeToDoButton;

    @FXML
    private TableColumn<ToDoList, CheckBox> selectListColumn;

    @FXML
    private Label selectedListCounter;

    //Create new private ObservableList of ToDoLists "lists"
    //Create new private boolean nameValidate = false

    @FXML
    public void initialize() {
        //setCellValueFactory of selectListColumn to a new PropertyValueFactory ("select")
        //setCellValue Factory of listTitleColumn to new PropertyValueFactory ("title")

        //Add both columns to listTable
        //listTable.getItems().addAll(lists)
    }

    @FXML
    void onSelectList(ActionEvent event) {
        //Integer counter = 0
        //For each ToDoList item in lists:
            //If item.getSelect.isSelected = true:
                //counter++
        //selectedListCounter.setText("Number of Selected Lists: " + counter)
    }

    @FXML
    void onExportButtonClicked(ActionEvent event) {
        //New FileChooser fileExport
        //fileExport.setTitle("Export To Do List File")
        //New File "path" is equal to fileExport save dialog (fileExport.showSaveDialog(stage))
        //New list of ToDoLists "selectedLists"
        //For each ToDoList item in lists:
            //If item.getSelect.isSelected = true:
                //selectedLists.add(item)
        //New ListFileHandler fileHandler is made with constructors "path" and "selectedLists"
        //fileHandler.fileExport()
    }

    @FXML
    void onImportButtonClicked(ActionEvent event) {
        //New FileChooser fileImport
        //fileImport.setTitle("Select To Do List File")
        //New File "path" is equal to fileImport dialog (fileImport.showOpenDialog(stage))
        //New ListFileHandler fileHandler is made with constructor "path"
        //lists = fileHandler.fileImport()
        //listTable.getItems().addAll(lists)
        //listTable.refresh()
    }

    @FXML
    public void onNewListName(ActionEvent event) {
        //listName is the text gotten from newListField
        //If listName's length is less than 3 characters:
            //newListField's text is set to ""
            //Alert invalidName = new Alert (Type Error)
            //Set invalidName's content text = "A list name must be at least 3 characters"
            //invalidName.show()
            //nameValdate = false
            //return
        //nameValidate = true
    }

    @FXML
    void onRemoveButtonClicked(ActionEvent event) {
        //For each ToDoList item in lists:
            //If item.getSelect.isSelected = true:
                //Remove the item from lists
        //listTable.getItems().addAll(lists)
        //listTable.refresh()
    }

    @FXML
    public void onCreateListButtonClicked(ActionEvent event) {
        //onNewListName()
        //if nameValidate = false:
            //Alert invalidName = new Alert (Type Error)
            //Set invalidName's content text = "A list name must be at least 3 characters"
            //invalidName.show()
            //return
        //Create new ToDoList temp with constructor listName

        //Parent root set to loader.load() ("listItems.fxml")

        //Create new ListItemsController listController set to loader.getController()
        //listItemsContoller.addList(temp)

        //Stage stage is a new stage()
        //stage.setScene(new Scene(root))
        //stage.setTitle("Editing 'listName')
        //stage.show()
    }

    public void addNewList(ToDoList temp) {
        //add temp to lists
        //listTable.getItems().addAll(lists)
        //listTable.refresh()
    }

    public void removeList(ToDoList temp) {
        //remove temp from lists
        //listTable.getItems().addAll(lists)
        //listTable.refresh()
    }

    public ObservableList<ToDoList> getList() {
        //return lists
        return null;
    }

    public void setList(ObservableList<ToDoList> newList) {
        //lists = newList
    }
}
