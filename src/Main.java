public class Main {

    public static void main(String[] args) {
        // write your code here

        int count = 0;
        int n = 2;
        while (n <= 100) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println("số nguyên tố: " + n + " vị trí: " + count);
            }
            n++;
        }
    }
}
