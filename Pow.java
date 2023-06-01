package Leetcode;

public class Pow {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;

        if (n == 1)
            return x;

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double temp = myPow(x, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }
}
