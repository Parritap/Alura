package apis;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        var m = genMatrix(1, A, B);

        System.out.println(Arrays.deepToString(m));

    }

    /**
     * Introduce p a la matriz m.
     *
     * @param p
     * @return matriz.
     */
    static int[][] genMatrix(int p, int[][] m1, int[][] m2) {
        int[][] m = new int[m1.length][m2[0].length];
        // Introducir p en m

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                m[i][j] += p;
            }
        }
        return m;
    }

}
