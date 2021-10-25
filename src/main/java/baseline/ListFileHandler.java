package baseline;

import java.io.File;
import java.util.List;

public class ListFileHandler {

    //private File path
    //private List<ToDoList> list

    ListFileHandler(File path) {
        //this path = path
    }

    ListFileHandler(File path, List<ToDoList> list) {
        //this path = path
        //this list = list
    }

    public List<ToDoList> fileImport() {
        //List of ToDoLists importList = new ArrayList
        //Try to create a BufferedReader "reader" to read through the file provided
            //String line = ""

            //While line does not equal "§§":
                //line = reader.readLine()
                //ToDoList tempList = new ToDoList with constructor "line"
                //line = reader.readLine()

                //While line is not null or is not "§§":
                    //Array of strings "info" = line.split(line)
                    //New Item "item" = Item with constructors info[0], info[1], Boolean.parseBoolean(info[2])
                    //Add item to tempList.getItems
                    //line = reader.readLine()

                //Add tempList to importList

        //return importList
        return null;
    }

    public String fileExport() {
        //StringBuilder output = new StringBuilder
        //Try to create a FileWriter "writer" to write to the file provided
            //For each ToDoList item in list:
                //Append item to output
                //Append new line to output
        //Append "§§" to output
        //return String.valueOf(Output)
        return "";
    }

}
