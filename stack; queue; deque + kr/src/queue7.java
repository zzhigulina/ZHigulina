import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue7 {
    static Queue<Integer> queue7(Queue<Integer> source, Queue<Integer> target) {
        if ( ! source.isEmpty() ) {
            Integer element = source.poll();
            queue7(source, target);
            target.add(element);
        }
        return target;
    }

    static Queue<Integer> queue7(Queue<Integer> source) {
        Queue<Integer> target = new LinkedList<>();
        return queue7(source, target);
    }

    public static void main(String[] args) {
        Queue<Integer> queue7 = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер очереди: ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Введите элемент #" + (i + 1) + ": ");
            int b = sc1.nextInt();
            queue7.offer(b);
        }
        queue7.addAll(Arrays.asList());
        Queue<Integer> result = queue7(queue7);
        System.out.println("Новая очередь: ");
        while ( ! result.isEmpty() )
            System.out.print(result.poll() + " ");
        System.out.println();
    }
        }