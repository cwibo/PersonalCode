import java.util.*;
/*
Write a method called readInteger() that has no parameters and returns an int.
It needs to read in an integer from the user - this represents how many elements the user needs to enter.
Write another method called readElements() that has one parameter of type int
The method needs to read from the console until all the elements are entered,
and then return an array containing the elements entered.
And finally, write a method called findMin() with one parameter of type int[].
The method needs to return the minimum value in the array.
 */
public class MinimumElement {
    public static void main(String[] args) {
        System.out.println("Type the number of integers you want to enter");
        System.out.println(findMin(readElements(readInteger())));
    }

    public static int readInteger(){
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        return user;
    }

    public static int[] readElements(int user){
        Scanner input = new Scanner(System.in);
        int[] nums = new int[user];
        int count = 0;
        while(count < user){
            int x = input.nextInt();
            nums[count] = x;
            count++;
        }
        return nums;
    }

    public static int findMin(int[] nums){
        int min = Arrays.stream(nums).min().getAsInt();
        return min;
    }
}
