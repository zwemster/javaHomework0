public class task002 {
    public static void main(String[] args) {
        System.out.print("Простые числа от 0 до 100: ");
        for (int i = 2; i <= 100; i++) {
            boolean simpleDigit = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simpleDigit = false;
                    break;
                }
            }
            if (simpleDigit) {
                System.out.print(i + " ");
            }
        }
    }
}
