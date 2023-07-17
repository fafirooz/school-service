package ir.schoolservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Student extends Person {

    @Enumerated(EnumType.ORDINAL)
    private EducatoinLevel educatoinLevel;

    public Student() {
    }

    public Student(String name, String familyName, EducatoinLevel educatoinLevel) {
        super(name, familyName);
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
