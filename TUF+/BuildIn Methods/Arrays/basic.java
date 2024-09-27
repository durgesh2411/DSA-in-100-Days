import java.util.Arrays;
class basic {

    public void swapEl(int[]arr,int a, int b) {   // there is no build in method for swapping elements in array 
        int temp = arr[a];                       // so we have to write our own method for swapping elements
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        basic swap = new basic();            // if we have not static method then we have to create object of class
        // swap.swapEl(arr[0],arr[4]);      //this passes by value  the copis of elements are sent not actual  elements.
        swap.swapEl(arr,0,4);               // this passes by reference and swaps the elements in the array
        System.out.println(Arrays.toString(arr));
        int []ans = Arrays.sort(arr);
        System.out.println(Arrays.toString(ans));
    
        
    }
}