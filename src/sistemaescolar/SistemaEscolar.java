
package sistemaescolar;

/**
Nombre completo: Hugo Ivan Marin Galicia
Fecha de elaboración: 14 de Octubre de 2023
Nombre del Módulo: Programacion Orientada a Objetos
Nombre del Asesor: Claudia Patricia Rojano Hernández
 */

public class SistemaEscolar {

    
     public static void main(String[] args) {
        
         // Usuario 1 Alumno
        Alumno alumno = new Alumno(1, "Aylin", "Marin", "aylin@example.com");
        alumno.guardarCalificacion(9.2);

        // Usuario 2 Tutor
        Tutor tutor = new Tutor(2, "Evelin", "Lopez", "evelin@example.com", alumno);

        // Usuario 3 Maestro
        Maestro maestro = new Maestro(3, "Joselyn", "Lopez", "joselyn@example.com");

        // Simular acciones de base de datos
        AccionesBaseDatos acciones = (AccionesBaseDatos) tutor;
        acciones.guardar();
        acciones.actualizar();
        acciones.eliminar();
        
        
        // Imprimir perfiles y calificaciones del alumno
        alumno.imprimirPerfil();
        alumno.mostrarCalificaciones();
        tutor.imprimirPerfil();
        maestro.imprimirPerfil();
        
    }
}
