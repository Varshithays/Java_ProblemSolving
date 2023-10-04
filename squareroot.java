public class squareroot {
    public static int sqrt(int n)
    {
        if (n < 2) {
            return n;
        }
        int low = 1, high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == n) {
                return mid;
            }
            else if (mid * mid < n) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return high;
    }
    public static void main(String[] args)
    {
        int n = 3;
        System.out.println(sqrt(n));
    }
}
