package src.main.lessons.section2.visibility.package1;

public class OtherClass {
    public void method1(){
        ClassA classA = new ClassA();
        classA.publicMethod();
        classA.protectedMethod();
    }
    /*
     * Protected method is accessible from a different class in the same package.
     * However, it is not accessible from classes outside of that same package.
     */
}
