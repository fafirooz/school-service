package ir.schoolservice.model;

import jakarta.persistence.*;

@Entity
public class Teacher extends Person {

    @Column(nullable = false, length = 2)
    private int experience;

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
