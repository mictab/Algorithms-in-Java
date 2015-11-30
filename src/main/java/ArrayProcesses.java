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
}
