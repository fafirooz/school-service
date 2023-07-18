package ir.schoolservice.model;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Teacher extends Person {

    @Column(nullable = false, length = 2)
    private int experience;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.REMOVE)
    private Set<TeacherDars> teacherDarsSet = new HashSet<>();

    @OneToMany( mappedBy = "teacher")
    private Set<StudentDarsTeacher> studentDarsTeachers = new HashSet<>();

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

    public void addTeacherDars(TeacherDars teacherDars) {
        teacherDarsSet.add(teacherDars);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;
        return name == teacher.name &&
         familyName == teacher.familyName &&
         experience == teacher.experience &&
         age == teacher.age;

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 37 * hash + (this.familyName != null ? this.familyName.hashCode() : 0);
        hash = 37 * hash + this.age;
        hash = 37 * hash + this.experience;
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
