package designPatternBuilder;

public class Shop {
    public static void main(String[] args) {
        
        Phone phone1 = new PhoneBuilder().setOs("Android OS").setCamera(20).build();
        Phone phone2 = new PhoneBuilder().setOs("Apple OSX").setBattery(5000).build();
        Phone phone3 = new PhoneBuilder().setOs("Android OS").setBattery(5000).setCamera(20).build();
        Phone phone4 = new PhoneBuilder().setOs("Nokia OS").setScreenSize(6).build();
        
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);
        
    }
}


