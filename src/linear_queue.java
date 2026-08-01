import java.util.Scanner;

public class linear_queue
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
            if (front == -1)
                front = 0;
            rear++;
            queue[rear] = value;
        }
    }

    void dequeue()
    {
        if (front == -1 || front > rear)
        {
            System.out.println("queue is empty");
        }
        else
        {
            System.out.println("deleted: " +queue[front]);
            front++;
        }
    }

    void display()
    {
        if (front == -1 || front > rear)
        {
            System.out.println("queue is empty");
        }
        else
        {
            System.out.println("queue: ");

            for (int i = front; i <= rear ; i++)
            {
                System.out.println(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        linear_queue q = new linear_queue();

        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(9);
        q.enqueue(76);
        q.enqueue(88);

        q.display();
        q.dequeue();
        q.display();


    }

}
