package com.order03.abstractFactory.model;
/**
 * 
* @ClassName: AbstractFactory
* @Description: TODO
* @author xuemengchao
* @date 2018年6月8日 下午5:17:53
*
 */
public interface AbstractFactory {
    /**
     * 
    * @Title: getProductA
    * @Description: TODO
    * @param @return    
    * @return ProductA    
    * @throws
     */
    public ProductA getProductA();
    /**
     * 
    * @Title: getProductB
    * @Description: TODO
    * @param @return    
    * @return ProducB    
    * @throws
     */
    public ProducB getProductB();
}
