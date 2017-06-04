package Thread;

/**
 * Created by Edward on 2017-2-3.
 */
class MyThread02 implements Runnable {
    private String name;
    public MyThread02(String name) {
        this.name = name;
    }
    public void run(){
        for(int i=0; i<10; i++) {
            System.out.println("线程开始:"+this.name+",i="+i);
        }
    }
}
