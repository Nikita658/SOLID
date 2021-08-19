package entity;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String firstName;
    private final String familyName;
    private final int ageInYears;
    @Getter
    private List<Order> orders;


    public Customer(String firstName, String familyName, int ageInYears) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.ageInYears = ageInYears;
        this.orders = new ArrayList<>();
    }
}