package springcloud.helloworld.model;

import java.io.Serializable;
import java.util.Date;

public class TUser implements Serializable {
    private Short id;

    private String name;

    private String gender;

    private Short age;

    private String address;

    private Date regdata;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getRegdata() {
        return regdata;
    }

    public void setRegdata(Date regdata) {
        this.regdata = regdata;
    }
}