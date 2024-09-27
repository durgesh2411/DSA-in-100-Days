import java.util.*;
public class q8EncDecodeString {

   static String encode(List<String> strs){
      StringBuilder  sb = new StringBuilder();
      for(String str:strs){
         sb.append(str.length()).append("#").append(str);

      }
      return sb.toString();
   }

   static List<String> decode1(String s){
      List<String> result = new ArrayList<>();
      int i=0;
      while(i<s.length()){
         int j = i;                                                              // o(n2)
         while(s.charAt(j)!='#'){
            j++;
         }
         int length = Integer.parseInt(s.substring(i,j));
         result.add(s.substring(j+1,j+1+length));
         i=j+1+length;
      }
      return result;
   }

   static List<String> decode2(String s){
      List<String> result = new ArrayList<>();
      int i=0;                                                                            // with O(n) complexity
      while(i<s.length()){
         int hash = s.indexOf('#',i);
         int length = Integer.parseInt(s.substring(i,hash));
         result.add(s.substring(hash+1,hash+1+length));
         i=hash+1+length;
      }
      return result;
   }

   public static void main(String[] args) {
      List<String> strs = new ArrayList<>();
      strs.add("eats");
      strs.add("tegent");
      strs.add("tan");
      strs.add("airtel");

      String encoded = encode(strs);
      System.out.println(encoded);
      List<String> decoded = decode1(encoded);
      System.out.println(decoded);
      List<String> decoded2 = decode2(encoded);
      System.out.println(decoded2);
   }
}
