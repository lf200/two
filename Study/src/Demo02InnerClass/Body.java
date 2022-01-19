package Demo02InnerClass;

public class Body {
    public class Heart{//内部类
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫"+name);
        }
    }

    private String name;//外部类变量

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类方法");
        Heart heart = new Heart();
        heart.beat();
    }
}
