package Polymorphism;

public class MongoDBImpl implements DBLogic{
    @Override
    public void save() {
        //firstIndex = 100;
        System.out.println("Mongo save");
    }

    @Override
    public void update() {
        System.out.println("Mongo update");
    }

    @Override
    public void delete() {
        System.out.println("Mongo delete");
    }

    @Override
    public void find() {
        System.out.println("Mongo find");
    }
    
}
