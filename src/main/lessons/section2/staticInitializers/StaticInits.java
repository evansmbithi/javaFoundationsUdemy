package src.main.lessons.section2.staticInitializers;

public class StaticInits {
    public static int[] nums;

    static {
        nums = new int[5];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
    }

    public static int[] nums2 = intNums();

    public static int[] intNums(){
        int[] nums = new int[5];
        nums[0]=11;
        nums[1]=12;
        nums[2]=31;
        nums[3]=41;
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(nums.length); //5
        System.out.println(nums[1]); //2
        System.out.println(nums2[3]); //41
    }
}
