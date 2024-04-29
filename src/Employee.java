// POJO/Model/Entity class
public class Employee {
        int id;
        String name;
        String address;
        String mobileNo;
        static int totalEmployee;

        //constructors
        public Employee(int id, String name, String address, String mobileNo){ //parameterized constructor
            this.id = id;
            this.name = name;
            this.address = address;
            this.mobileNo = mobileNo;
        }

        public Employee(){ //non-parameterized constructor
            super();
        }

        //setters and getters
        public void setId(int id){
            this.id = id;
        }

        public int getID(){
            return id;
        }

        public void setName(String name){
            this.name = name;
        } 

        public String getName(){
            return name;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public String getAddress(){
            return address;
        }

        public void setMobileNo(String mobileNo){
            this.mobileNo = mobileNo;
        }

        public String getMobileNo(){
            return mobileNo;
        }

        public static int totalEmployee(){
            return totalEmployee++;
        }

}
