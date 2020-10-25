import java.util.Arrays;
public class Tester {
    public static void main(String[] args){
        /* tests for sum()
        int [] a = new int[] {1,2,3,4,5,};
        int [] b = new int[] {};
        System.out.println(ArrayOps.sum(a)); // 15
        System.out.println(ArrayOps.sum(b)); // 0
        */
        /* tests for largest()
        int [] mix = new int[] {-3,4,1,0,2};
        int [] negativesOnly = new int [] {-3,-1,-5,-6,0};
        int [] positivesOnly = new int [] {1,2,9,5,6};
        System.out.println(ArrayOps.largest(mix));          // 4
        System.out.println(ArrayOps.largest(negativesOnly));// 0
        System.out.println(ArrayOps.largest(positivesOnly));// 9
        */
        /* tests for sumRows()
        int[][] a2D = {{1, 0, 12, -1}, {7, -2, 2, 1}, {-5,-2,2,-9}};
        int[][] b2D = {{},{},{},{}};
        int[][] c2D = {{1},{2},{3}};
        System.out.println(Arrays.toString(ArrayOps.sumRows(a2D))); // [12, 8, -14] 
        System.out.println(Arrays.toString(ArrayOps.sumRows(b2D))); // [0, 0, 0, 0]
        System.out.println(Arrays.toString(ArrayOps.sumRows(c2D))); // [1, 2, 3]
        */
    }
}

