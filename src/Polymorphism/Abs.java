package polymorphism;

public abstract class Abs {
    
    int firstIndex;
    int lastIndex;

    public Abs(){
        // constructor
    }

    

    public Abs(int firstIndex, int lastIndex) {
        super();
        this.firstIndex = firstIndex;
        this.lastIndex = lastIndex;
    }



    abstract void test();   //abstract method

    void test1(){ //concrete method - 
        System.out.println(firstIndex + "," + lastIndex);
    }
}


