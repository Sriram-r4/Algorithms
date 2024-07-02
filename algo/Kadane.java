package algo;

public class Kadane{

    public static int maxSum(int[] nums){
        //To find maximum sum from sub array 
        //using Kadane's Algorithm

        //Time Complexity : O(n)
        //Space Complexity : O(1)

        //initialize two integer var
        //max=Integer.min_val
        //sum=0
        int max=Integer.MIN_VALUE;
        int sum=0;

        //loop traversal
        for(int i=0;i<nums.length;i++){
            //add element to sum 
            sum+=nums[i];

            //if sum>max then max=sum
            if(sum>max) max=sum;

            //if sum<0 then reinitialize sum to 0
            if(sum<0)sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
         //Sample Array 
         int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The Maximum contiguous sum is\t"+maxSum(nums));

        /* Points to be noted (order must be followed)
         * first element is added to sum
         * if sum>max then max=sum
         * if sum<0 sum=0
         */
    }
}