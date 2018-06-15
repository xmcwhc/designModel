package com.order04.Builder.model;

public class BuilderImplOne implements Builder {
    private Product product = new Product();
    @Override
    public void creatName(String name) {
        // TODO Auto-generated method stub
        product.setName(name);
    }

    @Override
    public void creatNum(int num) {
        // TODO Auto-generated method stub
        product.setNum(num);
    }

    @Override
    public Product creatProduct() {
        // TODO Auto-generated method stub
        return product;
    }
    

}
