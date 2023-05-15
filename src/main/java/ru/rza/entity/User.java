package ru.rza.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", columnDefinition = "VARCHAR(32)", unique = true)
    private String username;

    @Column(name = "name", columnDefinition = "VARCHAR(32)")
    private String name;

    @Column(name = "surname", columnDefinition = "VARCHAR(32)")
    private String surname;

    @Column(name = "patronymic", columnDefinition = "VARCHAR(32)")
    private String patronymic;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
