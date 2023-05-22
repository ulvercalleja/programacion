package empresaprogramacion;
import java.lang.Exception;

public class ParametroInvalidoException extends Exception{
  public ParametroInvalidoException(String mensaje) {
    super(mensaje);
  }
}
