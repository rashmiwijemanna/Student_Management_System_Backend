package edu.icet.model.entity;

import jakarta.persistence.Id;
import lombok.*;
import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class StudentEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private int age;
    private String  phoneNumber;
}