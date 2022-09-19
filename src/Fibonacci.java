public class Fibonacci {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
    // 0  1  2  3  4  5  6   7   8   9  10

    public static int fib(int n) {
        if ((n == 1) || (n == 2))
            return (1);
        else return (fib(n - 1) + fib(n - 2));
    }
}