package ir.schoolservice.model;

import jakarta.persistence.*;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(nullable = false, unique = true)
    private String name;
    public Teacher(int Id , String name){
        this.Id = Id;
        this.name = name;

    }

    public Teacher() {

    }

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id= Id;

    }
    public String getName(){
        return name;
    }
    public void setName( String name){
        this.name= name;
    }
}
