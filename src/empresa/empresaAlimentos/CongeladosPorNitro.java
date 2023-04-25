package empresa.empresaAlimentos;

public class CongeladosPorNitro extends ProductosCongelados {

  // Constructor que inicializa los valores de las variables de instancia
  // utilizando el constructor de la superclase
  public CongeladosPorNitro(String nombre, String fechaCaducidad, String numLote, String paisOrigen, String fechaEnvasado,
      float tempMantenimiento, String métodoCongelación, String tiempoExposición) {
    // Llama al constructor de la superclase para inicializar las variables de
    // instancia heredadas
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado, tempMantenimiento);
  }

  String métodoCongelación;
  String tiempoExposición;
}
