package src.main.java.model;

import java.time.LocalDate;


public class Main {
    private String middleName = "Mbithi";

    public void myTestMethod(){
        var me = "evans";
        String jesus = "Jesus";
    }

    public char getMiddleInitial (){
        return middleName.charAt(0);
    }
    public static void main(String[] args) {
        Person evans = new Person("evans","mbithi", LocalDate.of(1998,8,14));
        Person terry = new Person("Terry","Kendi",LocalDate.of(1999,3,13));

        Cat mojo = new Cat("mojo",LocalDate.of(2016,8,18));
        Address address = new Address("Ngara","Nairobi","Nairobi");
        evans.setSpouse(terry);
        evans.setPet(mojo);
        evans.setAddress(address);

        System.out.println(evans);

        Main main = new Main();


        System.out.println(main.getMiddleInitial());


    }


}
