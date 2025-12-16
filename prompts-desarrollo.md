# Prompts de Desarrollo

## Prompt 1: Creación de Entidades JPA y Relaciones

### Prompt Utilizado:
"Actúa como un experto en Spring Boot y JPA. Necesito crear las entidades para un sistema de gestión de empleados.
Requisitos:
1. Entidad 'Empleado': id, nombre, apellido, email, fechaContratacion, salario. Relación ManyToOne con Departamento. Relación ManyToMany con Proyecto.
2. Entidad 'Departamento': id, nombre, descripcion. Relación OneToMany con Empleado.
3. Entidad 'Proyecto': id, nombre, descripcion, fechas inicio/fin. Relación ManyToMany con Empleado.
   Usa Lombok (@Data), validaciones de columna y define correctamente los mappedBy y JoinTable para evitar redundancia."

### Respuesta Recibida:
[Se recibió el código completo de las clases Empleado, Departamento y Proyecto con las anotaciones JPA correctas]

### Modificaciones Realizadas:
- Se ajustó el paquete base al del proyecto.
- Se verificó la precisión decimal en el campo salario (precision=10, scale=2).

### Explicación del Prompt:
Se solicitó explícitamente la configuración de relaciones bidireccionales para asegurar que Hibernate genere las claves foráneas correctamente en la tabla intermedia `empleado_proyecto`.

### Aprendizajes Obtenidos:
- Entendí cómo usar `@JoinTable` para controlar el nombre de la tabla intermedia en relaciones N:M.
- La importancia de `mappedBy` para indicar quién es el dueño de la relación.

---

## Prompt 2: Implementación de Repositorios y Servicios

### Prompt Utilizado:
"Actúa como un desarrollador Senior Java. Necesito implementar la capa de datos y negocio.
1. Crea repositorios (JpaRepository) para Empleado, Departamento y Proyecto. Agrega métodos para buscar por email, por nombre de departamento y por rango de salario.
2. Crea servicios (Interfaces e Impl) con @Transactional.
3. Maneja excepciones: Lanza una excepción personalizada ResourceNotFoundException si no encuentra el ID. Lanza IllegalArgumentException si intentamos crear un email o departamento duplicado.
4. Incluye lógica para buscar proyectos activos (fechaFin > hoy)."

### Respuesta Recibida:
[Se recibió el código completo de las interfaces Repository y las clases ServiceImpl con inyección de dependencias y manejo de excepciones]

### Modificaciones Realizadas:
- Se añadió la anotación `@Transactional(readOnly = true)` en los métodos de búsqueda para optimizar el rendimiento.
- Se creó una clase `ResourceNotFoundException` en un paquete separado `exception`.

### Explicación del Prompt:
Se pidió explícitamente el manejo de transacciones y excepciones para cumplir con los requisitos de robustez del TP y evitar datos inconsistentes.

### Aprendizajes Obtenidos:
- La diferencia entre `@Transactional` de lectura y escritura.
- Cómo usar Derived Query Methods (ej: `findByDepartamentoNombre`) para evitar escribir JPQL manual en consultas simples.