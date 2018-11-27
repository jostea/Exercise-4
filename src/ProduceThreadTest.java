

import java.util.Stack;

public class ProduceThreadTest {


    public static void main(String[] args) {

        Stack<Thread> stackOfThread = new Stack<>();
        stackOfThread.push(new Thread());
        stackOfThread.push(new Thread());
        stackOfThread.push(new Thread());

        new ProducerThread(stackOfThread).start();


    }
}
