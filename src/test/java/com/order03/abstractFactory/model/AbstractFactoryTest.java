package com.order03.abstractFactory.model;

import org.junit.Test;

import com.order03.abstractFactory.model.AbstractFactory;
import com.order03.abstractFactory.model.FactoryOne;
import com.order03.abstractFactory.model.FactoryTwo;
import com.order03.abstractFactory.model.ProducB;
import com.order03.abstractFactory.model.ProductA;

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
