package Demo05haomiaozhi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
抽象类->子类SimpleDateFormat继承了DateFormat
：作用：格式化将日期变为字符串
       解析将字符串转化为日期
子类的构造方法：
SimpleDateFormat(String pattern)
需要用给定的特殊方式String pattern进行构造
        区分大小写的方法
  y:年
  M:月
  d:日
  H:小时
  m:分钟
  s:秒
格式"yyyy-MM-dd HH:mm:ss"
格式"yyyy年MM月dd日 HH:mm:ss"
注意事项：模式中的字母不可更改，连接模式的符号可以改变
 */
public abstract class Demo02DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    public static void demo01(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //创建日期
        Date date = new Date();
        String format = simpleDateFormat.format(date);//按模式输出日期
        System.out.println(date);
        System.out.println(format);
    }
    public static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat02 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //parse方法声明了一个异常 public Date parse(String source) throws ParseException：解析异常，字符串和构造方法不同，则抛出异常
        //调用一个抛出异常的方法就必须处理这个异常要么throws继续声明抛出异常，要么try   catch处理这个异常
        Date parse = simpleDateFormat02.parse("2021-11-21 16:08:28");//将其解析为日期，字符串的类型必须与new时一模一样
        System.out.println(parse);
    }
}
