/**
 * Different task for arrays.
 * @author Michel Tabari
 * @version 2015-11-30
 */
public class ArrayProcesses {

    /**
     * Computes the maximum value of an array.
     * @param a the array
     * @return  the maximum value
     */
    public int maximumValue(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    /**
     * Computes the average value of an array of doubles.
     * @param a the array of doubles
     * @return  the average value of the elements in the array
     */
    public double averageValue(double[] a) {
        double sum = 0;
        int numOfElements = a.length;
        for (int i = 0; i < numOfElements; i++) {
            sum += a[i];
        }
        return sum / numOfElements;
    }

    /**
     * Copy the values of one array to another, then return it
     * @param a the array to copy
     * @return  the copy of the input array
     */
    public double[] copyToArray(double[] a) {
        double[] copyOfArray = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            copyOfArray[i] = a[i];
        }
        return copyOfArray;
    }

    /**
     * Reverses the input array
     * @param a an array
     */
    public void reverseArray(double[] a) {
        int N = a.length;
        for (int i = 0; i < N/2; i++) {
            double temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;
        }
    }

    /**
     * Multiple two square matrices using the dot product.
     * @param a the first square matrix
     * @param b the second square matrix
     * @return  the product of a and b
     */
    public double[][] matrixMultiplication(double[][] a, double[][] b) {
        int N = a.length;
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; i < N; i++) {
                for (int k = 0; i < N; i++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
