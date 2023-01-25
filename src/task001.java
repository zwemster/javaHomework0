public class task001 {
    public static void main(String[] args){
        System.out.print("Исходный массив: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean changed;
        int temporary;

        for (int i = 0; i < array.length - 1; i++) {
            changed = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
        }

        System.out.print("Отсортированный массив: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
