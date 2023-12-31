package com.homework2.homework2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String userName;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String telephoneNumber;
    @Builder.Default
    private UserRole userRole = UserRole.KİSİ;

    @OneToMany(mappedBy="user")
    @JsonIgnore
    private List<Comment> comments;

}
