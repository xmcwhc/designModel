package com.order19.proxy.model;
/**
 * 
* @ClassName: RealSubject
* @Description: TODO
* @author xuemengchao
* @date 2018年6月11日 下午4:25:29
*
 */
public class RealSubject implements Subject {
    @Override
    public void rent()
    {
        System.out.println("I want to rent my house");
    }
    
    @Override
    public void hello(String str)
    {
        System.out.println("hello: " + str);
    }
}
