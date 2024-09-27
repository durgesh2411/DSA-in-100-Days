import java.util.*;

public class test {

   public static String encode(List<String> strs){
      StringBuilder sb = new StringBuilder();
      for(String str:strs){
         sb.append(str.length()).append("#").append(str);
      } 
      return sb.toString();
   }

   public static void main(String[] args) {
      List<String> strs = new  ArrayList<>();
      strs.add("eats");
      strs.add("tegent");
      strs.add("tan");
      strs.add("airtel");

      System.out.println(encode(strs));
   }
}




//    public static void main(String[] args) {
//        GroupAnagrams solution = new GroupAnagrams();
//        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        System.out.println(solution.groupAnagrams(strs));
//        // Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
//    }

//    }
