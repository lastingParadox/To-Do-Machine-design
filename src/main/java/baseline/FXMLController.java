package baseline;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem aboutMenu;

    @FXML
    private Button addItemButton;

    @FXML
    private Button createToDoButton;

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private Button deleteItemButton;

    @FXML
    private Button deleteListButton;

    @FXML
    private TableColumn<?, ?> descriptionColumn;

    @FXML
    private TableColumn<?, ?> doneColumn;

    @FXML
    private Button exportButton;

    @FXML
    private MenuItem exportMenu;

    @FXML
    private Button importButton;

    @FXML
    private MenuItem importMenu;

    @FXML
    private Label itemCount;

    @FXML
    private TableView<?> itemTable;

    @FXML
    private ListView<?> listTable;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private Button removeToDoButton;

    @FXML
    private Button saveListButton;

    @FXML
    void initialize() {
        assert aboutMenu != null : "fx:id=\"aboutMenu\" was not injected: check your FXML file 'scene.fxml'.";
        assert addItemButton != null : "fx:id=\"addItemButton\" was not injected: check your FXML file 'scene.fxml'.";
        assert createToDoButton != null : "fx:id=\"createToDoButton\" was not injected: check your FXML file 'scene.fxml'.";
        assert dateColumn != null : "fx:id=\"dateColumn\" was not injected: check your FXML file 'scene.fxml'.";
        assert deleteItemButton != null : "fx:id=\"deleteItemButton\" was not injected: check your FXML file 'scene.fxml'.";
        assert deleteListButton != null : "fx:id=\"deleteListButton\" was not injected: check your FXML file 'scene.fxml'.";
        assert descriptionColumn != null : "fx:id=\"descriptionColumn\" was not injected: check your FXML file 'scene.fxml'.";
        assert doneColumn != null : "fx:id=\"doneColumn\" was not injected: check your FXML file 'scene.fxml'.";
        assert exportButton != null : "fx:id=\"exportButton\" was not injected: check your FXML file 'scene.fxml'.";
        assert exportMenu != null : "fx:id=\"exportMenu\" was not injected: check your FXML file 'scene.fxml'.";
        assert importButton != null : "fx:id=\"importButton\" was not injected: check your FXML file 'scene.fxml'.";
        assert importMenu != null : "fx:id=\"importMenu\" was not injected: check your FXML file 'scene.fxml'.";
        assert itemCount != null : "fx:id=\"itemCount\" was not injected: check your FXML file 'scene.fxml'.";
        assert itemTable != null : "fx:id=\"itemTable\" was not injected: check your FXML file 'scene.fxml'.";
        assert listTable != null : "fx:id=\"listTable\" was not injected: check your FXML file 'scene.fxml'.";
        assert nameColumn != null : "fx:id=\"nameColumn\" was not injected: check your FXML file 'scene.fxml'.";
        assert removeToDoButton != null : "fx:id=\"removeToDoButton\" was not injected: check your FXML file 'scene.fxml'.";
        assert saveListButton != null : "fx:id=\"saveListButton\" was not injected: check your FXML file 'scene.fxml'.";

    }

}
