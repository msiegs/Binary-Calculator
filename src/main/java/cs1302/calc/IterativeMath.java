package cs1302.calc;

/* Implement the Math interface using iteration here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class IterativeMath implements Math {

    public int inc(int n) {
        throw new UnsupportedOperationException();
    } // inc

    public int dec(int n) {
        throw new UnsupportedOperationException();
    } // dec

    public int add(int lhs, int rhs) {
        int sum = lhs;
	while (rhs > 0) {
	    sum = inc(sum);
	    rhs = dec(rhs);
	} // while
	return sum;
    } // add

    public int sub(int lhs, int rhs) {
	if (rhs > lhs) return 0;
	while (rhs != 0) {
	    lhs = dec(lhs);
	    rhs = dec(rhs);
	} // while
	return lhs;
    } // sub

    public int mul(int lhs, int rhs) {
        int sum = lhs;
	if (rhs == 0) return 0;
	while (rhs > 1) {
	    sum = add(sum,lhs);
	    rhs = dec(rhs);
	} // while
	return sum;
    } // mul

    public int div(int lhs, int rhs) {
	int sum = 0; // counter
	while (lhs >= rhs) {
		lhs = sub(lhs, rhs);
		sum = inc(sum);
	} // while
	return sum; 
    } // div

    public int fac(int n) {
	int acc = 1;
	while (n > 0) {
		acc = acc * n;
		n = n - 1;
	} // while
	return acc;
    } // fac
    
    public int pow(int lhs, int rhs) {
	int acc = 1;
	while (rhs > 0) {
		acc = mul(acc, lhs);
		rhs = dec(rhs);
	} // while
	return acc;
    } // pow
    
    public int lshift(int lhs, int rhs) {
        throw new UnsupportedOperationException();
    } // lshift
    
    public int rshift(int lhs, int rhs) {
        throw new UnsupportedOperationException();
    } // rshift

} // IterativeMath

