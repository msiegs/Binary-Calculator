package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class RecursiveMath implements Math {

    public int inc(int n) {
        throw new UnsupportedOperationException();
    } // inc

    public int dec(int n) {
        throw new UnsupportedOperationException();
    } // dec

    public int add(int lhs, int rhs) {
	
    } // add

    public int sub(int lhs, int rhs) {
        throw new UnsupportedOperationException();
    } // sub

    public int mul(int lhs, int rhs) {
	return mul_acc(lhs, lhs, rhs);
    } // mul

    public int mul_acc(int sum, int lhs, int rhs) {
	if (rhs == 0) return 0;
	if (rhs == 1) return sum;
	return mul_acc(add(sum,lhs),lhs,pred(rhs)));
    } // mul_acc

    public int div(int lhs, int rhs) {
	return div_acc(0, lhs, rhs);
    } // div

    public int div_acc(int count, int lhs, int rhs) {
	if (lhs < rhs) return count;
	return div_acc(succ(count), sub(lhs, rhs), rhs);
    } // div_acc

    public int fac(int n) {
	return fac_acc(1, n);
    } // fac
    
    public int fac_acc(int product, int n) {
	if (n == 0) return product;
	return fac_acc(n * product, n - 1);
    } // fac_acc

    public int pow(int lhs, int rhs) {
        throw new UnsupportedOperationException();
    } // pow
    
    public int lshift(int lhs, int rhs) {
        throw new UnsupportedOperationException();
    } // lshift
    
    public int rshift(int lhs, int rhs) {
        throw new UnsupportedOperationException();
    } // rshift

} // RecursiveMath


