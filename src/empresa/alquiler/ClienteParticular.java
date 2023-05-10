package empresa.alquiler;

public class ClienteParticular extends AbstractCliente {

    public ClienteParticular(String nombre, String nif, String telefono, String correoElectronico) {
    super(nombre, nif);
    this.telefono = telefono;
    this.correoElectronico = correoElectronico;
  }

    String telefono;
    String correoElectronico;
  
    @Override
    public String toString() {
      String cadena = "";
      cadena += nif + " " + nombre + " (" + telefono + ", " + correoElectronico + ")";
      return cadena;
    }
  
  }
