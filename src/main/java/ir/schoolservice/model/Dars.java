package ir.schoolservice.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Dars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "dars")
    private Set<StudentDarsTeacher> studentDarsTeachers;

    public Dars() {
    }
    public Dars(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Set<StudentDarsTeacher> getStudentDarsTeachers() {
        return studentDarsTeachers;
    }

    private void addStudentDarsTeacher(StudentDarsTeacher studentDarsTeacher) {
        studentDarsTeachers.add(studentDarsTeacher);
    }
}
