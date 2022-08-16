
package udea.com.reto3;

/**
 *
 * @author hughu
 */
public class UsuarioMoodle {
    
    // atributos de la super clase Usuario Moodle
    private String nombreCompleto;
    private String documentoIdentidad;
    private String password;
    private String correo;
    private String descripcion;
    
    // levantamos constructor

    public UsuarioMoodle(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.password = password;
        this.correo = correo;
        this.descripcion = descripcion;
    }
    
    //setters 

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //getters

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getPassword() {
        return password;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    

    //metodo
    public void editarPerfil(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion){
     this.setNombreCompleto(nombreCompleto);
     this.setDocumentoIdentidad(documentoIdentidad);
     this.setPassword(password);
     this.setCorreo(correo);
     this.setDescripcion(descripcion);
    }
    
    
    /**********/
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombreCompleto() + 
                "\nDocumento de identidad: " + getDocumentoIdentidad() + 
                "\nContraseña: " + getPassword() + //atributo heredado de la clase persona
                "\nCorreo : " + getCorreo() + // atributo propio de la clase estudiante, no necesita getter
                "\nDescripción : " + getDescripcion());
    }

   

    
}
