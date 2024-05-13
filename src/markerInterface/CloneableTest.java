package markerInterface;

class My implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class CloneableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        My m1 = new My();
        My m2 = (My) m1.clone();    //clone is a method of object class
        
        System.out.println(m1.hashCode() + "," + m2.hashCode());
    }
}


