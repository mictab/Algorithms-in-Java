/**
 * Some search algorithms.
 *
 * @author Michel Tabari
 * @version 2015-12-01
 */
public class Search {

    /**
     * Searches for a key in an array using binary search.
     * The input array must be sorted.
     *
     * @param a   the array to conduct the search in
     * @param key the key to look for in the array
     * @return the index of the key if found in the array, -1 otherwise
     */
    public int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key > a[mid]) {
                lo = mid + 1;
            } else if (key < a[mid]) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * Searches for a key in an array using brute force.
     *
     * @param a   the array to conduct the search in
     * @param key the key to look for in the array
     * @return the index of the key if found in the array, -1 otherwise
     */
    public int sequentialSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) return i;
        }
        return -1;
    }
}
