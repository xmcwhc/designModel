package com.order2.factoryMethod.model;

import org.junit.Test;

import com.order2.FactoryMethod.model.Factory;
import com.order2.FactoryMethod.model.FactoryA;
import com.order2.FactoryMethod.model.Product;

public class factoryMethodTest {
    @Test
    public void test(){
        Factory factoryA = new FactoryA();
        Product product =factoryA.getProduct();
        product.show();
    }        
    
}
