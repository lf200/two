package Demo02InnerClass;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
