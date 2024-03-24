
package sistemaescolar;

/**
Nombre completo: Hugo Ivan Marin Galicia
Fecha de elaboración: 14 de Octubre de 2023
Nombre del Módulo: Programacion Orientada a Objetos
Nombre del Asesor: Claudia Patricia Rojano Hernández
 */

public class Tutor extends Usuario implements AccionesBaseDatos {
    private Alumno alumno;
    private AccionesBaseDatos acciones;
    
    public Tutor(int id, String nombre, String apellido, String correoElectronico, Alumno alumno) {
        super(id, nombre, apellido, correoElectronico);
        this.alumno = alumno;
        this.acciones = acciones;
    }

    
    // Implementa los métodos de la interfaz AccionesBaseDatos
    @Override
    public void guardar() {
        // Lógica para guardar datos en la base de datos
    }

    @Override
    public void actualizar() {
        // Lógica para actualizar datos en la base de datos
    }

    @Override
    public void eliminar() {
        // Lógica para eliminar datos en la base de datos
    }

    
    // Metodo que imprime el perfil del tutor
    
    @Override
    public void imprimirPerfil() {
    System.out.println("Perfil de Tutor:");
    System.out.println("ID: " + getId());
    System.out.println("Nombre: " + getNombre());
    System.out.println("Apellido: " + getApellido());
    System.out.println("Correo Electronico: " + getCorreoElectronico());

    // Metodo que imprime la calificacion y nombre del alumno asociado al tutor
    if (alumno != null) {
        System.out.println("Nombre del Alumno: " + alumno.getNombre());
        System.out.println("Apellido: " + alumno.getApellido());
        System.out.println("Calificacion del Alumno: " + alumno.getCalificacion());
    }
    
    
}

  

   
}

