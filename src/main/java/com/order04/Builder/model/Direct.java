package com.order04.Builder.model;
/**
 * 
* @ClassName: Direct
* @Description: TODO
* @author xuemengchao
* @date 2018年6月8日 下午7:18:08
*
 */
public class Direct {
    private Builder builder =null;

    public Direct(Builder builder) {
        super();
        this.builder = builder;
    }
    public Product creatProduct(String name,int num){
        builder.creatName(name);
        builder.creatNum(num);
        return builder.creatProduct();
    }
    
}
