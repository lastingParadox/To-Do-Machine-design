package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListItemsControllerTest {

    @Test
    void validateDateFieldTest() {
        //Create new ListItemsController test
        //Set the text of test's date field to "Test"
        //test.validateDateField()
        //assertTrue(test.getDateField.getText() == "")
    }

    @Test
    void addListTest() {
        //Create new ListItemsController test
        //Create new ToDoList expected with constructor "Title"
        //test.addList(expected)
        //assertEquals(expected, test.getList())
    }

    @Test
    void onDeleteItemClickedTest() {
        //Create new ListItemsController test
        //Create new ToDoList toDoTest with constructor "Title"
        //Create new Item itemTest with constructors "Test" and "Title"

        //toDoTest.getItems().add(ItemTest)
        //test.addList(toDoTest)
        //Simulate selecting itemTest
        //test.onDeleteItemClickedTest()
        //List of Items actual = toDoTest.getItems()

        //List of Items expected is an empty list
        //assertEquals(expected, actual)
    }

    @Test
    void onAddItemClickedTest() {
        //Create new ListItemsController test
        //Create new ToDoList toDoTest with constructor "Title"
        //Create new Item itemTest with constructors "Test" and "Title"

        //test.addList(toDoTest)
        //Simulate adding itemTest
        //test.onAddItemClickedTest()
        //List of Items actual = toDoTest.getItems()

        //List of Items expected is a list with only itemTest
        //assertEquals(expected, actual)
    }

    @Test
    void editListNameTest() {
        //Create new ListItemsController test
        //Create new ToDoList toDoTest with constructor "Title"

        //test.getListNameField().setText("Test")
        //test.editListNameTest()

        //assertTrue toDoTest.getTitle() == "Test"
    }
}