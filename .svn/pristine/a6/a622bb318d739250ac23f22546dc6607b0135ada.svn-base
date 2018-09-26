package ru.cbr.tomsk.multimodule.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author 69NovoshintseAV@cbr.ru
 *
 * Сущность "Автор"
 */

@Entity
@Table(name = "author")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author implements Serializable {
    /**
     * Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @JsonIgnore
    private Long id;

    /**
     * First Name.
     */
    @Column(name = "FIRST_NAME")
    private String firstName;

    /**
     * Last Name.
     */
    @Column(name = "LAST_NAME")
    private String lastName;
}
