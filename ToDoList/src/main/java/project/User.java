package project;

public class User {
    private String name;
    private TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    public void addTask(String description) {
        Task task = new Task(description);
        taskList.addTask(task);
    }

    public void markTaskAsComplete(int index) {
        this.taskList.markTaskAsCompleted(index);
    }

    public void printAllTasks() {
        this.taskList.printTasks();
    }
}
