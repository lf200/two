package supperRedBag;

import Red.OpenMode;
import Red.RedPacketFrame;

/*
场景说明：
    红包发出去之后所有人都有红包，抢完之后最后一个给群主
大部分代码已写好，只需填空即可
    1.设置文件名称
    2.设置群主名称
    3.设置分发策略，平均or随机
策略：
   1.普通红包：（平均分即可），余额放进最后一个
   2.手气红包： 最少一分钱，最多不超过平均的2倍
 */
public class Bootstrap {
    public static void main(String[] args) {
       MyRed myRed = new MyRed("老子要发红包");
       //设置群主名称
        myRed.setOwnerName("贺峻霖");

        //设置策略,普通红包
       // OpenMode normal = new NormalMode();
       //myRed.setOpenWay(normal);

        //随机手气红包
        RandomMode random = new RandomMode();
        myRed.setOpenWay(random);

    }
}
