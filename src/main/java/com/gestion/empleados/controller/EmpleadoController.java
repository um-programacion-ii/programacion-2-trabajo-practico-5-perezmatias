package com.gestion.empleados.controller;

import com.gestion.empleados.model.Empleado;
import com.gestion.empleados.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> obtenerTodos() {
        return empleadoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(empleadoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Empleado> crear(@RequestBody Empleado empleado) {
        return new ResponseEntity<>(empleadoService.guardar(empleado), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empleado> actualizar(@PathVariable Long id, @RequestBody Empleado empleado) {
        return ResponseEntity.ok(empleadoService.actualizar(id, empleado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        empleadoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/departamento/{nombre}")
    public List<Empleado> buscarPorDepartamento(@PathVariable String nombre) {
        return empleadoService.buscarPorDepartamento(nombre);
    }

    @GetMapping("/salario")
    public List<Empleado> buscarPorRangoSalario(
            @RequestParam BigDecimal min,
            @RequestParam BigDecimal max) {
        return empleadoService.buscarPorSalario(min, max);
    }
}