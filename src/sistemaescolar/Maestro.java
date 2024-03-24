
package sistemaescolar;

/**
Nombre completo: Hugo Ivan Marin Galicia
Fecha de elaboración: 14 de Octubre de 2023
Nombre del Módulo: Programacion Orientada a Objetos
Nombre del Asesor: Claudia Patricia Rojano Hernández
 */

public class Maestro extends Usuario {
    public Maestro(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico);
    }

    
    // Metodo que imprime el perfil del maestro
    
    @Override
    public void imprimirPerfil() {
        System.out.println("Perfil de Maestro:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Correo Electronico: " + getCorreoElectronico());
    }
}
