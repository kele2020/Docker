package t1;

public class Heloo {
    public static void main(String[] args) {

        Outer o1=new Outer();
         //Outer.Inner i1=o1.new Inner();
         //i1.print();
        o1.innerprint();
        o1.show();
    }
}

class Outer{

    private String name;
    Inner inner =new Inner();
    public void innerprint() {  //建议在外部类中定义一个方法，对外提供访问内部类的接口
        inner.print();
    }

    private class Inner{    //成员内部类
        public void print(){
            System.out.println("成员内部类");
        }
    }
                            //方法内部类
    public void show(){

        class Inner2{
            public void print(){
                System.out.println("方法内部类 ");
            }

        }
        Inner2 inner2=new Inner2();
        inner2.print();

    }
}