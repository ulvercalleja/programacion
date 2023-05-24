package empresa.empresaagroalimentaria;

public class ProductosFrescos extends Productos {

  public ProductosFrescos(String nombre, String fechaCaducidad, String numLote, String paisOrigen,
      String fechaEnvasado) throws ParametroInvalidoException {
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado, TipoProducto.FRESCO);
  }

  @Override
  public String toString() {
    return "|FRESCO| " + super.toString();
  }

  public String toCSV() {
    return super.toCSV();
  }

  @Override
  public int compareTo(Productos o) {
    return getNombre().compareTo(o.getNombre());
  }
}
