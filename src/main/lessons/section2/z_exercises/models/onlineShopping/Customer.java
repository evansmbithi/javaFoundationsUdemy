package src.main.lessons.section2.z_exercises.models.onlineShopping;

public class Customer {
    private String firstName;
    private String lastName;
    private Address address;
    private Order order;

    public Customer(String firstName, String lastName, Address address, Order order) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.order = order;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "\"customer\":{" +
                "\"firstName\":\"" + firstName + "\", " +
                "\"lastName\":\"" + lastName + "\", " +
                "\"address\":" + address + ", " +
                "\"order\":" + order +
                "}";
    }
}
