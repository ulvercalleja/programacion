package empresa.empresaAlimentos;

public class CongeladosPorAgua extends ProductosCongelados {

  // Constructor que inicializa los valores de las variables de instancia
  // utilizando el constructor de la superclase
  public CongeladosPorAgua(String nombre, String fechaCaducidad, String numLote, String paisOrigen, String fechaEnvasado,
      float tempMantenimiento, int salinidadAgua) {
    // Llama al constructor de la superclase para inicializar las variables de
    // instancia heredadas
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado, tempMantenimiento);
  }

  int salinidadAgua;
}
