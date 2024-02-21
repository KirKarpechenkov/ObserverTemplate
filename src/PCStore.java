// PCStore interface that defines the methods for a PC Store.
public interface PCStore {
    // Method to register a new customer.
    void registerCustomer(Customer customer);
    // Method to unregister a customer.
    void unregisterCustomer(Customer customer);
    // Method to notify all registered customers about the current model.
    void notifyCustomers();
}