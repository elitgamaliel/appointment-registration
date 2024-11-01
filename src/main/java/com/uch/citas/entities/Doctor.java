package com.uch.citas.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
  
    private int idMedico;
    private int dni;
    private String nombre;
    private String apellidos;
    private String especialidad;
    private String telefono;
    private String email;
    private int idClinica;

}
