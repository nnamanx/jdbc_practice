public class Teacher {
    private int id;
    private String name;
    private String surname;
    private double salary;
    private String profession;
    private int teacher_row_info_id;

    @Override
    public String toString() {
        return "teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname +
                '}';
    }

    public Teacher(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }


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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getTeacher_row_info_id() {
        return teacher_row_info_id;
    }

    public void setTeacher_row_info_id(int teacher_row_info_id) {
        this.teacher_row_info_id = teacher_row_info_id;
    }
}
