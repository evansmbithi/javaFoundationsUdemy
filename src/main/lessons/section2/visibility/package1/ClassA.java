package src.main.lessons.section2.visibility.package1;

public class ClassA {
    public void publicMethod(){
        System.out.println("This is the public method of ClassA");
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("This is a private method of ClassA");
    }

    protected void protectedMethod(){
        System.out.println("This is the protected method of ClassA");
    }
    /* A private method can only be accessed from other members of its own class, period.
     *
     */
}
