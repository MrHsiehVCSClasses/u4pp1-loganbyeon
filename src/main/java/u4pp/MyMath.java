package u4pp;

public class MyMath {
    public static int abs(int x){
        if(x < 0){
            return -1 * x;
        }
        return x;
    }

    public static double abs(double x){
        if(x < 0){
            return -1.0 * x;
        }
        return x;
    }

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