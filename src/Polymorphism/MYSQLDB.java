package polymorphism;

public class MYSQLDB implements DBLogic {

    @Override
    public void save() {
        System.out.println("MYSQL save");
    }

    @Override
    public void update() {
        System.out.println("MYSQL update");
    }

    @Override
    public void delete() {
        System.out.println("MYSQL delete");
    }

    @Override
    public void find() {
        System.out.println("MYSQL find");
    }
    
    void test(){}
}
