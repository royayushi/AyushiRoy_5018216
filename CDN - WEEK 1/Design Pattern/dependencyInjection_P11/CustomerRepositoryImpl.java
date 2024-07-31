package dependencyInjection_P11;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        // In a real application, this would interact with a database.
        // For this example, a mock customer is being returned.
        return "Customer with ID: " + id;
    }
}

