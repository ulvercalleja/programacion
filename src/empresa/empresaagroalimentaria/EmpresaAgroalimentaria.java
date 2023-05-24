package empresa.empresaagroalimentaria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class EmpresaAgroalimentaria {
  private static final String HEADER_CSV = "Tipo, NumLote, Nombre, FechaCaducidad, Precio";
  String nombre;
  final static String NOMBRE_ARCHIVO = "EmpresaAlimentos.csv";
  final static String NOMBRE_ARCHIVO_FRESCOS = "EmpresaAlimentosFrescos.csv";
  Map<String, Productos> mapaProductos;

  public EmpresaAgroalimentaria(String nombre) {
    this.nombre = nombre;
    this.mapaProductos = new TreeMap<>();
  }

  public void addProducto(Productos referencia) throws ParametroInvalidoException {
    if (mapaProductos.containsKey(referencia.getNumLote())) {
      throw new ParametroInvalidoException("ERROR: El lote introducido ya existe.");
    } else
      mapaProductos.put(referencia.getNumLote(), referencia);
  }

  public String toStringEmpresa() {
    String cadena = "Productos de la empresa " + nombre + ":\n";
    for (Productos producto : mapaProductos.values()) {
      cadena += producto + "\n";
    }
    return cadena;
  }

  public String toStringProductosFrescos() {
    String cadena = "Productos FRESCOS de la empresa " + nombre + ":\n";
    for (Productos producto : mapaProductos.values()) {
      if (producto.getTipo() == TipoProducto.FRESCO) {
        cadena += producto + "\n";
      }
    }
    return cadena;
  }

  public String toStringProductosCongelados() {
    String cadena = "Productos CONGELADOS de la empresa " + nombre + ":\n";
    for (Productos producto : mapaProductos.values()) {
      if (producto.getTipo() == TipoProducto.CONGELADO) {
        cadena += producto + "\n";
      }
    }
    return cadena;
  }

  public void guardarCsv(int opcionCSV) {
    if (opcionCSV == 1) {
      try (FileWriter escritor = new FileWriter(NOMBRE_ARCHIVO, true)) {
        escritor.write(HEADER_CSV + "\n");
        for (Productos producto : mapaProductos.values()) {
          escritor.write(producto.toCSV() + "\n");
        }
      } catch (Exception e) {
        System.out.println("Capturada excepcion guardando el archivo: " + e.getMessage());
      }
    }

    if (opcionCSV == 2) {
      try (FileWriter escritor = new FileWriter(NOMBRE_ARCHIVO_FRESCOS, true)) {
        escritor.write(HEADER_CSV + "\n");
        for (Productos producto : mapaProductos.values()) {
          if (producto.getTipo() == TipoProducto.FRESCO) {
            escritor.write(producto.toCSV() + "\n");
          }
        }
      } catch (Exception e) {
        System.out.println("Capturada excepcion guardando el archivo: " + e.getMessage());
      }
    }
  }

  public void cargarCsv(int opcionCSV) {
    if (opcionCSV == 1) {
      try (BufferedReader lectorBuffer = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
        String linea = "";
        while ((linea = lectorBuffer.readLine()) != null) {
          System.out.println(linea);
        }
      } catch (Exception e) {
        System.out.println("Capturada excepcion guardando el archivo: " + e.getMessage());
      }
    }

    if (opcionCSV == 2) {
      try (BufferedReader lectorBuffer = new BufferedReader(new FileReader(NOMBRE_ARCHIVO_FRESCOS))) {
        String linea = "";
        while ((linea = lectorBuffer.readLine()) != null) {
          System.out.println(linea);
        }
      } catch (Exception e) {
        System.out.println("Capturada excepcion guardando el archivo: " + e.getMessage());
      }
    }
  }

  public String toStringOrdenNombre() {
    String cadena = "Productos de la empresa " + nombre + "ordenados por nombre: \n";
    ArrayList<Productos> ordenPorNombre = new ArrayList<>(mapaProductos.values());
    Collections.sort(ordenPorNombre);

    for (Productos productos : ordenPorNombre) {
      cadena += productos + " \n";
    }
    return cadena;
  }

  public String toStringOrdenFechaCaducidad() {
    String cadena = "Productos de la empresa " + nombre + "ordenados por nombre: \n";
    ArrayList<Productos> ordenPorNombre = new ArrayList<>(mapaProductos.values());
    Collections.sort(ordenPorNombre, Productos.COMPARATOR_FECHA_CADUCIDAD);

    for (Productos productos : ordenPorNombre) {
      cadena += productos + " \n";
    }
    return cadena;
  }

}
