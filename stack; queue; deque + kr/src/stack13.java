import java.util.Scanner;

class Stacks {
    private int dSize;
    private int[] stackArray;
    private int top;
    //
    public Stacks(int d) {
        this.dSize = d;
        stackArray = new int[dSize];
        top = -1;
    }
    public void addElement(int element) {
        stackArray[++top] = element;
    }
    public int deleteElement() {
        return stackArray[top--];
    }
    public int readTop() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == dSize -1);
    }
}
class stack13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер стека: ");
        int d = scan.nextInt();
        Stacks dStack = new Stacks(d);
        for (int i = 0; i < d; i++) {
            double k = Math.random();
            k = k * 52;
            int s = (int) Math.round(k);
            dStack.addElement(s);
        }

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите число, на которое увеличится каждый элемент: ");
        int a = scan1.nextInt();
        System.out.print("Стек в первоначальном виде: ");
        Stacks dStack1 = new Stacks(d);
        Stacks dStack2 = new Stacks(d);
        while (!dStack.isEmpty()) {
            int value = dStack.deleteElement();
            System.out.print(value + " ");
            dStack2.addElement(value);
        }
        while (!dStack2.isEmpty()) {
            int value2 = dStack2.deleteElement();
            dStack1.addElement(value2);
        }
        System.out.println(" ");
        System.out.println("Новый стек: ");
        while (!dStack1.isEmpty()) {
            int value1 = dStack1.deleteElement();
            value1 = value1 + a;
            System.out.print(value1 + " ");
        }
    }
}