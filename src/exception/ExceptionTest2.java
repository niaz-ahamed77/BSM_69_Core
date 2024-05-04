package exception;

public class ExceptionTest2 {
    public static void main(String[] args) {
        int result = print();
        System.out.println(result);
    }
    static int print(){
        try{
            return 0;
        } catch(Exception e){
            return 1;
        } finally{
            return 2;
        }
    }
}
