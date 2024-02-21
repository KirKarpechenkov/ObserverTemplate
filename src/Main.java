public class Main {
    public static void main(String[] args) {
        ConcretePCStore store = new ConcretePCStore();
        Customer customer1 = new ConcreteCustomer("Alice");
        Customer customer2 = new ConcreteCustomer("Bob");

        store.registerCustomer(customer1);
        store.registerCustomer(customer2);

        store.addNewModel("Model 1");  // Notify all registered customers about the new model
        store.unregisterCustomer(customer1);
        store.addNewModel("Model 2");  // Now, only Bob will be notified
    }
}


// git config --global user.name "KirKarpechenkov" git config --global user.email 230600@astanait.edu.kz