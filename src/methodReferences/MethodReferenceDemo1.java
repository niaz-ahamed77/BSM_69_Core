package methodReferences;

public class MethodReferenceDemo1 {
    public static void main(String[] args) {
        // Display all records of customer
        CustomerDB.getAllCustomer().stream().forEach(customer -> System.out.println(customer)); //using lambda expression
        CustomerDB.getAllCustomer().stream().forEach(System.out::println);  // using method reference
        MethodReferenceDemo1 mf = new MethodReferenceDemo1();

        CustomerDB.getAllCustomer().stream().forEach(mf::display);

        CustomerDB.getAllCustomer().stream().map(customer -> CustomerMapper.convert(customer)).forEach(System.out::println);    // lambda
        CustomerDB.getAllCustomer().stream().map(CustomerMapper::convert).forEach(System.out::println); // method reference
        
        CustomerMapper cm = new CustomerMapper();   //because we're trying to call a non-static class
        CustomerDB.getAllCustomer().stream().map(cm::convert1).forEach(System.out::println);
        
        CustomerDB.getAllCustomer().stream().map(Customer::getName).forEach(System.out::println);
        // we can call only non-parameterized non-static method by the class name usin method reference
        // we couldn't use a setter method because it would require a paramater for eg.
        // parameterized non-static method called by reference name only






    }

    public void display(Customer customer){
        System.out.println(customer);
    }
}
