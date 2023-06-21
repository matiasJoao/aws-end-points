package com.example.awsProject.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Table(uniqueConstraints ={@UniqueConstraint(columnNames = {"code"})})
@Builder
public class Produto {
    @Id
    @GenericGenerator(name="UUIDGenerator", strategy ="uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    private String id;
    @Column
    private String name;
    @Column
    private String code;
    @Column
    private Float price;
}
