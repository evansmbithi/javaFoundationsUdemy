package src.main.lessons.section2.visibility.package2;

import src.main.lessons.section2.visibility.package1.ClassA;
/* Classes that are in packages other than where you're coding
 * have to be imported.
 * To be able to access ClassA or use anything from ClassA,
 * I must first import classA
 */

public class ClassB extends ClassA{
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.publicMethod();
    }
}
