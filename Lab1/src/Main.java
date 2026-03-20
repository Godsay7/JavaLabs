void main() {
    int[][] k = new int[4][4];
    Scan.scanNum(k);

//    int[][] k = { {1, 2, 3, 4},
//                  {5, 6, 7, 8},
//                  {9, 10, 11, 12},
//                  {13, 14, 15, 16}}
//
    Output.printArr(k);

    for (int i = 0; i < 4; i++) {
        int n = k[i][i];
        k[i][i] = k[i][0];
        k[i][0] = n;
    }
    Output.printArr(k);

    int n = 0;
    for (int i = 0; i < 4; i++) {
        n += k[i][0];
    }
    System.out.print(n);
}