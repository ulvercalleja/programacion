package empresa.empresaagroalimentaria;

public class ProductosRefrigerados extends Productos {

  private int tempMantenimiento;
  private String codigoSupervision;
  private final static int MAX_TEMP = 10;
  private final static int MIN_TEMP = -40;

  public ProductosRefrigerados(String nombre, String fechaCaducidad, String numLote, String paisOrigen,
      String fechaEnvasado, int tempMantenimiento, String codigoSupervision) throws ParametroInvalidoException {
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado, TipoProducto.REFRIGERADO);

    if (tempMantenimiento < MIN_TEMP || tempMantenimiento > MAX_TEMP){
      throw new ParametroInvalidoException("ERROR: Un alimento no puede ser conservado a esas temperaturas.");
    }
    this.tempMantenimiento = tempMantenimiento;

    if (codigoSupervision.isEmpty()){
      throw new ParametroInvalidoException("ERROR: El codigo supervision no puede estar vacio.");
    }
    this.codigoSupervision = codigoSupervision;
  }

  public int getTempMantenimiento() {
    return tempMantenimiento;
  }

  public String getCodigoSupervision() {
    return codigoSupervision;
  }

  @Override
  public String toString() {
    return "|REFRIGERADOS| " + super.toString() + ", " + getTempMantenimiento() + ", " + getCodigoSupervision();
  }

  public String toCSV() {
    return super.toCSV() + ", " + getTempMantenimiento() + ", " + getCodigoSupervision();
  }

  @Override
  public int compareTo(Productos o) {
    return getNombre().compareTo(o.getNombre());
  }
}
