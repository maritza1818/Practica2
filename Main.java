public class Main {
    public static void main(String[] args) {

        Profesor profesor1 = new Profesor("Edith", 40);
        Profesor profesor2 = new Profesor("Diego", 38);

        Estudiante estudiante1 = new Estudiante("Jafet", 20);
        Estudiante estudiante2 = new Estudiante("Gustavo", 21);
        Estudiante estudiante3 = new Estudiante("Claudia", 20);

        Horario horario1 = new Horario("Lunes", "08:00", "10:00");
        Horario horario2 = new Horario("Miércoles", "10:00", "12:00");

        Curso curso1 = new Curso("Tecnología de Objetos", horario1);
        Curso curso2 = new Curso("Ingeniería de Software", horario2);

        Universidad universidad = new Universidad("Universidad Nacional de San Agustín");

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);

        Reporte reporte = new Reporte();

        System.out.println(profesor1);
        System.out.println(profesor2);

        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(universidad);

        System.out.println(reporte.generarReporte(estudiante1));
    }
}