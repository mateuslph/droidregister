package com.mateus.droidregister.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Table(name="products")
@Entity(name="products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class logs {

     @Id
     @GeneratedValue(strategy = GenerationType.UUID)
     private String id;
     private LocalDate date;
     private LocalTime hour;

}
