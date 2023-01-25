public class task000 {
    public static void main(String[] args){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 301);
            System.out.print(array[i] + " ");
        }

        int maxElement = array[0];
        for (int k : array) {
            if (maxElement < k) {
                maxElement = k;
            }
        }
        System.out.println();
        System.out.println("Maximum element is " + maxElement);

        int minElement = array[0];
        for (int j : array) {
            if (maxElement > j) {
                maxElement = j;
            }
        }
        System.out.println("Minimum element is " + minElement);

        double aveElement = 0;
        for (int j : array) {
            aveElement += (double) j / array.length;
        }
        String averageValue = String.format("%.1f", aveElement);
        System.out.println("Average value is " + averageValue);
    }
}
