package inheritance;

class E {
    E() {
     System.out.println("E()"); 
     } 
     E(int i) { 
     
     System.out.println("E(int)"); 
     } }

class F extends E { 
    F() { 
    System.out.println("F()"); 
    } 
    F(int i) { 
    System.out.println("F(int)"); 
    } 
public static void main(String[] args) {
    System.out.println("---------");
    E e1=new E(10); 
    System.out.println("---------"); 
    System.out.println("---------"); 
    F f1=new F(10);
    } 
}
