package empresaprogramacion;

public class Programador extends Empleado {
  boolean esJunior;
  String lenguaje;
  boolean plusIdioma;

  public Programador(String idEmpleado, String nombre, double sueldo, String lenguaje,
      boolean esJunior, boolean plusIdioma) throws ParametroInvalidoException {
    super(idEmpleado, nombre, sueldo, TipoEmpleado.PROGRAMADOR);

    this.esJunior = esJunior;

    if (lenguaje.isEmpty()){
      // Comprueba que el campo lenguaje no esté vacio
      throw new ParametroInvalidoException("Nombre lenguaje vacio.");
    }
    this.lenguaje = lenguaje;

    this.plusIdioma = plusIdioma;
  }

  public String esJunior() {
    //Metodo para devolver la cadena del boolean
    if (esJunior) {
      return "es junior";
    } else
      return "NO es junior";
  }

  /* NO SE USA
  public String getLenguaje() {
    return lenguaje;
  }
  */

  @Override
  public String toString() {
    //Sobrescribimos el metodo toString de la clase Empleado
    return "|Programador|" + super.toString() + ", " + "Lenguaje: " + lenguaje + ", " + esJunior() + ", "
        + (plusIdioma ? "recibe plus de idioma" : "NO recibe plus de idioma");
  }

}
