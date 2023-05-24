package empresa.empresaagroalimentaria;

public class CongeladosPorAgua extends ProductosCongelados {

  private int salinidadAgua;
  private static final int MIN_SAL = 0;
  
  public CongeladosPorAgua(String nombre, String fechaCaducidad, String numLote, String paisOrigen,
      String fechaEnvasado, float tempMantenimiento, int salinidadAgua) throws ParametroInvalidoException {
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado, tempMantenimiento);
    if (salinidadAgua < MIN_SAL){
      throw new ParametroInvalidoException("ERROR: Salinidad no puede ser menor a 0.");
    }
    this.salinidadAgua = salinidadAgua;
  }

  public int getSalinidadAgua() {
    return salinidadAgua;
  }

  @Override
  public String toString() {
    return "|CONGELADOS POR AGUA| " + super.toString() + ", " + getSalinidadAgua();
  }

  public String toCSV(){
    return super.toCSV() + ", " + getSalinidadAgua();
  }

  @Override
  public int compareTo(Productos o) {
    return getNombre().compareTo(o.getNombre());
  }
}
