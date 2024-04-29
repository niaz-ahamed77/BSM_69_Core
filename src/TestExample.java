public class TestExample {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("Allen");
        e.setAddress("NY");
        e.setMobileNo("12345678");
        System.out.println(e.getID()+","+e.getName()+","+e.getAddress()+","+e.getMobileNo());

        Employee e1 = new Employee(102,"Black","NJ","56784320");
        System.out.println(e1.getID()+","+e1.getName()+","+e1.getAddress()+","+e1.getMobileNo());
    }
}
