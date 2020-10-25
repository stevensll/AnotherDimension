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
    public static int [] sumRows(int[][] matrix){
        int [] a = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            a[i] = sum(matrix[i]);
        }
        return (a);
    }
    public static int [] largestInRows(int[][] matrix) {
        int [] a = new int[matrix.length];
        for (int i = 0; i < matrix.length;i++) {
            a[i] = largest(matrix[i]);
        }
        return a;
    }
}
