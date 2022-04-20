package wetagustin.starting;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class MyThread implements Runnable{

    public static ArrayList<Thread> threads = new ArrayList<>();
    public static int counter = 0;
    public static int endedThreadsCount = 0;
    public static Callable<Function> finishingFunction;

    private String name;

    public MyThread(String name){
        this.name = name;
        threads.add(new Thread(this));
    }

    @Override
    public void run() {

        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.println("Paso " + i + " del thread " + this.name);
            counter++;
        }

        endedThreadsCount++;
        System.out.println("Are all threads ended? : " + areAllThreadsEnded());
        onThreadsEnded();
    }

    private static boolean areAllThreadsEnded() {
        return threads.size() == endedThreadsCount;
    }

    public static void runAllThreads() {
        threads.forEach(Thread::start);
    }

    private static void onThreadsEnded() {
        if(areAllThreadsEnded()){
            try {
                finishingFunction.call();
            } catch (Exception e) {
                System.out.println("Cannot call finishing function.");
            }
        }
    }

}
