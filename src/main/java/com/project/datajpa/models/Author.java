package com.project.datajpa.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@NamedQuery(
    name = "Author.findAuthorByNamedQuery",
    query = "select a from Author a where a.age >= :age"
)
public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String lastName;

    @Column(
        unique = true,
        nullable = false
    )
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

    @Override
    public String toString() {
        return "Author{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", age=" + age +
            '}';
    }
}
