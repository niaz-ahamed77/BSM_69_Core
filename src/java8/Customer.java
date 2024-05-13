package java8;

import java.util.List;

public class Customer {
    private Integer id; // can also use int but Integer would work better for the streams API
    private String name;
    private String email;
    private List<String> mobileNo;

    public Customer(){
        super();
    }

    public Customer(Integer id, String name, String email, List<String> mobileNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(List<String> mobileNo) {
        this.mobileNo = mobileNo;
    }

    


}
