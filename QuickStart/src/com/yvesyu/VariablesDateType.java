package com.yvesyu;

/**
 * @Package: com.yvesyu
 * @ClassName: VariablesDateType
 * @Desc: 变量与数据类型
 * @Author: Yves Yu
 * @Create: 2023/1/15 - 22:21
 */
public class VariablesDateType {
    public static void main(String[] args) {

        int x = 1;
        System.out.println(x);

        // 变量的一个重要特点是可以重新赋值
        // 注意到第一次定义变量 x 的时候，需要指定变量类型 int，因此使用语句 int x = 100;
        // 而第二次重新赋值的时候，变量 x 已经存在了，不能再重复定义，因此不能指定变量类型 int，必须使用语句 x = 200;

        x = 100;
        System.out.println(x);

        /*
         * Java 定义了以下几种基本数据类型:
         * 整数类型：byte，short，int，long
         * 浮点数类型：float，double
         * 字符类型：char
         * 布尔类型：boolean
         *
         * 计算机内存的最小存储单元是字节（byte），一个字节就是一个 8 位二进制数，即 8 个bit,它的二进制表示范围从 00000000~11111111，换算成十进制是 0~255，换算成十六进制是 00~ff
         * byte：1 字节
         * short：2 字节
         * int：4 字节
         * long：8 字节
         * float：4 字节
         * double：8 字节
         * char：2 字节
         */

        /*
         * 各种整型能表示的最大范围如下：
         * byte：-128 ~ 127
         * short: -32768 ~ 32767
         * int: -2147483648 ~ 2147483647
         * long: -9223372036854775808 ~ 9223372036854775807
         */

        short i1 = 322;
        int i2 = 323;

        /*
         * 浮点类型的数就是小数，因为小数用科学计数法表示的时候，小数点是可以“浮动”的，如 1234.5 可以表示成 12.345x10 2，也可以表示成1.2345x10 3，所以称为浮点数
         * 对于 float 类型，需要加上 f 后缀
         * 浮点数可表示的范围非常大，float 类型可最大表示 3.4x10 38，而 double 类型可最大表示 1.79x10 308
         */

        float f1 = 3.23f;
        double f2 = 7.32;

        /*
         * 布尔类型 boolean 只有 true 和 false 两个值，布尔类型总是关系运算的计算结果
         */

        boolean b1 = true;
        boolean b2 = false;

        /*
         * 字符类型 char 表示一个字符,Java 的 char 类型除了可表示标准的 ASCII 外还可以表示一个 Unicode 字符
         * 注意 char 类型使用单引号 ' 且仅有一个字符，要和双引号 " 的字符串类型区分开
         */

        char a = 'A';
        System.out.println(a);

        /*
         * 引用类型：最常用的就是 String 字符串
         */

        String s = "Hello";

        /*
         * 定义变量的时候，如果加上 final 修饰符，这个变量就变成了常量
         * 常量在定义时进行初始化后就不可再次赋值，再次赋值会导致编译错误
         * 常量的作用是用有意义的变量名来避免魔术数字,例如，不要在代码中到处写 3.14，而是定义一个常量
         * 如果将来需要提高计算精度，我们只需要在常量的定义处修改，例如改成 3.14159，而不必在所有地方替换 3.14
         */

        final double PI = 3.14;

        /*
         * var关键字
         * 有些时候，类型的名字太长，写起来比较麻烦
         * 如果想省略变量类型，可以使用 var 关键字，编译器会根据赋值语句自动推断出变量 sb 的类型是 StringBuilder
         * 因此使用 var 定义变量，仅仅是少写了变量类型而已
         */

        StringBuilder sb1 = new StringBuilder();
        var sb2 = new StringBuilder();

        /*
         * 在 Java 中，多行语句用 { } 括起来，很多控制语句，例如条件判断和循环都以 { } 作为它们自身的范围
         * 在语句块中定义的变量，它有一个作用域，就是从定义处开始到语句块结束，超出了作用域引用这些变量编译器会报错
         * 定义变量时要遵循作用域最小化原则，尽量将变量定义在尽可能小的作用域，并且不要重复使用变量名
         */

        for (int i = 0; i < 1; i++) {
            int y = 5;
        }

    }
}
