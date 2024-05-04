package collection;

public class Employee {
    private Integer id;
    private String name;
    private Float salary;
    private String address;

    //constructors
    public Employee(){
        super();
    }
    

    public Employee(Integer id, String name, Float salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }


    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
    }


    @Override
    public int hashCode() {
        System.out.println("HashCode() was called");
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() was called");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary == null) {
            if (other.salary != null)
                return false;
        } else if (!salary.equals(other.salary))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        return true;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Finalize() called from Employee.java");
    }
    
    // public String toString(){
    //     return "Employee: "
    // }
    
}
