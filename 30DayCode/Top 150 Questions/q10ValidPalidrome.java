import java.util.*;
public class q10ValidPalidrome {

   static boolean isPalindrome(String s){
      String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      if(cleanString.length() == 0) return true;
      int left = 0; int right = cleanString.length() -1;
      while(left<right){
         if(cleanString.charAt(left) != cleanString.charAt(right)){
            return false;
         }
         left++;
         right--;
      }
      return true;
   }

    public static void main(String[] args) {
         String s1 = "A man, a plan, a canal, Panama";
         String s2 = "race a car";
         String s3 = "A man, a plan, a canal, Panama";
         System.out.println(isPalindrome(s1));  // true
         System.out.println(isPalindrome(s2));  // false
         System.out.println(isPalindrome(s3));  // true

      }


   }
