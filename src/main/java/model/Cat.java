package src.main.java.model;

import java.time.LocalDate;

public class Cat extends Pet{
    public Cat(String name, LocalDate dob) {
        super(name, dob);
    }

    @Override
    public String toString() {
        return "Cat - Name: Tony";
    }

}
