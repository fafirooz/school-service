package ir.schoolservice.model;

import jakarta.persistence.*;

@Entity
public class StudentDarsTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 2)
    private int score;

    @Override
    public String toString() {
        return "StudentDarsTeacher{" +
                "id=" + id +
                ", score=" + score +
                ", teacher=" + teacher +
                ", student=" + student +
                '}';
    }

    public StudentDarsTeacher() {}

    public StudentDarsTeacher(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
    }

    public StudentDarsTeacher(int score, Teacher teacher, Student student) {
        this.score = score;
        this.teacher = teacher;
        this.student = student;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
}
