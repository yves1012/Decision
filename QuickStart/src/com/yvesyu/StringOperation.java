package com.yvesyu;

/**
 * @Package: com.yvesyu
 * @ClassName: StringOperation
 * @Desc: 字符和字符串运算
 * @Author: Yves Yu
 * @Create: 2023/1/17 - 16:05
 */
public class StringOperation {

    public static void main(String[] args) {

        // 字符类型 char 是基本数据类型，它是 character 的缩写,一个 char 保存一个 Unicode 字符

        char c1 = 'A';
        char c2 = '中';

        // 因为Java在内存中总是使用 Unicode 表示字符，所以一个英文字符和一个中文字符都用一个 char 类型表示，它们都占用两个字节
        // 要显示一个字符的 Unicode 编码，只需将 char 类型直接赋值给 int 类型即可

        int n1 = 'A';
        int n2 = '中';
        System.out.println(n1);
        System.out.println(n2);

        // 可以直接用转义字符编码来表示一个字符

        char c3 = '\u0041';
        char c4 = '\u4e2d';
        System.out.println(c3);
        System.out.println(c4);

        // 字符串类型 String 是引用类型，我们用双引号"."表示字符串,一个字符串可以存储 0 个到任意个字符

        String s1 = "中文 ABC";
        String s2 = "Hello World";

        // 如果字符串本身恰好包含一个"字符，需要借助转义字符\

        String s3 = "abc\"xyz";
        System.out.println(s3);
        String s4 = "abc\\xyz";
        System.out.println(s4);

        // 可以使用 + 连接任意字符串和其他数据类型

        String s5 = "Hello";
        String s6 = "World";
        System.out.println(s5 + " " + s6);

        // 如果用 + 连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接
        int n3 = 90;
        String s7 = "Ha";
        System.out.println(n3 + s7);

        // 多行字符串

        String s8 = "first line \n"
                + "second line \n"
                + "end";
        System.out.println(s8);

        // Java 13 开始，字符串可以用"""..."""表示多行字符串

        String s9 = """
                SELECT * FROM
                  users
                WHERE id > 100
                ORDER BY name DESC
                """;
        System.out.println(s9);

        /*
         * 字符串除了是一个引用类型外，还有个重要特点就是字符串不可变
         * 执行 String s10 = "hello"; 时，JVM 虚拟机先创建字符串 "hello"，然后把字符串变量 s10 指向它
         * 执行 s = "world"; 时，JVM 虚拟机先创建字符串 "world"，然后把字符串变量s指向它
         * 原来的字符串 "hello" 还在，只是无法通过变量 s10 访问它而已
         * 字符串的不可变是指字符串内容不可变，至于变量可以一会指向字符串 "hello" 一会指向字符串 "world"
         */

        String s10 = "Hello";
        System.out.println(s10);
        s10 = "World";
        System.out.println(s10);

        String s11 = "hello";
        String t = s11;
        s11 = "world";
        System.out.println(t);

        // 引用类型的变量可以指向一个空值 null 它表示不存在，即该变量不指向任何对象
        // 注意要区分空值 null 和空字符串 ""，空字符串是一个有效的字符串对象，它不等于 null

        String s12 = null;
        String s13 = "";
        System.out.println(s12);
        System.out.println(s13);

        int a = 72;
        int b = 105;
        int c = 65281;
        System.out.println((char) a);
        System.out.println((char) b);
        System.out.println((char) c);

    }

}
