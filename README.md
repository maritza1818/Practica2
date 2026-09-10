# Laboratorio 02 - Tecnología de Objetos

## Integrantes
-Yunque Quispe, Gustavo Alonso
-Llave Aguilar, Jafet Martin
- Maritza Claudia Marron Puma
## Descripción

En este laboratorio se implementó un sistema sencillo en Java aplicando diferentes relaciones entre clases de la programación orientada a objetos.

El sistema representa algunos elementos de una universidad y permite trabajar con las relaciones de herencia, composición, agregación y dependencia.

## Clases

- Persona
- Profesor
- Estudiante
- Horario
- Curso
- Universidad
- Reporte
- Main

## Relaciones entre clases

- Herencia: Profesor y Estudiante heredan de Persona.
- Composición: Curso está compuesto por un Horario.
- Agregación: Universidad agrupa una lista de Cursos.
- Dependencia: Reporte utiliza temporalmente a un Estudiante para generar un reporte.

## Implementación

El programa crea 2 profesores, 3 estudiantes y 2 cursos, cada uno con su respectivo horario. Luego los cursos son agregados a la Universidad y finalmente se genera un reporte de uno de los estudiantes.

También se aplicó encapsulamiento mediante atributos privados y el uso de constructores, getters y setters.

## Lenguaje

La implementación principal fue realizada en Java.
