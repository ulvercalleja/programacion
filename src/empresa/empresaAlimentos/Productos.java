package empresa.empresaAlimentos;

import java.time.LocalDate;

public abstract class Productos {
  String nombre;
  LocalDate fechaCaducidad;
  String numLote;
  String paisOrigen;
  LocalDate fechaEnvasado;

  // Constructor que inicializa los valores de las variables de instancia
  public Productos(String nombre, String fechaCaducidad, String numLote, String paisOrigen, String fechaEnvasado) {
    // Convierte las cadenas String a objetos LocalDate y los asigna a las variables
    // de instancia
    this.nombre = nombre;
    this.fechaCaducidad = LocalDate.parse(fechaCaducidad);
    this.numLote = numLote;
    this.paisOrigen = paisOrigen;
    this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
  }
  
  public String toCsv() {
    return nombre + "," + fechaCaducidad + "," + numLote
        + "," + fechaEnvasado + "," + paisOrigen;
  }
}