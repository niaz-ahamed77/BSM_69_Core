package designPattern.factory;

public class Contract implements Employee{

    @Override
    public void work() {
        System.out.println("Software Employee");
    }
    
}
