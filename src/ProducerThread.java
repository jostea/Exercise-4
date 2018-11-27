import java.util.Stack;

public class ProducerThread extends Thread {

    Stack<Thread> threadStack;

    public ProducerThread(Stack<Thread> threadStack) {
        this.threadStack = threadStack;
    }


    public Thread consumer() {
        while (threadStack.size() != 0) {
            System.out.println(threadStack.pop());
        }
        return Thread.currentThread();
    }

    @Override
    public void run() {
        consumer();

    }
}
