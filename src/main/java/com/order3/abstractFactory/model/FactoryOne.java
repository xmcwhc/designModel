package com.order3.abstractFactory.model;
/**
 * 
* @ClassName: FactoryOne
* @Description: TODO
* @author xuemengchao
* @date 2018年6月8日 下午5:20:35
*
 */
public class FactoryOne implements AbstractFactory{

    @Override
    public ProductA getProductA() {
        // TODO Auto-generated method stub
        return new ProductAOne();
    }

    @Override
    public ProducB getProductB() {
        // TODO Auto-generated method stub
        return new ProducBOne();
    }

}
