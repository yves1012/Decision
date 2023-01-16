package com.yvesyu;

/**
 * @Package: com.yvesyu
 * @ClassName: BasicStructure
 * @Desc: Java 程序基本结构
 * @Author: Yves Yu
 * @Create: 2023/1/15 - 22:11
 */

// public 是访问修饰符，表示该 class 是公开的，不写 public 也能正确编译，但是这个类将无法从命令行执行

public class BasicStructure {

    // 方法名是 main，返回值是 void，表示没有任何返回值
    // public 除了可以修饰 class 外，也可以修饰方法，而关键字 static 是另一个修饰符表示静态方法
    // Java 入口程序规定的方法必须是静态方法，方法名必须为 main，括号内的参数必须是 String 数组

    public static void main(String[] args) {
        System.out.println("这份文件简单介绍下 Java 程序的基本结构");
    }

}
