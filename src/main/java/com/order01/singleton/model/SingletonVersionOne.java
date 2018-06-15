package com.order01.singleton.model;

/**
 * 
* @ClassName: SingletonVersionOne
* @Description: 单例模式-懒汉模式
* @author xuemengchao
* @date 2018年6月8日 下午2:29:53
*
 */
public class SingletonVersionOne {
    /**
     * 声明一个null的静态变量
     */
    private static SingletonVersionOne singleleton=null;
    
    public static SingletonVersionOne getSingletonVersionOne(){
       /**
        * 双重锁定
        * 外围的if代表==null时可以进入来争抢构造的机会,里面的if代表==null就构造,否则不能。
        */
        if (singleleton==null) {
            synchronized (SingletonVersionOne.class) {
                if (singleleton==null) {
                    singleleton =new SingletonVersionOne();
                }
            }
        }
        
        return singleleton;
        
        
    }
    
    
}
