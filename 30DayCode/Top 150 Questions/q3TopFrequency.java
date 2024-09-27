import java.util.*;
public class q3TopFrequency {

static int[] topKFreq(int []nums,int k){
   HashMap<Integer,Integer> countMap = new HashMap<>();
   for(int num:nums){
      countMap.put(num,countMap.getOrDefault(num,0)+1);
   }
   PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

   for(Map.Entry<Integer,Integer> entry :countMap.entrySet()){
      heap.offer(entry);
      if(heap.size()>k){
         heap.poll();
      }
   }

   int result[] = new int[k];
   for(int i=k-1;i>=0;i--){
      result[i] = heap.poll().getKey();
   }
   return result;


}

   public static void main(String[] args) {
      int nums[] = {1,1,1,2,2,3};
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter k:");
      int k = sc.nextInt();
      int result[] = topKFreq(nums,k);
      System.out.println(Arrays.toString(result));
      sc.close();
   }
}
