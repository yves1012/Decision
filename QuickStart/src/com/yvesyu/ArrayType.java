package com.yvesyu;

/**
 * @Package: com.yvesyu
 * @ClassName: ArrayType
 * @Desc: 数组类型
 * @Author: Yves Yu
 * @Create: 2023/1/17 - 16:30
 */
public class ArrayType {

    public static void main(String[] args) {

        /*
         * 定义一个数组类型的变量，使用数组类型“类型[]”，例如 int[]
         * 和单个基本类型变量不同，数组变量初始化必须使用 new int[5] 表示创建一个可容纳 5 个 int 元素的数组
         * 数组有几个特点：一是数组所有元素初始化为默认值，整型都是 0，浮点型是 0.0，布尔型是 false；二是数组一旦创建后大小就不可改变
         * 要访问数组中的某一个元素需要使用索引，数组索引从 0 开始
         */

        int[] n1 = new int[5];
        n1[0] = 89;
        System.out.println(n1[0]);
        System.out.println(n1[1]);
        System.out.println(n1.length);

        // 在使用索引访问数组元素时，如果索引超出范围运行时将报错

        System.out.println(n1[1]);

        // 可以在定义数组时直接指定初始化的元素，这样就不必写出数组大小，而是由编译器自动推算数组大小
        int[] n2 = new int[]{3, 4, 9};
        int[] n3 = {4, 6, 9, 10};
        System.out.println(n2.length);

        /*
         * 注意：数组的大小不可变
         * 第一次创建 n4 指向 5 个元素，第二次创建 n4 指向 3 元素，但是原有 5 个元素的数组并没有改变，只是无法通过变量 n4 引用到它们而已
         */

        int[] n4 = {4, 5, 6, 7, 8};
        System.out.println(n4.length);
        n4 = new int[]{1, 2, 3};
        System.out.println(n4.length);

    }

}
