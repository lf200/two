package USB;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
    //准备一个鼠标进行使用
    //    Mouse mouse = new Mouse();
    //先向上转型
        USBInterface usbMouse = new Mouse();//多态
        computer.useUSB(usbMouse);


    //准备一个键盘
        KeyBoard keyBoard = new KeyBoard();
        //方法参数是USB，传入为实现类
        computer.useUSB(keyBoard);//实现了向上转型





        computer.powerOff();
    }

}
