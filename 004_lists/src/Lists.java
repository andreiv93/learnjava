import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) throws Exception {
        List<Integer> array = new ArrayList<>();

        array.add(3);
        array.add(-2);
        array.add(14);

        int x = 9;

        List<Student> students = new LinkedList<>();

        Student temp = new Student();
        temp.setAge(20);
        temp.setName("Ana");

        students.add(temp);

        if (students.get(0).getAge() != 20) {
            throw new Exception("cod prost");
        }
    }

    static class Student {
        String name;
        int age;

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
    }
}
