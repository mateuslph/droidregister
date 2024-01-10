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
public class Lavagem {

     public Lavagem(String data, String hora) {
          this.data = data;
          this.hora = hora;
     }

     @Id
     @GeneratedValue(strategy = GenerationType.UUID)
     private String id;

     @Column(name = "data")
     private String data;

     @Column(name = "hora")
     private String hora;

}
