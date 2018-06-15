package com.order02.FactoryMethod.model;
/**
 * 
* @ClassName: FactoryA
* @Description: TODO
* @author xuemengchao
* @date 2018年6月8日 下午4:17:58
*
 */
public class FactoryA implements Factory{

    @Override
    public Product getProduct() {
        // TODO Auto-generated method stub
        return new ProducA();
    }

}
