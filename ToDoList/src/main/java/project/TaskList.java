package project;

public class TaskList {
    private Node head;

    public TaskList() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskAsCompleted(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                current.task.markTaskComplete();
                return;
            }
            count++;
            current = current.next;
        }
        System.out.println("Task not found.");
    }

    public void printTasks() {
        Node current = head;
        int count = 0;
        while (current != null) {
            System.out.println(count + ": " + current.task);
            current = current.next;
            count++;
        }
    }
}
