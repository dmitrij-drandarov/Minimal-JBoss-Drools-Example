package com.drandarov.minimaldrools;

/**
 * @author dmitrij-drandarov
 * @since 27 Apr 17
 */
public class Customer {

    private String name;
    private int age;

    private boolean privateCustomer;

    private int countOrders;
    private int discountRate;

    public Customer() {}

    public Customer(String name, int age, boolean privateCustomer, int countOrders, int discountRate) {
        this.name = name;
        this.age = age;
        this.privateCustomer = privateCustomer;
        this.countOrders = countOrders;
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPrivateCustomer() {
        return privateCustomer;
    }

    public void setPrivateCustomer(boolean privateCustomer) {
        this.privateCustomer = privateCustomer;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getCountOrders() {
        return countOrders;
    }

    public void setCountOrders(int countOrders) {
        this.countOrders = countOrders;
    }

}
