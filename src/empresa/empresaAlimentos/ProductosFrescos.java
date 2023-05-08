package empresa.empresaAlimentos;

import java.time.LocalDate;

public class ProductosFrescos extends Productos {
  // Constructor que inicializa los valores de las variables de instancia
  // utilizando el constructor de la superclase
  public ProductosFrescos(String nombre, String fechaCaducidad, String numLote, String paisOrigen, String fechaEnvasado) {
    // Llama al constructor de la superclase para inicializar las variables de
    // instancia heredadas
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado);
    this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
  }
  
}