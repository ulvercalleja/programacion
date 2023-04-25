package empresa.empresaAlimentos;

public class CongeladosPorAire extends ProductosCongelados {

  // Constructor que inicializa los valores de las variables de instancia
  // utilizando el constructor de la superclase
  public CongeladosPorAire(String nombre, String fechaCaducidad, String numLote, String paisOrigen,
      String fechaEnvasado, float tempMantenimiento, double porcentajeNitrógeno, double porcentajeOxígeno,
      double porcentajeDióxidoCarbono, double porcentajeVaporAgua) {
    // Llama al constructor de la superclase para inicializar las variables de
    // instancia heredadas
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado, tempMantenimiento);
  }

  double porcentajeNitrógeno;
  double porcentajeOxígeno;
  double porcentajeDióxidoCarbono;
  double porcentajeVaporAgua;
}
