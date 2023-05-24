package empresa.empresaagroalimentaria;

public class CongeladosPorAire extends ProductosCongelados {

  private double porcentajeNitrógeno;
  private double porcentajeOxígeno;
  private double porcentajeDióxidoCarbono;
  private double porcentajeVaporAgua;

  private final static int MIN_OXIGENO = 0;
  private final static int MIN_NITRO = 0;
  private final static int MIN_DIOXIDO = 0;
  private final static int MIN_VAPOR = 0;

  public CongeladosPorAire(String nombre, String fechaCaducidad, String numLote, String paisOrigen,
      String fechaEnvasado, float tempMantenimiento, double porcentajeNitrógeno, double porcentajeOxígeno,
      double porcentajeDióxidoCarbono, double porcentajeVaporAgua) throws ParametroInvalidoException {
    super(nombre, fechaCaducidad, numLote, paisOrigen, fechaEnvasado, tempMantenimiento);

    if (porcentajeOxígeno < MIN_OXIGENO) {
      throw new ParametroInvalidoException("ERROR: Oxigeno no puede ser menor a 0.");
    }
    this.porcentajeNitrógeno = porcentajeOxígeno;

    if (porcentajeOxígeno < MIN_NITRO) {
      throw new ParametroInvalidoException("ERROR: Nitrogeno no puede ser menor a 0.");
    }
    this.porcentajeNitrógeno = porcentajeNitrógeno;

    if (porcentajeDióxidoCarbono < MIN_DIOXIDO) {
      throw new ParametroInvalidoException("ERROR: Dioxido no puede ser menor a 0.");
    }
    this.porcentajeDióxidoCarbono = porcentajeDióxidoCarbono;

    if (porcentajeVaporAgua < MIN_VAPOR) {
      throw new ParametroInvalidoException("ERROR: Vapor no puede ser menor a 0.");
    }
    this.porcentajeVaporAgua = porcentajeVaporAgua;
  }

  public double getPorcentajeNitrógeno() {
    return porcentajeNitrógeno;
  }

  public double getPorcentajeOxígeno() {
    return porcentajeOxígeno;
  }

  public double getPorcentajeDióxidoCarbono() {
    return porcentajeDióxidoCarbono;
  }

  public double getPorcentajeVaporAgua() {
    return porcentajeVaporAgua;
  }

  @Override
  public String toString() {
    return "|CONGELADOS POR AIRE| " + super.toString() + ", " + getPorcentajeNitrógeno() +
        ", " + getPorcentajeOxígeno() + ", " + getPorcentajeDióxidoCarbono() + ", " + getPorcentajeVaporAgua();
  }

  public String toCSV(){
      return super.toCSV() + ", " + getPorcentajeNitrógeno() +
      ", " + getPorcentajeOxígeno() + ", " + getPorcentajeDióxidoCarbono() + ", " + getPorcentajeVaporAgua();
  }

  @Override
  public int compareTo(Productos o) {
    return getNombre().compareTo(o.getNombre());
  }
}
