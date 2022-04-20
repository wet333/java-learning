package wetagustin.starting;

public class FirstThread {
    public static void main(String[] args) {

        // Open n threads
        int n = 20;
        for (int i = 0; i < n; i++) {
            new MyThread("thread" + i);
        }

        // Run all threads and when all are finished
        // run a function saved on a static attribute
        MyThread.runAllThreads();
        MyThread.finishingFunction = () -> {
            System.out.println("Todos los hilos finalizados");
            System.out.println("Counter : " + MyThread.counter);
            return null;
        };
    }
}
