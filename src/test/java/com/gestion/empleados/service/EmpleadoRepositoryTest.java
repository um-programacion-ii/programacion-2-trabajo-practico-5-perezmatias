package com.gestion.empleados.repository;

import com.gestion.empleados.model.Departamento;
import com.gestion.empleados.model.Empleado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmpleadoRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Test
    void findBySalarioBetween_DeberiaRetornarEmpleadosEnRango() {
        // Arrange
        Departamento depto = new Departamento();
        depto.setNombre("IT");
        entityManager.persist(depto);

        Empleado e1 = new Empleado(null, "Juan", "Perez", "juan@test.com", LocalDate.now(), new BigDecimal("1000.00"), depto, null);
        Empleado e2 = new Empleado(null, "Ana", "Gomez", "ana@test.com", LocalDate.now(), new BigDecimal("2000.00"), depto, null);
        Empleado e3 = new Empleado(null, "Pedro", "Ruiz", "pedro@test.com", LocalDate.now(), new BigDecimal("3000.00"), depto, null);

        entityManager.persist(e1);
        entityManager.persist(e2);
        entityManager.persist(e3);
        entityManager.flush();

        // Act
        List<Empleado> resultados = empleadoRepository.findBySalarioBetween(new BigDecimal("1500"), new BigDecimal("2500"));

        // Assert
        assertEquals(1, resultados.size());
        assertEquals("Ana", resultados.get(0).getNombre());
    }
}