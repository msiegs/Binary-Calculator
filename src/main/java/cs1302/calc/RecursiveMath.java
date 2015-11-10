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
	return n + 1;
    } // inc

    public int dec(int n) {
	return n - 1;
    } // dec

    public int add(int lhs, int rhs) {
	if (rhs == 0) return lhs;
	return add(inc(lhs), dec(rhs));
    } // add

    public int sub(int lhs, int rhs) {
	if (rhs == 0) return lhs;
	if (rhs > lhs) return 0;
	return sub(dec(lhs), dec(rhs));
    } // sub

    public int mul(int lhs, int rhs) {
	return mul_acc(lhs, lhs, rhs);
    } // mul

    public int mul_acc(int sum, int lhs, int rhs) {
	if (rhs == 0) return 0;
	if (rhs == 1) return sum;
	return mul_acc(add(sum,lhs),lhs,dec(rhs));
    } // mul_acc

    public int div(int lhs, int rhs) {
	return div_acc(0, lhs, rhs);
    } // div

    public int div_acc(int count, int lhs, int rhs) {
	if (lhs < rhs) return count;
	return div_acc(inc(count), sub(lhs, rhs), rhs);
    } // div_acc

    public int fac(int n) {
	return fac_acc(1, n);
    } // fac
    
    public int fac_acc(int product, int n) {
	if (n == 0) return product;
	return fac_acc(n * product, n - 1);
    } // fac_acc
    
    public int pow(int lhs, int rhs) {
	return pow_acc(1, lhs, rhs);
    } // pow

    public int pow_acc(int acc,int lhs,int rhs) {
	if (rhs == 0) return acc;
	return pow_acc(mul(acc,lhs), lhs, dec(rhs));
    } //pow_acc
    
    public int lshift(int lhs, int rhs) {
	return mul(lhs, pow(2,rhs));
    } // lshift
    
    public int rshift(int lhs, int rhs) {
	return div(lhs, pow(2,rhs));
    } // rshift

} // RecursiveMath


