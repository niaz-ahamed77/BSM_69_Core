package exception;

public class ExceptionTest {
    
    public static void main(String[] args) {
        try{
            //Class.forName(""); //it is another way of creating instance using reflection API

            String str = null;
            System.out.println(str.length());
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            
        }

        System.out.println("Stuff after exception");
    }

}
