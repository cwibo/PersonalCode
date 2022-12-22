import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers");
        System.out.println(Arrays.toString(reverse(userArray())));
    }
    public static int[] userArray(){
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        int count = 0;
        while(count < 5){
            int x = input.nextInt();
            nums[count] = x;
            count++;
        }
        return nums;
    }
    public static int[] reverse(int[] nums){
        Integer[] what = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
        Collections.reverse(Arrays.asList(what));
        int[] result = new int[what.length];
        for (int i = 0; i < what.length; i++) {
            result[i] = what[i].intValue();
        }
        return result;
    }
}
