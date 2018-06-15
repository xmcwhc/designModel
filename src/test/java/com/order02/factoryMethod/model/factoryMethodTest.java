package com.order02.factoryMethod.model;

import org.junit.Test;

import com.order02.FactoryMethod.model.Factory;
import com.order02.FactoryMethod.model.FactoryA;
import com.order02.FactoryMethod.model.Product;

public class factoryMethodTest {
    @Test
    public void test(){
        Factory factoryA = new FactoryA();
        Product product =factoryA.getProduct();
        product.show();
    }        
    
}
