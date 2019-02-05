import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Task> taskList = new ArrayList<>();

    public TodoList add(Task task) {
        taskList.add(task);
        return this;
    }

    public Task first() {
        return this.get(0);
    }

    public Task get(int index) {
        if(index >= this.size()){
            throw new IllegalArgumentException("Index not in list");
        }
        return taskList.get(index);
    }

    public int size() {
        return taskList.size();
    }

    public void clear() {
        taskList.clear();
    }
}
