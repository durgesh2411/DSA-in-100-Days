import java.util.*;

public class LongestSubarrWithK {


   public static int longestSubarray(int[] nums, int k) {            // better approch
      int n = nums.length;
      Map<Integer,Integer> hp = new HashMap<>();
      int Len =0;
      int prevSum = 0;
      for(int i=0;i<n;i++){
         prevSum +=nums[i];
         if(prevSum == k){
            Len = i+1;
         }
         hp.putIfAbsent(prevSum,i);     // if the key is not present then only put the value this means if not to update
         if(hp.containsKey(prevSum-k)){ //just to add to get highest length from back
            Len = Math.max(Len,i-hp.get(prevSum-k));
         }
   }
   return Len;
}

public static int longestSubarray2(int[] nums, int k) {            // best approch
   int n = nums.length;
   int largestLen = 0;
   int sum = nums[0];
   int j=0; int i=0;
   while(i<n){
      while(sum>k && j<=i){
         sum-=nums[j];
         j++;
      }
      if(sum == k){
        largestLen = Math.max(largestLen,i-j+1);
      }
      i++;
      if(i<n) sum+=nums[i];
   }
   return largestLen;
}

public static int longestSubarray3(int[] nums,int k){
   int n =  nums.length;
   int left = 1; int right = n;
   while(left<=right){
      int mid  = left + (right-left)/2;
      if(isPossible(nums,mid k)){
         left = mid+1;
      }else{
         right = mid-1;
      }

   }
}







   public static void main(String[] args) {
      int nums[] = {1,2,3,1,1,1,1,4,3,2};
      int arr[] = {2,0,0,0,3};
      int k = 3;
      System.out.println(longestSubarray(nums,k));
      System.out.println(longestSubarray(arr,k));
      System.out.println(longestSubarray2(nums,k));
      System.out.println(longestSubarray2(arr,k));

   }
}
