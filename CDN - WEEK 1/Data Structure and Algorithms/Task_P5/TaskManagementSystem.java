package Task_P5;
import java.util.Scanner;

class Node {
    Task data;
    Node next;

    public Node(Task data) {
        this.data = data;
        this.next = null;
    }
}

public class TaskManagementSystem {
    private Node head;

    public TaskManagementSystem() {
        head = null;
    }

    // Adding task to the end of the list
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

    // Searching task by taskId
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.data.getTaskId().equals(taskId)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // Traversing tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Deleting task by taskId
    public void deleteTask(String taskId) {
        if (head == null) {
            return;
        }

        if (head.data.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && !current.data.getTaskId().equals(taskId)) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        } else {
            System.out.println("Task with ID " + taskId + " not found.");
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem system = new TaskManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Traverse Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Task Status: ");
                    String status = scanner.nextLine();

                    system.addTask(new Task(id, name, status));
                    break;
                case 2:
                    System.out.print("Enter Task ID to Search: ");
                    id = scanner.nextLine();
                    Task task = system.searchTask(id);
                    if (task != null) {
                        System.out.println(task);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                    system.traverseTasks();
                    break;
                case 4:
                    System.out.print("Enter Task ID to Delete: ");
                    id = scanner.nextLine();
                    system.deleteTask(id);
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

/*

Output:

1. Add Task
2. Search Task
3. Traverse Tasks
4. Delete Task
5. Exit
1
Enter Task ID: T001
Enter Task Name: Reading
Enter Task Status: On-going
1. Add Task
2. Search Task
3. Traverse Tasks
4. Delete Task
5. Exit
1
Enter Task ID: T010
Enter Task Name: Writing
Enter Task Status: Pending
1. Add Task
2. Search Task
3. Traverse Tasks
4. Delete Task
5. Exit
1
Enter Task ID: T005
Enter Task Name: Crocheting
Enter Task Status: On-going
1. Add Task
2. Search Task
3. Traverse Tasks
4. Delete Task
5. Exit
2
Enter Task ID to Search: T010
Task [taskId=T010, taskName=Writing, status=Pending]
1. Add Task
2. Search Task
3. Traverse Tasks
4. Delete Task
5. Exit
3
Task [taskId=T001, taskName=Reading, status=On-going]
Task [taskId=T010, taskName=Writing, status=Pending]
Task [taskId=T005, taskName=Crocheting, status=On-going]
1. Add Task
2. Search Task
3. Traverse Tasks
4. Delete Task
5. Exit
4
Enter Task ID to Delete: T010
1. Add Task
2. Search Task
3. Traverse Tasks
4. Delete Task
5. Exit
3
Task [taskId=T001, taskName=Reading, status=On-going]
Task [taskId=T005, taskName=Crocheting, status=On-going]
1. Add Task
2. Search Task
3. Traverse Tasks
4. Delete Task
5. Exit
5

*/