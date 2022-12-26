public class Solution {
    //Chèn 1 phần tử
    public static void enQueue(int data, Queue q){
        Node newNode = new Node(data);

        if(q.front == null) {
            q.front = q.rear = newNode;
        } else {
            q.rear.link = newNode;
            q.rear = newNode;
        }
        q.rear.link = q.front;
    };

    //Lấy ra 1 phần tử
    public static void deQueue(Queue q){
        if(q.front == null) {
            return;
        } else{
            if(q.front == q.rear) {
                q.front = q.rear = null;
            } else {
                Node temp = q.front;
                q.front = q.front.link;
                q.rear.link = q.front;
            }
        }
    };

    //Hiển thị
    public static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.printf(" Elements in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
        System.out.println();
    }
}
