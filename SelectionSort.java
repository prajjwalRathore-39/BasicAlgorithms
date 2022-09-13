import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if (nums[j]<nums[min])
                    min=j;
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
