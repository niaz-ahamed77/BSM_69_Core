package exception;

public class ExceptionTest3 {
    public static void main(String[] args) {
        //arithmetic exception
        int x=10/0;
        System.out.println(x);

        // null pointer exception
        String str=null;
        System.out.println(str.length());

        // arrayindexoutofbounds
        int arr[]= {1,2,3,4};
        System.out.println(arr[5]); 

        // numberFormatException
        String x = "abc";
        int result = Integer.parseInt(x); //converts String to Integer, but errors if it's going from char to number
        System.out.println(result);
    }



}
