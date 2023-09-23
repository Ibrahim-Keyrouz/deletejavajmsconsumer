public class Main {

    public static void main(String[] args) throws Exception {
     /*  thread(new HelloWorldProducer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldProducer(), false);*/
        while (true) {
            thread(new HelloWorldConsumer(), false);
            Thread.sleep(1000);
        }
     //   Thread.sleep(1000);
       // thread(new HelloWorldConsumer(), false);

    }

    public static void thread(Runnable runnable, boolean daemon) {
        Thread brokerThread = new Thread(runnable);
        brokerThread.setDaemon(daemon);
        brokerThread.start();
    }
}
