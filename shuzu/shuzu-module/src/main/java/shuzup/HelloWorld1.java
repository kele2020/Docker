package shuzup;

import java.util.Arrays;
import java.util.Scanner;


//public 访问权限修饰符
//class 抽象类
//static 静态修饰符，描述的方法可以直接调用
//void 返回值（无返回值）
public class HelloWorld1 {
    public static void main(String[] args) {
        sz1();
        sz2();
        sz3();
        sz4();

        int [] dy = {5,5,5};
        sz5(dy);
    }

    public static void sz1() {
           //定义一个int类型的数组，变量名称为num,9代表数组的长度或者元素的个数
        int [] num = new int[9];  //为数组的长度初始化
        for(int i=0;i< num.length;i++){
            num[i] =i+1;
            System.out.println("【这是第1种数组格式---】"+num[i]);
        }
        for(int x:num){    //新的数据循环方式
            System.out.println("这是第四种数组格式---" + x);
        }
        System.out.println("数组的长度是="+num.length);
    }
    public static void sz2() {
        int [] num ;  //定义一个int类型的数组，变量名称为num
        num = new int[9];  //为数组的长度初始化
        for(int i=0;i< num.length;i++){
            num[i] =i+1;
            System.out.println("【这是第2种数组格式---】"+num[i]);
        }
        System.out.println("数组的长度是="+num.length);
    }
    public static void sz3() {
        int [] num = new int[]{11,22,33,44};  //定义一个int类型的数组，数组名称为num,初始化数组里面的值
        for(int i=0;i<=3;i++){
            System.out.println("这是第3种数组格式---"+num[i]);
        }
        System.out.println("数组的长度是="+num.length);
    }
    public static void sz4() {
         //定义一个int类型的数组，数组名称为num,初始化数组里面的值
        int [] num= {21,24,11,22,33,44};
        int re1 =Arrays.binarySearch(num,22);

        System.out.println("===============");
        System.out.println(re1);
        Arrays.sort(num);
        System.out.println( Arrays.toString(num));


        for (int i=0;i<=3;i++) {
            System.out.println("这是第四种数组格式---" + num[i]);
        }
        for(int x:num){    //新的数据循环方式
            System.out.println("这是第四种数组格式---" + x);
        }
        System.out.println("数组的长度是="+num.length);
        }

    public static void sz5(int xx []) {
        //定义一个int类型的数组，数组名称为num,初始化数组里面的值
        for (int i=0;i<=2;i++) {  //2是下标
            System.out.println("这是调用数组---" + xx[i]);
        }

        System.out.println("数组的长度是="+xx.length);
    }
    }

