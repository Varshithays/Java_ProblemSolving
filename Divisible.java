public class Divisible {
    public static void main(String[] args) {
        int startRange = 1; // Replace with your desired start range
        int endRange = 20; // Replace with your desired end range

        System.out.println("Numbers divisible by 5 and multiples of 3 within the range:");

        for (int i = startRange; i <= endRange; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
