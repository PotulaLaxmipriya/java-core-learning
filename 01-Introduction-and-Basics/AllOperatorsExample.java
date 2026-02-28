package fullstack;

public class AllOperatorsExample {

	    public static void main(String[] args) {

	        int a = 10;
	        int b = 5;

	        System.out.println(a + b);
	        System.out.println(a - b);
	        System.out.println(a * b);
	        System.out.println(a / b);
	        System.out.println(a % b);

	        a += b;
	        a -= b;
	        a *= b;
	        a /= b;
	        a %= b;

	        System.out.println(a == b);
	        System.out.println(a != b);
	        System.out.println(a > b);
	        System.out.println(a < b);
	        System.out.println(a >= b);
	        System.out.println(a <= b);

	        boolean x = true;
	        boolean y = false;

	        System.out.println(x && y);
	        System.out.println(x || y);
	        System.out.println(!x);

	        int c = 10;
	        System.out.println(++c);
	        System.out.println(--c);

	        int m = 5;
	        int n = 3;

	        System.out.println(m & n);
	        System.out.println(m | n);
	        System.out.println(m ^ n);
	        System.out.println(m << 1);
	        System.out.println(m >> 1);

	        int result = (a > b) ? 100 : 200;
	        System.out.println(result);
	    }
	}

