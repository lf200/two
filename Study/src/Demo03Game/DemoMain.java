package Demo03Game;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("阿离");//英雄名称
        hero.setSkill(new SkillImpl());
        hero.attack();
        //使用匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("piapiapia");
            }
        };
        hero.setSkill(skill);

        hero.attack();

        //进一步简化使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biupiabiu");
            }
        });
        hero.attack();
    }
}
