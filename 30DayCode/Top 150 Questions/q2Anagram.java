import java.util.*;
public class q2Anagram {
   static boolean isAnagram(String s1,String s2){
      if(s1.length()!=s2.length()){
         return false;
      }
      HashMap<Character,Integer> count = new HashMap<>();
      for(char c:s1.toCharArray()){
         count.put(c,count.getOrDefault(c,0)+1);
      }
      for(char c:s2.toCharArray()){
         if(!count.containsKey(c) || count.get(c)==0){
            return false;
         }
         count.put(c,count.get(c)-1);
      }
      return true;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first string:");
      String s1 = sc.nextLine();
      System.out.println("Enter second string:");
      String s2 = sc.nextLine();
      System.out.println("Are anagrams: " + isAnagram(s1, s2));
      sc.close();
   }
}
