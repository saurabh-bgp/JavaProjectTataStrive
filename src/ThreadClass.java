public class ThreadClass implements Runnable{
    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass();
        Thread t = new Thread(tc);
        Thread t1 = new Thread(new ThreadClass());
        t1.start();
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
