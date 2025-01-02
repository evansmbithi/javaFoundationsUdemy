package src.main.lessons.section2.varargs;

public class Varargs {
    public static double PI = 3.14;
    public void var_arrays (int x, int y, String[] words){
        System.out.println(x +" "+ words[2]);
    }

    public static void var_args (int x, int y, String... words){
        System.out.println(y +" "+ words[0]);
    }

    public static void main(String[] args) {
        Varargs vargs = new Varargs();
        String[] array = new String[] {"evans", "terry","etc"};
        vargs.var_arrays(1,2,array);
//        vargs.var_args(3,4,"evans", "terry","etc");
        var_args(3,4,"evans", "terry","etc");
        System.out.println(PI);
    }
}
