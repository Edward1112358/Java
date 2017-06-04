package Thread;

/**
 * Created by Edward on 2017-2-3.
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread01 mt1 = new MyThread01("线程a");
        MyThread01 mt2 = new MyThread01("线程b");
        mt1.start();
        mt2.start();
    }
}
