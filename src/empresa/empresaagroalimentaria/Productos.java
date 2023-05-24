package empresa.empresaagroalimentaria;

import java.time.LocalDate;
import java.util.Comparator;

public abstract class Productos implements Comparable<Productos>{

  public static final Comparator<Productos> COMPARATOR_FECHA_CADUCIDAD = new Comparator<Productos>() {
    @Override
    public int compare(Productos o1, Productos o2) {
      return o1.getFechaCaducidad().compareTo(o2.getFechaCaducidad());
    }
  };

  private String nombre;
  private LocalDate fechaCaducidad;
  private String numLote;
  private String paisOrigen;
  private LocalDate fechaEnvasado;
  private TipoProducto tipo;

  private final static String REGEX_NUMLOTE = "[A-Z]{2}[0-9]{6}";
  
  public Productos(String nombre, String fechaCaducidad, String numLote, String paisOrigen,
  String fechaEnvasado, TipoProducto tipo) throws ParametroInvalidoException{

    if (nombre.isEmpty()){
      throw new ParametroInvalidoException("ERROR: El nombre no puede estar vacio.");
    }
    this.nombre = nombre;

    this.fechaCaducidad = LocalDate.parse(fechaCaducidad);
    if (!numLote.matches(REGEX_NUMLOTE)){
      throw new ParametroInvalidoException("ERROR: El numero de lote es incorrecto.");
    }
    this.numLote = numLote;

    if (paisOrigen.isEmpty()){
      throw new ParametroInvalidoException("ERROR: El pais no puede estar vacio.");
    }
    this.paisOrigen = paisOrigen;
    this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
    this.tipo = tipo;
  }

  
  public String getNombre() {
    return nombre;
  }


  public LocalDate getFechaCaducidad() {
    return fechaCaducidad;
  }


  public String getNumLote() {
    return numLote;
  }


  public String getPaisOrigen() {
    return paisOrigen;
  }


  public LocalDate getFechaEnvasado() {
    return fechaEnvasado;
  }

  public TipoProducto getTipo() {
    return tipo;
  }

  @Override
  public String toString() {
      return getNombre() + ", " + getFechaCaducidad() + ", " + getNumLote() + ", " + getPaisOrigen() 
      + ", " + getFechaEnvasado();
  }

  public String toCSV(){
    return getNombre() + ", " + getFechaCaducidad() + ", " + getNumLote() + ", " + getPaisOrigen() 
      + ", " + getFechaEnvasado();
  }
  

}
