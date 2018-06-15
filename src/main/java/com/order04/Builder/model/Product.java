package com.order04.Builder.model;
/**
 * 
* @ClassName: Product
* @Description: TODO
* @author xuemengchao
* @date 2018年6月8日 下午7:14:40
*
 */
public class Product {
    private String name;
    private int num;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", num=" + num + "]";
    }
    
    
    
}
