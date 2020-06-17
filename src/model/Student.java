package model;

public class Student {

    private String name;
    private String gender;
    private int age;
    private long ID;

    public Student(String name, String gender, int age, long ID) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }

    public static void main(String[] args) {
        Student stu = new Student("梁志斌","男",23,2016270101);
        System.out.println(stu);
    }
}
