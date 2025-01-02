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

//    public static void main(String[] args) {
//        Cat cat1 = new Cat("mojo", LocalDate.now());
//        System.out.println(cat1);
//    }
}
