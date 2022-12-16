package u4pp;

public class MyMath {

    /**
	 * Turns the input value into a positive value.
	 * @param x the input value.
     * @return the positive value of input value.
	 */
    public static int abs(int x){
        if(x < 0){
            return -1 * x;
        }
        return x;
    }

    /**
	 * Turns the input value into a positive value.
	 * @param x the input value (double).
     * @return the positive value of input value (double).
	 */
    public static double abs(double x){
        if(x < 0){
            return -1.0 * x;
        }
        return x;
    }

    /**
	 * Gives the power of given base and exponent values.
	 * @param base the value that is repeatedly multiplied by itself.
     * @param exponent the value that is raised to the base value.
     * @return the product of the power of given base and exponent values.
	 */
    public static double pow(double base, int exponent){
        if(exponent == 0){
            return 1.0;
        }
        double result = base;
        for(int i = 0; i < exponent - 1; i++){
            result *= base;
        }
        return result;
    }

    /**
	 * Checks if input value is a perfect square.
	 * @param x the input value.
     * @return the input value if it is a perfect square.
	 */
    public static int perfectSqrt(int x){
        if(x == 0){
            return 0;
        }
        for(int i = 1; i * i <= x; i++){
            if(x % i == 0 && x / i == i){
                return i;
            }
        }
        return -1;
    }
}
