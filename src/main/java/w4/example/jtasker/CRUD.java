package w4.example.jtasker;

import javafx.collections.ObservableList;

import java.sql.SQLException;


public interface CRUD {
    ObservableList<Task> getAllTasks(String searchString);
    private void putTask() {}
    private void searchById() {}
    private void deleteById() {}
}

