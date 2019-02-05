import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TodoListTest {

    TodoList testedTodoList = new TodoList();

    @BeforeMethod
    public void setUp() {
        testedTodoList.clear();
        testedTodoList
                .add(new Task("task 1"))
                .add(new Task("task 2"))
                .add(new Task("task 3"));

    }

    @Test
    public void testFirst() {
        Task first = testedTodoList.first();
        assertEquals(first.name, "task 1");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetIllegalArgument() {
        Task task = testedTodoList.get(5);
    }
}