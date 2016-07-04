package dayOne;

/**
 * Created by Student on 27/06/2016.
 */
public class ArrayExercise {

    public static void main (String[] args) {
        int[] test = {1, 2, 1, 2};
        int[] test2 = {10, 3, 5, 6};
        int[] test3 = {1, 2, 3};
        int[] test4 = {1, 2};

        System.out.println(firstLast6(test));
        System.out.println(sameFirstLast(test));
        System.out.println(commonEnd((test), (test2)));
        System.out.println(maxEnd3(test3));
        System.out.println(has23(test4));
        System.out.println(noOfEvens(test2));
        System.out.println(bigDiff(test2));

    }

    static boolean firstLast6(int[] nums)
    {
        return (nums[0] == 6 || (nums[nums.length -1] == 6));
    }

    static boolean sameFirstLast(int[] nums)
    {
        return (nums[0] == (nums[nums.length - 1]) && nums.length >= 1);
    }

    static boolean commonEnd(int[] nums, int[] nums2)
    {
        return (nums.length >= 1 && nums2.length >= 1) && ((nums[0] == nums2[0]) || (nums[nums.length - 1] == nums2[nums2.length - 1]));
    }

    static int[] maxEnd3(int[] nums)
    {
        if (nums[0] > nums[2])
        {
            nums[1] = nums[0];
            nums[2] = nums[0];

        }

        else if (nums[2] > nums[0])
        {
            nums[0] = nums[2];
            nums[1] = nums[2];
        }
        return nums;
        //return (for (int i = 0; i < nums.length; i++){
        //System.out.println(nums[i]);
    //}r
    }

    static boolean has23(int[] nums)
    {
            return nums.length == 2 && (nums[0] == 2) || (nums[1] == 2) || (nums[0] == 3) || (nums[1] == 3);
    }

    static int noOfEvens(int[] nums)
    {
        int value = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if ( (nums[i] % 2) == 0 )
            {
                value++;
            }
        }
        return value;
    }
    static int bigDiff(int[] nums)
    {
        return Math.max(nums[0], nums[nums.length - 1]) - Math.min(nums[0], nums[nums.length - 1]);
    }
}

