package empresa.empresaAlimentos;

import java.time.LocalDate;

public abstract class ProductosCongelados extends Productos {

  // Constructor que inicializa los valores de las variables de instancia
  // utilizando el constructor de la superclase
  public ProductosCongelados(String nombre, String fechaCaducidad, String numLote, String paisOrigen, String fechaEnvasado,
      float tempMantenimiento) {
    // Llama al constructor de la superclase para inicializar las variables de
    // instancia heredadas
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado);
    this.tempMantenimiento = tempMantenimiento;
    this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
  }

  float tempMantenimiento;
}