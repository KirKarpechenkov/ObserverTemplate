// ConcreteCustomer class that implements the Customer interface.

public class ConcreteCustomer implements Customer {
    // Instance variable for storing the name of the customer
    private String name;

    //Constructor for the ConcreteCustomer class.
    public ConcreteCustomer(String name) {
        this.name = name;
    }

    //Method to get the name of the customer.

    @Override
    public String getName() {
        return this.name;
    }

    //Method to update the customer about a new model.
    //This method is called when a new model is added to the store.

    @Override
    public void update(String modelName) {
        System.out.println("Customer " + this.getName() + " has been notified about the new model: " + modelName);
    }
}