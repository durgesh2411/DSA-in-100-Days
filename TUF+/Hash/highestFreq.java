import java.util.*;

public class highestFreq {

    public static int highestFrequency(int[] arr) {
    Map<Integer,Integer> hp = new HashMap<Integer,Integer>();  //empty hash map
    for(int i=0;i<arr.length;i++){
        if(!hp.containsKey(arr[i])) hp.put(arr[i],0);
        hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
    }

    int max=Integer.MIN_VALUE;
    int ans= -1;

    for(Map.Entry<Integer,Integer> e:hp.entrySet()){
        if(e.getValue()>max) {
            max = e.getValue();
        ans = e.getKey();
        }
    }  
    return ans; 
}





public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int result = highestFrequency(arr);
    System.out.println(result);
}
}