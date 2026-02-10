import java.util.Arrays;

public class ArrayMethodExample{
    public static void main(String[] args) {
        int[] arr = {40,10,30,20};
        System.out.println("Original Array");
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        // Output : [40,10,30,20];
        System.out.println("Sorted Array");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Index of 30: " + index);
        int[] arr2 = {10,20,30,40};
        boolean isEqual = Arrays.equals(arr, arr2);
        System.out.println("Both arrays are equal: " + isEqual);
        int[] arr3 = new int[5];
        Arrays.fill( arr3 , 7);
        System.out.println("Filled Arrays: ");
        System.out.println(Arrays.toString(arr3));
        // output : [7,7,7,7,7,];
    }
}