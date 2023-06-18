public class NamedLoop {
    public static void main(String[] args) {
        outerLoop: for (int i = 1; i <= 3; i++) {
            innerLoop: for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i == 2 && j == 2) {
                    break outerLoop; // Break out of the outer loop when i=2 and j=2
                }
            }
        }
    }
}
