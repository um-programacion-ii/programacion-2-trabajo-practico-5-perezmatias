package com.gestion.empleados.controller;

import com.gestion.empleados.model.Proyecto;
import com.gestion.empleados.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;

    @GetMapping
    public List<Proyecto> obtenerTodos() {
        return proyectoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(proyectoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Proyecto> crear(@RequestBody Proyecto proyecto) {
        return new ResponseEntity<>(proyectoService.guardar(proyecto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proyecto> actualizar(@PathVariable Long id, @RequestBody Proyecto proyecto) {
        return ResponseEntity.ok(proyectoService.actualizar(id, proyecto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        proyectoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/activos")
    public List<Proyecto> obtenerProyectosActivos() {
        return proyectoService.listarProyectosActivos();
    }
}