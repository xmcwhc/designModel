package com.order3.abstractFactory.model;

import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void test(){
        AbstractFactory factoryOne = new FactoryOne();
        ProductA productAOne = factoryOne.getProductA();
        ProducB productBOne = factoryOne.getProductB();
        productAOne.showProductA();
        productBOne.showProductB();
        
        AbstractFactory factoryTwo = new FactoryTwo();
        ProductA productATwo = factoryTwo.getProductA();
        ProducB productBTwo = factoryTwo.getProductB();
        productATwo.showProductA();
        productBTwo.showProductB();
    }
}
