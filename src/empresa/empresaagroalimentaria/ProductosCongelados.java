package empresa.empresaagroalimentaria;

public abstract class ProductosCongelados extends Productos {

  private float tempMantenimiento;
  private final static int MAX_TEMP = 10;
  private final static int MIN_TEMP = -40;

  public ProductosCongelados(String nombre, String fechaCaducidad, String numLote, String paisOrigen,
      String fechaEnvasado, float tempMantenimiento) throws ParametroInvalidoException {
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado, TipoProducto.CONGELADO);
    
    if (tempMantenimiento < MIN_TEMP || tempMantenimiento > MAX_TEMP){
      throw new ParametroInvalidoException("ERROR: Un alimento no puede ser conservado a esas temperaturas.");
    }
    this.tempMantenimiento = tempMantenimiento;
  }

  public float getTempMantenimiento() {
    return tempMantenimiento;
  }

  @Override
  public String toString() {
    return super.toString() + ", " + getTempMantenimiento();
  }

  public String toCSV(){
    return super.toCSV() + ", " + getTempMantenimiento();
  }
}
