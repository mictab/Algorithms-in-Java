/**
 * Euclids algorithm
 *
 * @author Michel Tabari
 * @version 2015-11-30
 */
public class EuclidsAlgorithm {

    /**
     * Calculate the gcd of two integers.
     *
     * @param p the first integer
     * @param q the second integer
     * @return the gcd of the two numbers
     */
    public int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }
}