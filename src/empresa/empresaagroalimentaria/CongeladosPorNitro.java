package empresa.empresaagroalimentaria;

public class CongeladosPorNitro extends ProductosCongelados {

  private String métodoCongelación;
  private String tiempoExposición;

  public CongeladosPorNitro(String nombre, String fechaCaducidad, String numLote, String paisOrigen,
      String fechaEnvasado, float tempMantenimiento, String métodoCongelación, String tiempoExposición) throws ParametroInvalidoException {
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado, tempMantenimiento);
    this.métodoCongelación = métodoCongelación;

    if (tiempoExposición.isEmpty()){
      throw new ParametroInvalidoException("ERROR: Tiempo de exposicion vacio.");
    }
    this.tiempoExposición = tiempoExposición;
  }

  public String getMétodoCongelación() {
    return métodoCongelación;
  }

  public String getTiempoExposición() {
    return tiempoExposición;
  }

  @Override
  public String toString() {
    return "|CONGELADOS POR NITRO| " + super.toString() + ", " + getMétodoCongelación() + 
    ", " + getTiempoExposición();
  }

  public String toCSV(){
    return super.toCSV() + ", " + getMétodoCongelación() + ", " + getTiempoExposición();
  }

  @Override
  public int compareTo(Productos o) {
    return getNombre().compareTo(o.getNombre());
  }
}