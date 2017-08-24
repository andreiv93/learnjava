public class Teacher {
    private String name;
    private int age;
    private int exp;

    public Teacher() {
    }

    public Teacher(String name, int age, int exp) {
        this.name = name;
        this.age = age;
        this.exp = exp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
