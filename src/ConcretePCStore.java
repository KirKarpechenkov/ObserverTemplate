import java.util.List;
import java.util.ArrayList;

//ConcretePCStore class that implements the PCStore interface.

public class ConcretePCStore implements PCStore {
    // List to store the registered customers
    private List<Customer> customers = new ArrayList<>();
    // String to store the name of the current model
    private String modelName;

    //Method to register a new customer.
    @Override
    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    //Method to unregister a customer.

    @Override
    public void unregisterCustomer(Customer customer) {
        customers.remove(customer);
    }

    //Method to notify all registered customers about the current model.

    @Override
    public void notifyCustomers() {
        for (Customer customer : customers) {
            customer.update(modelName);
        }
    }

    //Method to add a new model.

    public void addNewModel(String modelName) {
        this.modelName = modelName;
        notifyCustomers();
    }
}