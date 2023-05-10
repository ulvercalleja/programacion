import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainContadorPalabras {
  static final String NOMBRE_FICHERO = "input.txt";
  static final String REGEX_SEPARADOR_PALABRAS = "[ ,.:;()\"]";

  public static void main(String[] args) {
    // Construimos el mapa
    Map<String, Integer> mapaContadorPalabras = new HashMap<>();

    // Declaramos la referencia fuera del try para poder cerrarlo en el finally
    BufferedReader lectorConBuffer = null;
    try {
      String linea = "";
      //Abrimos el stream de datos
      lectorConBuffer = new BufferedReader(new FileReader(NOMBRE_FICHERO));

      while ((linea = lectorConBuffer.readLine()) != null) {
        String[] palabras = linea.split(REGEX_SEPARADOR_PALABRAS);
        for (String palabra : palabras) {
          Integer count = mapaContadorPalabras.getOrDefault(palabra, 0);
          mapaContadorPalabras.put(palabra, count + 1);
        }
      }

    } catch (IOException e) {
      System.out.println("Excepción en lectorConBuffer.close(): " + e);
    } finally {
      try {
        if (lectorConBuffer != null) {
          //Cerramos el stream dentro del finally
          lectorConBuffer.close();
        }
      } catch (IOException e) {
        System.out.println("Excepción en lectorConBuffer.close(): " + e);
      }
    }
    // Recorremos el mapa con este for each
    for (String key : mapaContadorPalabras.keySet()) {
      System.out.println(key + " -> " + mapaContadorPalabras.get(key));
    }
  }
}