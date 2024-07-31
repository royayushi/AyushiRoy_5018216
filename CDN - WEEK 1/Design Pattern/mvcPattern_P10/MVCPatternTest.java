package mvcPattern_P10;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Creating a student model
        Student student = new Student("John Doe", "S12345", "A");

        // Creating a view
        StudentView view = new StudentView();

        // Creating a controller
        StudentController controller = new StudentController(student, view);

        // Updating and displaying student details
        controller.updateView();

        // Updating student details through the controller
        controller.setStudentName("Jane Smith");
        controller.setStudentId("S67890");
        controller.setStudentGrade("B");

        // Displaying updated student details
        controller.updateView();
    }
}

