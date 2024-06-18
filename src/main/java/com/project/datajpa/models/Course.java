package com.project.datajpa.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    @ManyToMany
    @JoinTable(
        name = "authors_courses",
        joinColumns = {
            @JoinColumn(name = "course_id")
        },
        inverseJoinColumns = {
            @JoinColumn(name = "author_id")
        }
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
