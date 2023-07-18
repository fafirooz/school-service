package ir.schoolservice.model;

import jakarta.persistence.*;

@Entity
public class TeacherDars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.ORDINAL)
    private Dars dars;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
