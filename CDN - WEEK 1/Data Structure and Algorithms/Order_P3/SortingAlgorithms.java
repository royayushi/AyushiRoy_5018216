package Order_P3;
import java.util.Scanner;

public class SortingAlgorithms {
	public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }
	
	public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        Order pivot = orders[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot.getTotalPrice()) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of orders:");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for order " + (i + 1) + ":");
            System.out.print("Order ID: ");
            String orderId = scanner.nextLine();
            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine();
            System.out.print("Total Price: ");
            double totalPrice = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            orders[i] = new Order(orderId, customerName, totalPrice);
        }

        System.out.println("Choose sorting method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        int choice = scanner.nextInt();

        System.out.println("Before Sorting:");
        for (Order order : orders) {
            System.out.println(order);
        }

        if (choice == 1) {
            bubbleSort(orders);
            System.out.println("\nAfter Bubble Sort:");
        } else if (choice == 2) {
            quickSort(orders, 0, orders.length - 1);
            System.out.println("\nAfter Quick Sort:");
        } else {
            System.out.println("Invalid choice.");
        }

        for (Order order : orders) {
            System.out.println(order);
        }

        scanner.close();
    }
    
    /*
     
     Without user input:
     
     public static void main(String[] args) {
        Order[] orders = {
            new Order("001", "Alice", 250.0),
            new Order("002", "Bob", 300.0),
            new Order("003", "Charlie", 150.0),
            new Order("004", "David", 500.0)
        };

        System.out.println("Before Sorting:");
        for (Order order : orders) {
            System.out.println(order);
        }

        bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
        
        System.out.println("Before Sorting:");
        for (Order order : orders) {
            System.out.println(order);
        }

        quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }

     
     */
}

