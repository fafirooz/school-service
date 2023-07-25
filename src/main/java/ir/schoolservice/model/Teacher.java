package ir.schoolservice.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Teacher extends Person {

    @Column(nullable = false, length = 2)
    private int experience;

    @NotEmpty
    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private Set<TeacherDars> teacherDarsSet = new HashSet<>();

    @OneToMany( mappedBy = "teacher")
    private Set<StudentDarsTeacher> studentDarsTeachers;

    public Teacher(String name, String familyName, int nationalCode, int experience) {
        super(name, familyName, nationalCode);
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

    public Set<TeacherDars> getTeacherDarsSet() {
        return teacherDarsSet;
    }

    public void setTeacherDarsSet(Set<TeacherDars> teacherDarsSet) {
        this.teacherDarsSet = teacherDarsSet;
    }

    public void setStudentDarsTeachers(Set<StudentDarsTeacher> studentDarsTeachers) {
        this.studentDarsTeachers = studentDarsTeachers;
    }

    public Set<StudentDarsTeacher> getStudentDarsTeachers() {
        return studentDarsTeachers;
    }

    private void addStudentDarsTeacher(StudentDarsTeacher studentDarsTeacher) {
        studentDarsTeachers.add(studentDarsTeacher);
    }

    public void addTeacherDars(TeacherDars teacherDars) {
        teacherDarsSet.add(teacherDars);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;
        return name.equals(teacher.name);

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);
/*        hash = 37 * hash + (this.familyName != null ? this.familyName.hashCode() : 0);
        hash = 37 * hash + this.age;
        hash = 37 * hash + this.experience;*/
        return hash;
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
