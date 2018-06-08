package com.order3.abstractFactory.model;
/**
 * 
* @ClassName: FactoryTwo
* @Description: TODO
* @author xuemengchao
* @date 2018年6月8日 下午5:24:36
*
 */
public class FactoryTwo implements AbstractFactory{

    @Override
    public ProductA getProductA() {
        // TODO Auto-generated method stub
        return new ProductATwo();
    }

    @Override
    public ProducB getProductB() {
        // TODO Auto-generated method stub
        return new ProductBTwo();
    }

}
