# Prompts de Docker

## Prompt 1: Configuración de Docker Compose

### Prompt Utilizado:
"Actúa como un experto en DevOps. Genera un archivo docker-compose.yml para levantar MySQL 8.0 y PostgreSQL 16.
Requisitos:
1. Define nombres de contenedor claros.
2. Usa variables de entorno para usuarios, passwords y nombres de BD (empleados_db, empleados_user, empleados_pass).
3. Mapea los puertos estándar (3306 y 5432).
4. Configura volúmenes persistentes para que no se pierdan los datos al reiniciar.
5. Incluye healthchecks para asegurar que las bases de datos estén listas antes de conectar."

### Respuesta Recibida:
[Se recibió el archivo YAML con los servicios mysql y postgres configurados con healthchecks y volúmenes]

### Modificaciones Realizadas:
- Ninguna mayor, se verificó que las credenciales coincidan con los archivos application.yml de Spring Boot.

### Aprendizajes Obtenidos:
- La importancia de los volúmenes (`volumes`) para persistencia de datos en contenedores.
- Cómo usar `healthcheck` para orquestar la espera de servicios.