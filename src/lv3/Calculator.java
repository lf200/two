package lv3;

import java.util.Scanner;

public class Calculator  {
    public Calculator() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字，以回车结束。");
        String a = sc.next();
        double one = (double) Integer.parseInt(a);
        System.out.println("请输入符号，以回车结束。");
        char fh = sc.next().charAt(0);
        System.out.println("请输入第二个数字，以回车结束。");
        String b = sc.next();
        double two = (double) Integer.parseInt(b);

        double num;
        switch (fh){
            case'+':num = one+two;
                System.out.println(one + "+"+two +"="+num);
                break;
            case '-':num = one-two;
                System.out.println(one + "-"+two +"="+num);
                break;
            case '*':num = one*two;
                System.out.println(one + "*"+two +"="+num);
                break;
            case'/':
                try {
                    System.out.println(one + "/" + two + "=" + method(one, two));
                }catch (YiChangExceptation e){
                    e.printStackTrace();
                }

                break;

            default:
                System.out.println("您输入的符号不在我们的计算范围内");
                break;
        }
    }

    public static double method(double a, double b)throws YiChangExceptation {
        if(b==0){
            throw new YiChangExceptation("您输入的分母为0，无法计算");
        }else{
            return a/b;
        }
    }
}

