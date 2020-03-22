/*Стек заполнен целыми числами случайным образом.
Записать в стек сначала четные элементы, затем – нечетные.*/
import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;

public class stack_kr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер стека: ");
        int d = scan.nextInt();
        Stack<Integer> dStack1 = new Stack();
        Stack<Integer> dStack2 = new Stack();
        Stack<Integer> dStack = new Stack();
        for (int i = 0; i < d; i++) {
            double k = Math.random();
            k = k * 52;
            int s = (int) Math.round(k);
            dStack.add(s);
            dStack1.add(s);
        }
        System.out.print("Стек в первоначальном виде: ");

        for (Object s : dStack) {
            System.out.print(s + " ");
        }
        System.out.print("\nНовый стек: ");
        for (int k = 0; k < d; k++) {
            int a = dStack.pop();
            if (a % 2 != 1) {
                dStack2.addElement(a);
            }
        }
        for (int k = 0; k < d; k++) {
            int b = dStack1.pop();
            if (b % 2 == 1) {
                dStack2.addElement(b);
            }
        }
        for (Object s : dStack2) {
            System.out.print(s + " ");
        }
    }
}