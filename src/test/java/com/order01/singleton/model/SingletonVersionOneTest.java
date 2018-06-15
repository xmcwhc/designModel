package com.order01.singleton.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.order01.singleton.model.SingletonVersionOne;
/**
 * 
* @ClassName: SingletonVersionOneTest
* @Description: TODO
* @author xuemengchao
* @date 2018年6月8日 下午2:54:18
*
 */
public class SingletonVersionOneTest {
    @Test
    public void testgetSingletonVersionOne(){
        SingletonVersionOne one = SingletonVersionOne.getSingletonVersionOne();
        SingletonVersionOne two = SingletonVersionOne.getSingletonVersionOne();
        assert(one==two);
    }
    @Test
    public void testgetSingletonVersionOneMultithreading(){
        int maxCount = 10;
        //先创建线程池
        ThreadPoolExecutor poolExecutor= new ThreadPoolExecutor(6, 10, 5, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new MyThreadFactory("xue"));
        for (int i = 0; i < maxCount; i++) {
            poolExecutor.execute(new Runnable() {
                public void run() {
                    // TODO Auto-generated method stub
                    SingletonVersionOne one = SingletonVersionOne.getSingletonVersionOne();
                    System.out.println(one+"thread"+Thread.currentThread().getName());
                }
            });
        }
       
    }
}
