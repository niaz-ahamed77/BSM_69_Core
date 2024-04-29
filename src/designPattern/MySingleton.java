package designPattern;

class Address{
    private int addressID;
    private String addressName;
    private static Address address;

    //getters and setters
    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    
    //static method used to implement singleton design pattern
    public static Address getInstance(){
        if(address ==null){
            address = new Address();
        }
        return address;
    }

}


public class MySingleton {
    public static void main(String[] args) {
        Address a= Address.getInstance();
        Address a1= Address.getInstance();
        Address a2= Address.getInstance();
        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}

