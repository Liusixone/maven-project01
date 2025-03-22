package org.nwpu;

import org.junit.jupiter.api.*;

public class Demo1Test {
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @BeforeEach // 在每个测试方法之前执行
    public void testBeforeEach() {
        System.out.println("testBeforeEach");
    }

    @AfterEach // 在每个测试方法之后执行
    public void testAfterEach() {
        System.out.println("testAfterEach");
    }

    @BeforeAll //在所有测试方法之前执行，一般用于初始化操作
    public static void testBeforeAll() {
        System.out.println("testBeforeAll");
    }

    @AfterAll // 在所有测试方法之后执行，一般用于资源释放
    public static void testAfterAll() {
        System.out.println("testAfterAll");
    }


}
