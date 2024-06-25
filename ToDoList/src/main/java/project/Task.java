package project;

public class Task {
    private String description;
    private boolean complete;

    public Task(String description) {
        this.description = description;
        this.complete = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void markTaskComplete() {
        this.complete = true;
    }

    @Override
    public String toString() {
        return description + " [" + (this.complete ? "Completed" : "Pending") + "]";
    }
}
