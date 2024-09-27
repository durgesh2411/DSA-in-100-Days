import java.util.*;

public class q1ContainsDupli{

   static boolean isDuplicate(int[] nums, int n) {
      boolean isDuplicate = false;
      HashSet<Integer> set = new HashSet<>();
      for (int i = 0; i < n; i++) {
         if (set.contains(nums[i])) {
            isDuplicate = true;
            return isDuplicate;
         } else {
            set.add(nums[i]);4
         }
      }
      return isDuplicate;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size:");
      int n = sc.nextInt();
      int[] nums = new int[n];
      for (int i = 0; i < n; i++) {
         nums[i] = sc.nextInt();
      }
      System.out.println("Contains duplicate: " + isDuplicate(nums, n));
      sc.close();
   }
}
