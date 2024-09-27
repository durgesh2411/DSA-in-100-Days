import java.util.*;
public class q9LongestConsecutiveSubstring {
   public static int longestConsecutiveSubsequence(int[]nums){
      Set <Integer> set = new HashSet<>();
      for(int num:nums){
         set.add(num);
      }

      int logestStreak = 0;
      for(int num:set){
         if(!set.contains(num-1)){
            int currentNum = num;
            int currentStreak = 1;
            while(set.contains(currentNum+1)){
               currentNum+=1;
               currentStreak+=1;
            }
            logestStreak = Math.max(logestStreak,currentStreak);
         }

      }
      return logestStreak;
   }

   public static void main(String[] args) {
      int nums[] = {100,4,200,1,3,2};
      int res = longestConsecutiveSubsequence(nums);
      System.out.println(res);
      // System.out.println(longestConsecutiveSubsequence(nums));
   }


}
