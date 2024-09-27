import java.util.*;
public class tufHashq1Elementfreq {
   public static int ElementFreq(int []arr,int target){
      Map<Integer,Integer> hp = new HashMap<>();                        
      for(int num:arr){                                                       // this approach is for all integers
         hp.put(num,hp.getOrDefault(num,0)+1);
      }
      if(hp.containsKey(target)){
         return hp.get(target);
      }
      return 0;
   }

   // public static int CharacterFreq(String str,char target){
   //    char[] arr = str.toCharArray();
   //    int hash[] = new int[26];
   //    for(char ch:arr){      // int n = arr.length;                          // this approach is for small letters only
   //       hash[ch-'a']+=1;
   //    }
   //    return hash[target-'a'];
   // }
   public static int CharacterFreq(String str,char target){
      char[] arr = str.toCharArray();                                           // this approach is for all characters
      int hash[] = new int[256];
      for(char ch:arr){      // int n = arr.length;
         hash[ch]+=1;
      }
      return hash[target];
   }
   public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7,8,9,10,1,2,1,2,1,3,4,1,};
      String str = "Intellipaat";
      int target = 1;
      int result = ElementFreq(arr,target);
      System.out.println(result);
      System.out.println(CharacterFreq(str,'I'));
   }
}
