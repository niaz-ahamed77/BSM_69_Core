package inheritance;

public class Test {
    public static void main(String[] args) {

        ContractEmployee ce = new ContractEmployee();
        ce.setId(101);
        ce.setName("Allen");
        ce.setAddress("NY");
        ce.setMobileNo("129087654");
        ce.setNoOfHours(4);
        System.out.println(ce.getId()+","+ce.getName()+","+ce.getAddress()+","+ce.getMobileNo()+","+ce.getNoOfHours());

        HR hr = new HR();
        hr.setId(102);
        hr.setName("Black");
        hr.setAddress("NY");
        hr.setMobileNo("19087654");
        hr.setManageResource("Irfan");
        System.out.println(hr.getId()+","+hr.getName()+","+hr.getAddress()+","+hr.getMobileNo()+","+hr.getManageResource());


        RegularEmployee re = new RegularEmployee();
        re.setId(103);
        re.setName("James");
        re.setAddress("NJ");
        re.setMobileNo("1908765467");
        re.setMonthlySalary(2346);
        System.out.println(re.getId()+","+re.getName()+","+re.getAddress()+","+re.getMobileNo()+","+re.getMonthlySalary());
    }
}
