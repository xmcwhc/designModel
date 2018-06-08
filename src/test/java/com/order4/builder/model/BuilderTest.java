package com.order4.builder.model;

import org.junit.Test;

import com.order4.Builder.model.Builder;
import com.order4.Builder.model.BuilderImplOne;
import com.order4.Builder.model.Direct;
import com.order4.Builder.model.Product;

/**
 * 
* @ClassName: BuilderTest
* @Description: TODO
* @author xuemengchao
* @date 2018年6月8日 下午7:18:55
*
 */
public class BuilderTest {
    @Test
    public void test(){
        Builder builder = new BuilderImplOne();
        Direct direct = new Direct(builder);
        Product product = direct.creatProduct("产品名称", 5);
        System.out.println(product.toString());
    }
}
