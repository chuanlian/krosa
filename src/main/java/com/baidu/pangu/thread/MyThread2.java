package com.baidu.pangu.thread;

/**
 * Created by yangchuanlian on 2016/11/23.
 */
public class MyThread2 extends Thread {

    private int ticket = 100;//每个线程都拥有100张票

    MyThread2(String name) {
        super(name);//调用父类带参数的构造方法
    }

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        while (ticket > 0) {
            System.out.println(ticket-- + " is saled by " + Thread.currentThread().getName());
        }
    }
}
