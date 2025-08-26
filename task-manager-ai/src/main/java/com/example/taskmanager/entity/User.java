package com.example.taskmanager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="users")
@Data               // Generates getters, setters, toString, equals, hashCode using lombok
@NoArgsConstructor  // Generate default constructor using lombok
@AllArgsConstructor // Generate all-args constructor using lombok
@Builder            // Enables builder pattern: User.builder().username("x").build()
public class User {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment in DB
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role; // ROLE_USER, ROLE_ADMIN
    
}