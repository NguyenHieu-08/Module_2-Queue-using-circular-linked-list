public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        Solution.enQueue(1,q);
        Solution.enQueue(2,q);
        Solution.enQueue(3,q);
        Solution.enQueue(4,q);

        Solution.displayQueue(q);
        Solution.deQueue(q);
        Solution.displayQueue(q);

        Solution.enQueue(5,q);
        Solution.enQueue(6,q);
        Solution.displayQueue(q);
    }
}