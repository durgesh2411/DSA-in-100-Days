import java.util.*;
public class lectureOne{

   // 1.Binary Search Algorithm (trick: when u see sorted array, think of binary search):
   static int binarySearch(int []arr,int n,int target){
      int l=0;int h=n-1;
      int ans = Integer.MIN_VALUE;

      while(l<h){
         int m = l+(h-l)/2;
         if(arr[m]==target){
            ans = m;
            return ans;
         }

         else if(arr[m]<target){
            l = m+1;
         }
         else if(arr[m]>target){
            h = m-1;
         }
         else{
            System.out.println("Element not found");
         }

      }
       return -1;    //**if element not found use -1 for int return type**
   }

   // 2.Two pointer approach( trick: when u see sorted array, think of two pointer approach):
   //{2-Sum problem}:
   public static int[] twoPointer(int []arr,int target){
      int ans[] = new int[2];
      int n = arr.length;
      int left=0;int right = n-1;int sum=0;
      while(left<right){
         sum = arr[left]+arr[right];
         if(sum==target){
            ans[0] = left;
            ans[1] = right;
            return ans;
         }
         else if(sum<target){
            left++;
         }
         else if(sum>target){
            right--;
         }
         else{
            System.out.println("No such pair found");
         }
         }
         return null;    //**if return type is array ,do not find the pair then, in place of -1 we can return null */
      }

public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of the array");
   int n = sc.nextInt();
   int []arr = new int[n];
   System.out.print("Enter the elements of the array");
   for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
   }
   System.out.print("Enter the target element");
   int target = sc.nextInt();
   // int result = binarySearch(arr,n,target);
   // System.out.println(result);
   int result[] = twoPointer(arr,target);
   System.out.println(Arrays.toString(result));
   sc.close();
}
}
