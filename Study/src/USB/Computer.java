package USB;
//使用USB
public class Computer {
    public void powerOn(){
        System.out.println("笔记本开机");
    }


    public void powerOff(){
        System.out.println("笔记本关机");
    }

    //使用USB设备，使用接口作为方法的参数
    public void useUSB(USBInterface USB){
        //向下转型

        USB.open();//打开设备
        if(USB instanceof Mouse){
        Mouse mouse = (Mouse) USB;
        mouse.click();
    }
        else if(USB instanceof KeyBoard){
        KeyBoard keyBoard = (KeyBoard) USB;
        keyBoard.type();
    }
        USB.close();//关闭设备
    }






}
