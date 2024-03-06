public class Fibonacci {

    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;
        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return false;
    }
}


