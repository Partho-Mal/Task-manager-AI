package com.example.taskmanager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")
@Data                         // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor            // Default constructor
@AllArgsConstructor           // Constructor with all fields
@Builder                      // Allows builder pattern (Task.builder()...)
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private String priority;    // High, Medium, Low
    private String sentiment;   // Optional (Positive, Negative)

    @ManyToOne
    @JoinColumn(name = "owner_id") // foreign key in task table
    private User owner;
    
}