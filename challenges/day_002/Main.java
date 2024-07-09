import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 2, 1};

        System.out.println(Arrays.toString(arrMultiplier(arr1))); //result: {120, 60, 40, 30, 24}
        System.out.println(Arrays.toString(arrMultiplier(arr2))); //result: {2, 3, 6}
    }

    public static int[] arrMultiplier(int[] arr) {
       
        int[] productArr = arr.clone();
        int product = 1;

        for (int item: arr) {
            product *= item;
        }

        for (int i = 0; i < productArr.length; i++) {
            productArr[i] = product / productArr[i];
        }        

        return productArr;
    }



}
