package com.order05.prototype.model;

public class AbstractPrototype implements Cloneable{
    private String name;
    private Apple apple;
    public String getName() {
        return name;
    }
   

    public void setName(String name) {
        this.name = name;
    }
    /**
     * 浅克隆              引用不变  ，克隆后的apple引用不变，值变了，都变
     */
    public AbstractPrototype clone(){
        AbstractPrototype prototype = null;
        try{
            prototype = (AbstractPrototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }


    public Apple getApple() {
        return apple;
    }


    public void setApple(Apple apple) {
        this.apple = apple;
    }
    
    
}
