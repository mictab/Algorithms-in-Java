import java.util.List;

/**
 * Different sorting and searching algorithms.
 * Can handle any objects that implement the Comparable interface.
 *
 * @author Michel Tabari
 * @version 2015-11-26
 * @see List
 */
public class Sorting {

    /**
     * Sorts the input array using selection sort.
     *
     * @param array the array to be sorted
     */
    public <T extends Comparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min].compareTo(array[j]) > 0) {
                    min = j;
                }
            }
            T temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    /**
     * Sorts the input list using selection sort.
     *
     * @param list the list to be sorted
     */
    public <T extends Comparable<T>> void selectionSort(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(min).compareTo(list.get(j)) > 0) {
                    min = j;
                }
            }
            T temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }

    /**
     * Sorts the input list using insertion sort.
     *
     * @param list the list to be sorted
     */
    public <T extends Comparable<T>> void insertionSort(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            int j = i;
            while (j > 0 && list.get(j - 1).compareTo(list.get(j)) > 0) {
                T temp = list.get(j - 1);
                list.set(j - 1, list.get(j));
                list.set(j, temp);
                j = j - 1;
            }
        }
    }

    /**
     * Sorts the input array using insertion sort.
     *
     * @param array the array to be sorted
     */
    public <T extends Comparable<T>> void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1].compareTo(array[j]) > 0) {
                T temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j = j - 1;
            }
        }
    }
}