public class Student {
    private String name;
    private float avg;
    private int age;
    private String lastSchool;
    private float[] grd;



    public Student() {
    }

    public Student(String name, float avg, int age, String lastSchool, float[] grd) {
        this.name = name;
        this.avg = avg;
        this.age = age;
        this.lastSchool = lastSchool;
        this.grd = grd;
    }

    public float[] getGrd() {
        return this.grd;
    }

    public void setGrd(float[] grd) {
        this.grd = grd;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAvg() {
        return this.avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastSchool() {
        return this.lastSchool;
    }

    public void setLastSchool(String lastSchool) {
        this.lastSchool = lastSchool;
    }

    public float calculateAvg() {
        float s = 0;
        for (int i = 0; i < this.grd.length; i++) {
            s = s + this.grd[i];
        }
        s = 0;
        for (float temp : this.grd) {
            s = s + temp;
        }
        return s / this.grd.length;
    }
}
