public class Nguyenha {
    public static void main(String[] args) {
        int check = 1;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i - 1; j++)
                if (i % j == 0) {
                    check = 0;
                }
            if (check == 1) {
                System.out.println(i);
            }
            check = 1;
        }
    }
}