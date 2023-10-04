//FREQUENCY OF A CHARACTER
public class charfreq {
    public static void main(String[] args) {
        String input = "hello, world!";
        int[] charFrequency = new int[256]; // Assuming ASCII characters

        // Count character frequencies
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            charFrequency[ch]++;
        }

        // Print character frequencies
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0 && Character.isLetterOrDigit((char) i)) {
                System.out.println((char) i + ": " + charFrequency[i]);
            }
        }
    }
}
