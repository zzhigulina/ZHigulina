import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class deque13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер дека: ");
        int d = scan.nextInt();
        Deque<Integer> dDeque = new LinkedList();
        for (int i = 0; i < d; i++) {
            double k = Math.random();
            k = k * 52;
            int s = (int) Math.round(k);
            dDeque.add(s);
        }
        System.out.print("Дек в первоначальном виде: ");
        Deque dDeque1 = new LinkedList();
        Deque dDeque2 = new LinkedList();
        for (Object s : dDeque) {
            System.out.print(s + " ");
        }
        System.out.print("\nНечетные элементы дека: ");
        for (int k = 0; k < d; k++) {
            int a = dDeque.pop();
            if (a % 2 == 1) {
                System.out.print(a+" ");
            }
        }
    }
}