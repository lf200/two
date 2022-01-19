package Demo02InnerClass;
/*
内部类
分类：
1.成员内部类
2.局部内部类（包括匿名对象类）

成员内部类：
修饰符 class 类名称{
   修饰符 class 类名称{
    }
 }
 内用外随意，外用内一定要借助内部类对象

 =================
 使用成员内部类
1.间接  在外部类方法中使用内部类，在main中调用外部类方法即可
2.直接  外部类.内部类 变量名 = new 外部类(). new 内部类();
========================
使用匿名内部类：
可以直接用接口来实现方法，不需要再使用实现类==匿名实现类
注意：
1.格式 接口名称 变量名称 = new 接口名称(){
              重写接口中的所有方法
        };
2.匿名内部类在创建对象的时候，只能使用一次，但创建出来的对象可以使用很多次
  如果想要使用多次且类得内容一致，则需要使用实现类
3.匿名对象：在调用方法时只能调用唯一一次
4.匿名内部类省略了实现类或子类，匿名对象省略了对象名，两者不同！！！
 */
public class Demo01 {
}
