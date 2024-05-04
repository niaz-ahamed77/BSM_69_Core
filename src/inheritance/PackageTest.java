package inheritance;

import multipleInheritance.Employee;

public class PackageTest extends Employee{
    public static void main(String[] args) {
        //Employee employee = new Employee();
        
        PackageTest pt = new PackageTest();
        pt.printData();
    }
}
