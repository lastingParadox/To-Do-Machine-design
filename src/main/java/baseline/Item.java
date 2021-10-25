/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Zander Preston
 */

package baseline;

import javafx.scene.control.CheckBox;

public class Item {

    //Add new private SimpleStringProperty description
    //Add new private SimpleStringProperty dueDate
    //Add new private Checkbox completed


    public Item(String description, String dueDate) {
        //This description is equal to a SimpleStringProperty description
        //This dueDate is equal to a SimpleStringProperty dueDate
        //completed = new CheckBox()
    }

    public Item(String description, String dueDate, boolean finished) {
        //This description is equal to a SimpleStringProperty description
        //This dueDate is equal to a SimpleStringProperty dueDate
        //completed = new CheckBox()
        //if finished is true:
            //completed.setSelected(true)
    }

    public String getDescription() {
        //return description.get()
        return "";
    }

    public String getDate() {
        //return dueDate.get()
        return "";
    }

    public CheckBox getCompleted() {
        //return completed
        return null;
    }

    public void setDescription(String description) {
        //this description.set(description)
    }

    public void setDate(String date) {
        //dueDate.set(date)
    }

}
