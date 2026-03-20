public class Output {
    public static void printArr(int[][] Arr) {
        for (int[] row : Arr) {
            for (int el : row) {
                System.out.print(el);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
    }
}
