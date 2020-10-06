package org.example.commonsample.hash;

/**
 * @Description: Pig
 * @Author: gedachao
 * @Date: 2020-09-30 16:46
 * @Version 1.0
 */
public class Pig {
    private String name;
    private String address;

    public Pig(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Pig() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
