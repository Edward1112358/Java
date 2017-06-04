package Thread;

/**
 * Created by Edward on 2017-2-3.
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        MyThread02 mt1 = new MyThread02("线程a");
        MyThread02 mt2 = new MyThread02("线程b");
        new Thread(mt1).start();
        new Thread(mt2).start();
    }
}
