package com.example.App.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tipo_requerimiento {
    @Id
    private int id_tipo_requerimiento;
    private String Titulo;
    private String Descripcion;

}
