package shuzup;
//public 访问权限修饰符
//class 抽象类
//static 静态修饰符，描述的方法可以直接调用
//void 返回值（无返回值）
public class HelloWorld {
    public static void main(String[] args) {
        sz1();
        sz2();
//        sz3();
//        sz4();
    }

    public static void sz1() {
           //定义一个int类型的数组，变量名称为num,9代表数组的长度或者元素的个数
        int [] num = new int[9];  //为数组的长度初始化
        for(int i=0;i<9;i++){
            num[i] =i+1;
            System.out.println("sz1"+num[i]);
        }

    }
    public static void sz2() {
        int [] num ;  //定义一个int类型的数组，变量名称为num
        num = new int[9];  //为数组的长度初始化
        for(int i=0;i<9;i++){
            num[i] =i+1;
            System.out.println("sz2"+num[i]);
        }
        //System.out.println(num[3]);
    }

//    public static void sz4() {
//         //定义一个int类型的数组，数组名称为num,初始化数组里面的值
//        int [] num= {11,22,33,44};
//            num[i] =i+1;
//            System.out.println(num[i]);
//        }
        //System.out.println(num[3]);
    }





