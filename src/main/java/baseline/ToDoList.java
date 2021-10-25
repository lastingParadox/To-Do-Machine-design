/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Zander Preston
 */

package baseline;

import javafx.scene.control.CheckBox;

import java.util.List;

public class ToDoList {

    //private SimpleStringProperty title
    //private CheckBox select
    //private List of Items items = new ArrayList

    ToDoList(String title) {
        //this title = new SimpleStringProperty of title
        //this select = new Checkbox
    }

    ToDoList(String title, List<Item> items) {
        //Overloaded method, used for loading in from txt file
        //this title = new SimpleStringProperty of title
        //select = new Checkbox
        //this items = items
    }

    public String getTitle() {
        //return title
        return "";
    }

    public CheckBox getSelect() {
        //return select
        return null;
    }

    public List<Item> getItems() {
        //return items
        return null;
    }

    public void setTitle(String title) {
        //this title.set(title)
    }

    public void setItems(List<Item> items) {
        //this items = items
    }

    public int getNumberOfItems() {
        //return items.size()
        return 0;
    }

    @Override
    public String toString() {
        //Overridden toString() method used in exporting to a text file
        //StringBuilder output = new StringBuilder
        //Append title + new line to output
        //For each item in items:
            //Append "description||dueDate||completed" + new line to output
                //The "or operators" will act as delimiters.
        return "";
    }

}
