package exception;

public class ExceptionTest7 {
    public static void main(String[] args) {
        int age = -1;
        if (age<=0){
            throw new AgeNonNegativeException("Age can't be negative or zero");
        }
        System.out.println("Your age = " + age);
    }
}
