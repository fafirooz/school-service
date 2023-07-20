package ir.schoolservice.model;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Student extends Person {

    @Enumerated(EnumType.ORDINAL)
    private EducatoinLevel educatoinLevel;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "student")
    private Set<StudentDarsTeacher> studentDarsTeachers;

    public Set<StudentDarsTeacher> getStudentDarsTeachers() {
        return studentDarsTeachers;
    }

    private void addStudentDarsTeacher(StudentDarsTeacher studentDarsTeacher) {
        studentDarsTeachers.add(studentDarsTeacher);
    }

    public Student() {
    }

    public Student(String name, String familyName, int nationalCode, EducatoinLevel educatoinLevel) {
        super(name, familyName, nationalCode);
        this.educatoinLevel = educatoinLevel;
    }

    public EducatoinLevel getEducatoinLevel() {
        return educatoinLevel;
    }

    public void setEducatoinLevel(EducatoinLevel educatoinLevel) {
        this.educatoinLevel = educatoinLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "educatoinLevel=" + educatoinLevel +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                '}';
    }
}
