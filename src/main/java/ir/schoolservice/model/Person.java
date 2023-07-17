package ir.schoolservice.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    

    @Column(nullable = false, length = 124)
    protected String name;

    @Column(nullable = false, length = 124)
    protected String familyName;

    @Column
    protected int age; // optional

    public Person() {
    }

    public Person(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    public Person(String name, String familyName, int age) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
