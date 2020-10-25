public class ArrayOps {
    public static int sum(int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static int largest(int[] arr) {
        int largest = arr[0];
        //assuming that arr is not empty
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(arr[i],largest);
        }
        return largest;
    }
}
