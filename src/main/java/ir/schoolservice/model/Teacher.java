package ir.schoolservice.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Teacher extends Person {

    @Column(nullable = false, length = 2)
    private int experience;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.REMOVE)
    private Set<TeacherDars> teacherDarsSet;

    @OneToMany( mappedBy = "teacher")
    private Set<StudentDarsTeacher> studentDarsTeachers;

    public Teacher(String name, String familyName, int experience) {
        super(name, familyName);
        this.experience = experience;
    }

    public Teacher() {

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Set<StudentDarsTeacher> getStudentDarsTeachers() {
        return studentDarsTeachers;
    }

    private void addStudentDarsTeacher(StudentDarsTeacher studentDarsTeacher) {
        studentDarsTeachers.add(studentDarsTeacher);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "experience=" + experience +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                '}';
    }
}
