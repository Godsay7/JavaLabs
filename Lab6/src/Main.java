import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Write number of array length");
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>(n);
    Random rand = new Random();
    for (int i = 0; i < n; i++) {
        int randomNumber = rand.nextInt(100);
        list.add(randomNumber);
    }
    System.out.println(list);
    System.out.println("enter the number to be shifted by");
    int num = sc.nextInt();
    Collections.rotate(list, -num);
    System.out.println(list);
}
