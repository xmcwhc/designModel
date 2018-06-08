package com.order4.Builder.model;
/**
 * 
* @ClassName: Builder
* @Description: TODO
* @author xuemengchao
* @date 2018年6月8日 下午7:15:55
*
 */
public interface Builder {
    /**
     * 
    * @Title: creatName
    * @Description: TODO
    * @param @param name    
    * @return void    
    * @throws
     */
    public void creatName(String name);
    /**
     * 
    * @Title: creatNum
    * @Description: TODO
    * @param @param num    
    * @return void    
    * @throws
     */
    public void creatNum(int num);
    /**
     * 
    * @Title: creatProduct
    * @Description: TODO
    * @param @return    
    * @return Product    
    * @throws
     */
    public Product creatProduct();
}
