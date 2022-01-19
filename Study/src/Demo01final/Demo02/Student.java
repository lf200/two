package Demo01final.Demo02;

public class Student {
    private final String name; //= "鹿晗"

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    //}

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        name = "贺峻霖";
    }
}
