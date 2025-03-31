public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            String line = "";

            // Add leading spaces
            for (int space = 0; space < rows - i - 1; space++) {
                line += "  ";
            }

            // Increasing powers of 2
            int num = 1;
            for (int j = 0; j <= i; j++) {
                line += num + " ";
                num *= 2;
            }

            // Decreasing powers of 2
            num /= 2;
            for (int j = 0; j < i; j++) {
                num /= 2;
                line += num + " ";
            }

            // Pad with spaces to align @
            while (line.length() < 39) { // 39 is the length of the longest line
                line += " ";
            }

            // Print line with @
            System.out.println(line + "@");
        }
    }
}
