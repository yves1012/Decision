package com.yvesyu;

/**
 * @Package: com.yvesyu
 * @ClassName: FloatOperation
 * @Desc: 浮点数运算
 * @Author: Yves Yu
 * @Create: 2023/1/17 - 01:06
 */
public class FloatOperation {

    public static void main(String[] args) {

        /*
         * 浮点数运算和整数运算相比，只能进行加减乘除这些数值计算，不能做位运算和移位运算
         * 在计算机中，浮点数虽然表示的范围大，但是浮点数有个非常重要的特点，就是浮点数常常无法精确表示
         * 例如浮点数 0.1 在计算机中就无法精确表示，因为十进制的 0.1 换算成二进制是一个无限循环小数
         * 很显然无论使用 float 还是 double，都只能存储一个 0.1 的近似值，但是 0.5 这个浮点数又可以精确地表示
         */

        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        System.out.println(x);
        System.out.println(y);

        /*
         * 由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果
         * 正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数
         * 浮点数在内存的表示方法和整数比更加复杂
         */

        double r = Math.abs(x - y);
        if (r < 0.00001) {
            System.out.println("可以认为相同");
        } else {
            System.out.println("可以认为不相同");
        }

        // 如果参与运算的两个数中其中一个是整型，那么整型可以自动提升到浮点型
        int n = 5;
        double d = 1.2 + 24.0 / n;
        System.out.println(d);

        /*
         * 整数运算在除数为0时会报错，而浮点数运算在除数为0时，不会报错，但会返回几个特殊值
         * NaN 表示 Not a Number
         * Infinity 表示无穷大
         * -Infinity 表示负无穷大
         */

        double d1 = 0.0 / 0;
        double d2 = 1.0 / 0;
        double d3 = -1.0 / 0;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        // 可以将浮点数强制转型为整数，在转型时浮点数的小数部分会被丢掉，如果转型后超过了整型能表示的最大范围，将返回整型的最大值

        int n1 = (int) 12.3;
        System.out.println(n1);
        int n2 = (int) -12.7;
        System.out.println(n2);
        int n3 = (int) 1.2e20;
        System.out.println(n3);

        // 如果要进行四舍五入，可以对浮点数加上0.5再强制转型

        double m1 = 2.6;
        int m2 = (int) (m1 + 0.5);
        System.out.println(m2);

    }

}
