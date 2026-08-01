public class circulat_queue
{
    int n =5;
    int queue[] = new int[n];
    int front = -1;
    int rear =-1;

    void enqueue(int value)
    {
        if ((rear +1) % n == front)
        {
            System.out.println("queue is full");
        }
        else
        {
            if (front == -1)
                front = 0;
            rear = (rear+1) % n;
            queue[rear] = value;
        }
    }
    void dequeue()
    {
        if (front == -1)
        {
            System.out.println("queue is empty");
        }
        else
        {
            System.out.println("deleted : " + queue[front]);
            if (front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                front = (front + 1) % n;
            }
        }
    }

    void display()
    {
        if (front == -1)
        {
            System.out.println("queue is empty");
        }
        else
        {
            System.out.println("queue: ");
            for (int i = front;; i=(i+1) % n )
            {
                System.out.println(queue[i] + " ");

                if (i == rear)
                    break;

            }
            System.out.println();
        }


    }

    public static void main(String[] args)
    {
        circulat_queue q2 = new circulat_queue();

        q2.enqueue(5);
        q2.enqueue(9);
        q2.enqueue(6);
        q2.enqueue(8);
        q2.enqueue(3);

        q2.display();
        q2.dequeue();
        q2.display();
        q2.enqueue(33);
        q2.display();



    }
}

