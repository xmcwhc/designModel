package com.order05.prototype.model;

import java.util.Arrays;

import org.junit.Test;

import com.order05.prototype.model.AbstractPrototype;
import com.order05.prototype.model.Apple;

/**
 * 
 * @ClassName: AbstractPrototypeTest
 * @Description: TODO
 * @author xuemengchao
 * @date 2018年6月11日 下午2:47:51
 * 
 */
public class AbstractPrototypeTest {
    @Test
    public void test() {
        AbstractPrototype prototype = new AbstractPrototype();
        Apple apple = new Apple("nochangeapple");
        prototype.setName("nochange");
        prototype.setApple(apple);
        AbstractPrototype clonePrototype = prototype.clone();
        System.out.println(prototype.getName());
        System.out.println(clonePrototype.getName());
        apple.setName("changeapple");
        prototype.setName("change");
        prototype.setApple(apple);
        System.out.println(prototype.getName());
        System.out.println(clonePrototype.getName());
        System.out.println(prototype.getApple().getName());
        System.out.println(clonePrototype.getApple().getName());
    }

    private static boolean[][] b = { { false, false, false, false },
            { false, false, false, false }, { false, false, false, false },
            { false, false, false, false } };

    @Test
    public void test1() {

        int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        find(a, 0, 0, 15, 0, 0);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] == true) {

                    System.out.print(a[i][j] + " ");

                } else {
                    System.out.print("  ");
                }
             
            }
            System.out.println();
        }

    }

    public static void find(int[][] a, int x, int y, int aim, int orgix,
            int origy) {
        // 结束条件
        if (x > a.length - 2 || a[x][y] == aim) {
            if (a[x][y] == aim) {
                b[orgix][origy] = true;
                b[x][y] = true;
            }
            return;
        } else {
            System.out.println(a[x][y] + "  ");
            find(a, x + 1, y + 1, aim, x, y);
            find(a, x + 1, y, aim, x, y);
            if (b[x + 1][y + 1] == true || b[x + 1][y] == true) {
                b[x][y] = true;
            }
        }
    }
}
