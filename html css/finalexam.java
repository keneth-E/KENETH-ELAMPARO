import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

class BALBIN_PriorityQueueDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> Queue = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("Enter 6 integers:");
        for (int i = 0; i < 1; i++) {
            int Priority = sc.nextInt();
            Queue.add(Priority);
        }
        for (int i = 0; i < 1; i++) {
            int Priority = sc.nextInt();
            Queue.add(Priority);
        }
        for (int i = 0; i < 1; i++) {
            int Priority = sc.nextInt();
            Queue.add(Priority);
        }
        for (int i = 0; i < 1; i++) {
            int Priority = sc.nextInt();
            Queue.add(Priority);
        }
        for (int i = 0; i < 1; i++) {
            int Priority = sc.nextInt();
            Queue.add(Priority);
        }
        for (int i = 0; i < 1; i++) {
            int Priority = sc.nextInt();
            Queue.add(Priority);
        }
        System.out.println("Integers in Ascending Order:");
        while (!Queue.isEmpty()) {
            System.out.print(Queue.poll());
        }
    }
}