package dependencyInjection_P11;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Creating an instance of CustomerRepositoryImpl
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Injecting CustomerRepository into CustomerService via constructor
        CustomerService customerService = new CustomerService(customerRepository);

        // Using CustomerService to find and print customer details
        customerService.printCustomerDetails("12345");
    }
}

