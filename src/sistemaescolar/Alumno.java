
package sistemaescolar;

/**
Nombre completo: Hugo Ivan Marin Galicia
Fecha de elaboración: 14 de Octubre de 2023
Nombre del Módulo: Programacion Orientada a Objetos
Nombre del Asesor: Claudia Patricia Rojano Hernández
 */

public class Alumno extends Usuario {
    private double calificacion;

    public Alumno(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico);
    }

    
    // Metodos para permitir obtener, guardar y mostrar en la consola la calificacion del alumno
    public double getCalificacion () {
      return calificacion;
    }
    
    public void guardarCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarCalificaciones() {
        System.out.println("Calificacion del Alumno: " + calificacion);
    }

    
    // Metodo que imprime el perfil del alumno
    
    @Override
    public void imprimirPerfil() {
        System.out.println("Perfil de Alumno:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Correo Electronico: " + getCorreoElectronico());
    }


}