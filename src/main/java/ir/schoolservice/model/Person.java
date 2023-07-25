package ir.schoolservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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

    @NotNull
    @Column(nullable = false, length = 10, unique = true)
    private int nationalCode;

    @Email(message = "email format is not correct")
    @Column(length = 124)
    private String email;

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Person() {
    }

    public Person(String name, String familyName, int nationalCode) {
        this.name = name;
        this.familyName = familyName;
        this.nationalCode = nationalCode;
    }

    public Person(String name, String familyName, int age, int nationalCode, String email) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.nationalCode = nationalCode;
        this.email = email;
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
