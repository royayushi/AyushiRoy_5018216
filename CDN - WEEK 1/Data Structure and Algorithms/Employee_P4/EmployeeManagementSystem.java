package Employee_P4;

import java.util.Scanner;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Employee array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Traverse Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    system.addEmployee(new Employee(id, name, position, salary));
                    break;
                case 2:
                    System.out.print("Enter Employee ID to Search: ");
                    id = scanner.nextLine();
                    Employee emp = system.searchEmployee(id);
                    if (emp != null) {
                        System.out.println(emp);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 3:
                    system.traverseEmployees();
                    break;
                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    id = scanner.nextLine();
                    system.deleteEmployee(id);
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

1. Add Employee
2. Search Employee
3. Traverse Employees
4. Delete Employee
5. Exit
1
Enter Employee ID: 123
Enter Employee Name: ABC
Enter Employee Position: L2
Enter Employee Salary: 60000
1. Add Employee
2. Search Employee
3. Traverse Employees
4. Delete Employee
5. Exit
1
Enter Employee ID: 465
Enter Employee Name: SVG
Enter Employee Position: L1
Enter Employee Salary: 45000
1. Add Employee
2. Search Employee
3. Traverse Employees
4. Delete Employee
5. Exit
1
Enter Employee ID: 654
Enter Employee Name: RTH
Enter Employee Position: L8
Enter Employee Salary: 300000
1. Add Employee
2. Search Employee
3. Traverse Employees
4. Delete Employee
5. Exit
2
Enter Employee ID to Search: 123
Employee [employeeId=123, name=ABC, position=L2, salary=60000.0]
1. Add Employee
2. Search Employee
3. Traverse Employees
4. Delete Employee
5. Exit
3
Employee [employeeId=123, name=ABC, position=L2, salary=60000.0]
Employee [employeeId=465, name=SVG, position=L1, salary=45000.0]
Employee [employeeId=654, name=RTH, position=L8, salary=300000.0]
1. Add Employee
2. Search Employee
3. Traverse Employees
4. Delete Employee
5. Exit
4
Enter Employee ID to Delete: 465
1. Add Employee
2. Search Employee
3. Traverse Employees
4. Delete Employee
5. Exit
3
Employee [employeeId=123, name=ABC, position=L2, salary=60000.0]
Employee [employeeId=654, name=RTH, position=L8, salary=300000.0]
1. Add Employee
2. Search Employee
3. Traverse Employees
4. Delete Employee
5. Exit
5

*/
