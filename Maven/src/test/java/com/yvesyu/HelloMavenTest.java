package com.yvesyu;

import org.junit.Test;

/**
 * @Package: com.yvesyu
 * @ClassName: HelloMavenTest
 * @Desc: Maven Java 演示项目测试类
 * @Author: Yves Yu
 * @Create: 2023/1/16 - 14:24
 */
public class HelloMavenTest {

    @Test
    public void sayHelloTest() {
        HelloMaven helloMaven = new HelloMaven();
        System.out.println(helloMaven.sayHello("Maven"));
    }

}
