package markerInterface;

public class DeletableTest {
    
    public boolean delete (Object object){
        if (!(object instanceof Deletable)){    // if object is not an instance of Deletable 
            return true;
        }

        // delete implementation details
        return false;
    }

    public static void main(String[] args) {
        Deletable d1 = new Entity();
        Deletable d2 = new Entity1();
        Entity2 d3 = new Entity2();
        DeletableTest sd = new DeletableTest();

        if (sd.delete(d1)){
            System.out.println("if body");
        } else {
            System.out.println("Else body");
        }
    }
}
