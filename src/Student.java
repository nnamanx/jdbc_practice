public class Student {

    long id;
    String name;
    String surname;
    String major;

    double fee;

    public Student(long id, String name, String surname, String major, double fee) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.major = major;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", major='" + major + '\'' +
                ", fee=" + fee +
                '}';
    }
}
