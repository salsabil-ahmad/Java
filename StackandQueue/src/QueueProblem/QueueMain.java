package QueueProblem;


public class QueueMain {
    public static void main(String[] args) throws Exception {
        QueueBasic queue = new QueueBasic(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        System.out.println(queue.delete());
        queue.insert(133);
        queue.display();

        System.out.println(queue.delete());
        queue.insert(99);
        queue.display();

    }
}
