import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 6, 7};
        int k = 17;

        System.out.println(sumFinder(arr, k));
        System.out.println(sumFinderImproved(arr, k));
    }

    public static boolean sumFinder(int[] arr, int k) {
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] + arr[j] == k && i != j) return true;
            }
        }

        return false;
    }

    public static boolean sumFinderImproved(int[] arr, int k) {
        int pointer1 = 0;
        int pointer2 = arr.length - 1;

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        while (pointer1 < pointer2) {
            if (arr[pointer1] + arr[pointer2] < k) pointer1++;
            else if (arr[pointer1] + arr[pointer2] > k) pointer2--;
            else return true;
        }

        return false;
    }

}
