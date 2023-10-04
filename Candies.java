class Candies{
    static void candies(int n, int k) {
        int[] arr = new int[k];
        int j = 0; 
        while (n > 0) { 
            for (int i = 0; i < k; i++) { 
                j++; 
                if (n <= 0) { 
                    break;
                } else {
                    if (j < n) { 
                        arr[i] = arr[i] + j;
                    } else {
                        arr[i] = arr[i] + n; 
                    }
                    n = n - j; 
                }
            }
        }
        
        for (int i : arr) {
            System.out.print(i + " "); 
        }
    }

    public static void main(String[] args) {
        int n = 10, k = 3;
        candies(n,k);
}
}
