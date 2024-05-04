package polymorphism;

public interface DBLogic {

    final int firstIndex=100; //final -- constant
    int lastIndex=200;

    public void save(); //declaration
    public void update();
    public void delete();
    public void find();
}
