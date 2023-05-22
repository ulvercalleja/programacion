package empresaprogramacion;

public abstract class Empleado implements Comparable<Empleado> {
  String idEmpleado;
  String nombre;
  double sueldo;
  TipoEmpleado tipo;
  final static String idEmpleadoRegexp = "[A-Z]{1}[8]{1}[0-9]{3}";

  public Empleado(String idEmpleado, String nombre, double sueldo, TipoEmpleado tipo)
      throws ParametroInvalidoException {
    if (nombre.isEmpty()) {
      // Comprueba que el nombre no esté vacio
      throw new ParametroInvalidoException("El nombre esta vacio.");
    }
    this.nombre = nombre;
    if (sueldo < 0) {
      // Comprueba que el sueldo no sea menor a 0
      throw new ParametroInvalidoException("El sueldo es menor a 0.");
    }
    this.sueldo = sueldo;
    if (!idEmpleado.matches(idEmpleadoRegexp)) {
      // Comprueba id cumpla el patrón
      throw new ParametroInvalidoException("El id introducido contiene caracteres no soportados .");
    }

    this.idEmpleado = idEmpleado;
    this.tipo = tipo;
  }
  
  public String getIdEmpleado() {
    return idEmpleado;
  }

  /* NO SE USA
  public String getNombre() {
    return nombre;
  }

  public double getSueldo() {
    return sueldo;
  }
  */
  public TipoEmpleado getTipo() {
    return tipo;
  }
  
  @Override
  public String toString() {
    // Metodo toString padre que heredaran la clase Programador y Gerente
    return "ID Empleado: " + idEmpleado + ", Nombre: " + nombre + ", sueldo: " + sueldo;
  }

  public int compareTo(Empleado o) {
    // Compara nombres, se usará para ordenarlos alfabeticamente
    return nombre.compareTo(o.nombre);
  }
}
