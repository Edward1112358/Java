package Thread;

/**
 * Created by Edward on 2017-2-3.
 */
class MyThread01 extends Thread {
    private String name;
    public MyThread01(String name) {
        super();
        this.name = name;
    }
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("线程开始:"+this.name+",i="+i);
        }
    }
}
