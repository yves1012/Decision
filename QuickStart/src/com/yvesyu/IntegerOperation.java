package com.yvesyu;

/**
 * @Package: com.yvesyu
 * @ClassName: IntegerOperation
 * @Desc: 整数运算
 * @Author: Yves Yu
 * @Create: 2023/1/16 - 14:41
 */
public class IntegerOperation {

    public static void main(String[] args) {
        // 整数运算遵循四则运算规则，可以使用任意嵌套的小括号,规则和初等数学一致
        int x1 = (100 + 200) * (99 - 88);
        System.out.println(x1);

        // 整数的数值表示不但是精确的，而且整数运算永远是精确的，即使是除法也是精确的
        int x2 = 9320 / 32;
        System.out.println(x2);

        // 特别注意，整数由于存在范围限制，如果计算结果超出了范围，就会产生溢出，而溢出不会出错，却会得到一个奇怪的结果
        // 要解决上面的问题，可以把 int 换成 long 类型，由于 long 可表示的整型范围更大，所以结果就不会溢出
        int x3 = 2147483640;
        System.out.println(x3 + 40);

        // 简写的运算符
        // += 相当于 x4 = x4 + 100，其他运算符同理
        int x4 = 100;
        x4 += 100;
        System.out.println(x4);

        // 自增/自减
        // ++n 表示先加 1 再引用 n，n++ 表示先引用 n 再加 1
        int x5 = 500;
        int x6 = ++x5;
        System.out.println(x6);

        // 移位运算
        int x7 = 7;
        int x8 = x7 << 1;
        System.out.println(x8);

        // 位运算
        int x9 = 0 & 0;
        System.out.println(x9);
        x9 = 0 & 1;
        System.out.println(x9);
        x9 = 0 | 1;
        System.out.println(x9);

        // 运算优先级：加括号就可以保证运算的优先级正确

        // 类型自动提升与强制转型，如果参与运算的两个数类型不一致，那么计算结果为较大类型的整型，例如 short 和 int 计算结果总是 int
        short x10 = 5;
        int x11 = 433;
        System.out.println(x10 + x11);

        // 也可以将结果强制转型，即将大范围的整数转型为小范围的整数
        // 要注意，超出范围的强制转型会得到错误的结果，原因是转型时，int 的两个高位字节直接被扔掉，仅保留了低位的两个字节
        int x12 = 1234567;
        short x13 = (short) x12;
        System.out.println(x13);

    }

}
