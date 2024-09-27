import java.util.*;

public class q3GroupAnagram {
   static List<List<String>> groupAnagram(String[] strs){
      HashMap<String,List<String>> map = new HashMap<>();
      for(String str:strs){
         char[] chars = str.toCharArray();
         Arrays.sort(chars);
         String key = new String(chars);
         if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
         }
         map.get(key).add(str);
      }
      return new ArrayList<>(map.values());
   }




   public static void main(String[] args) {
      String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
      System.out.println(groupAnagram(strs));
   }
}
