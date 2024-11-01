package com.uch.citas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uch.citas.entities.Doctor;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

  @GetMapping
  public String doctors(Model model) {
    List<Doctor> doctors = new ArrayList<>();
    doctors.add(new Doctor(1, 12345678, "Juan", "Perez", "Cardiología", "123456789", "juan.perez@example.com", 1));
    doctors.add(new Doctor(2, 87654321, "Ana", "Gomez", "Neurología", "987654321", "ana.gomez@example.com", 1));
    doctors.add(new Doctor(3, 11223344, "Luis", "Ramirez", "Pediatría", "112233445", "luis.ramirez@example.com", 2));
    doctors.add(new Doctor(4, 55667788, "Maria", "Lopez", "Dermatología", "556677889", "maria.lopez@example.com", 2));
    doctors.add(new Doctor(1, 12345678, "Juan", "Perez", "Cardiología", "123456789", "juan.perez@example.com", 1));
    doctors.add(new Doctor(2, 87654321, "Ana", "Gomez", "Neurología", "987654321", "ana.gomez@example.com", 1));
    doctors.add(new Doctor(3, 11223344, "Luis", "Ramirez", "Pediatría", "112233445", "luis.ramirez@example.com", 2));
    doctors.add(new Doctor(4, 55667788, "Maria", "Lopez", "Dermatología", "556677889", "maria.lopez@example.com", 2));
    doctors.add(new Doctor(1, 12345678, "Juan", "Perez", "Cardiología", "123456789", "juan.perez@example.com", 1));
    doctors.add(new Doctor(2, 87654321, "Ana", "Gomez", "Neurología", "987654321", "ana.gomez@example.com", 1));
    model.addAttribute("doctors", doctors);
    return "doctors";
  }

}
