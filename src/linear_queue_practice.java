public class linear_queue_practice
{
    int n = 5;
    int queue[] = new int[n];
    int front = -1;
    int rear = -1;

    void enqueue(int value)
    {
        if (rear == n-1)
        {
            System.out.println("queue is full");
        }
        else
        {
            if (front ==-1)
                front = 0;
            rear ++;
            queue[rear] = value;
        }
    }

    void dequeue()
    {
        if (front == -1 || front>rear)
        {
            System.out.println("queue is empty");
        }
        else
        {
            System.out.println("deleted :" + queue[front]);
            front++;
        }
    }

    void display()
    {
        if (front == -1 || front>rear)
        {
            System.out.println("queue is empty");
        }
        else
        {
            System.out.println("Queue: ");
            for (int i = front; i <= rear ; i++)
            {
                System.out.println(queue[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        linear_queue_practice q1 = new linear_queue_practice();

        q1.enqueue(5);
        q1.enqueue(9);
        q1.enqueue(6);
        q1.enqueue(8);
        q1.enqueue(3);

        q1.display();
        q1.dequeue();
        q1.display();



    }
}
