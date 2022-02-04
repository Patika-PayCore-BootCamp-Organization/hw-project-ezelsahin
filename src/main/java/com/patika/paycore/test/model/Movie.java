package com.patika.paycore.test.model;

import lombok.*;

import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String genre;

    private Integer releaseDate;

    private String director;

    private List<String> cast;


}
