package Demo03Game;

public class Hero {
    private String name;
    private Skill skill;

    public void attack(){
        System.out.println("我叫"+name+"开始释放技能");
        skill.use();
        System.out.println("释放结束");

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Hero() {
    }
}
