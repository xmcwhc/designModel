package com.order01.singleton.model;

/**
 * 
* @ClassName: SingletonVersionOne
* @Description: 单例模式-饿汉模式
* @author xuemengchao
* @date 2018年6月8日 下午2:29:53
*
 */
public class SingletonVersionTwo {
    /**
     * 声明一个null的静态变量
     */
    private static SingletonVersionTwo singleleton=new SingletonVersionTwo();
    
    public static SingletonVersionTwo getSingletonVersionOne(){
        return singleleton;
    }
    
    
}
