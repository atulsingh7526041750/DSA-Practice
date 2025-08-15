import java.util.HashSet;

public class SetMapQuestion {
    public static void main(String[] args) {
        Student student = new Student(1,"Atul");
        Student student1 = new Student(1,"Alok");
        Student student2 = new Student(1,"Sidh");
        HashSet<Student>set = new HashSet<>();
        set.add(student);

        set.add(student1);
        set.add(student2);
        System.out.println(set);
        set.remove(student);
        System.out.println(set);


    }



}
class Student{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
