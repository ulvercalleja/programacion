package empresaprogramacion;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Empresa{
  public String nombre;
  private List<Empleado> empleados;
  Map<Integer, Empleado> mapaEmpleados;

  public Empresa(String nombre) {
    this.nombre = nombre;
    this.empleados = new ArrayList<>();
    this.mapaEmpleados = new HashMap<>();
  }

  public void addEmpleado(Empleado empleado) {
    empleados.add(empleado);
  }

  public void guardarEnCSV(String archivoGuardar) {
    // Guarda el archivo CSV
    try {
      FileWriter escritor = new FileWriter(archivoGuardar);
      for (Empleado empleado : empleados) {
        escritor.write(empleado.toString() + "\n");
      }
      escritor.close();
    } catch (IOException e) {
      System.out.println("Capturada IOException al guardar el archivo.");
    }
  }

  public void cargarDesdeCSV(String archivoCargar) {
    // Carga el archivo CSV
    try {
      BufferedReader buffer = new BufferedReader(new FileReader(archivoCargar));
      String linea = "";
      while ((linea = buffer.readLine()) != null) {
        System.out.println(linea);
      }
      buffer.close();
    } catch (Exception e) {
      System.out.println("Capturada IOException al cargar el archivo.");
    }

  }

  public String toStringEmpleados() {
    // Muestra todos los empleados
    String cadena = "Empleados de la " + nombre + ":\n";
    for (Empleado empleado : empleados) {
      cadena += empleado.toString() + "\n";
    }
    return cadena;
  }

  public String toStringProgramadores() {
    // Muestra todos los programadores
    String cadena = "Programadores de la " + nombre + ":\n";
    for (Empleado empleado : empleados) {
      if (empleado.getTipo() == TipoEmpleado.PROGRAMADOR) {
        cadena += empleado.toString() + "\n";
      }
    }
    return cadena;
  }

  public String toStringOrdenSueldo() {
    // TODO ordenar todos los empleados por orden de sueldo de MAYOR A MENOR
    String cadena = "# Listado de empleados ordenados por sueldo: \n";
    return cadena;
  }

  public String toStringOrdenNombre() {
    // Ordenar todos los empleados por orden de nombre alfabético
    String cadena = "# Listado de empleados ordenados por su nombre: \n";
    Collections.sort(empleados);
    for (Empleado empleado : empleados) {
      cadena += empleado.toString() + "\n";
    }
    return cadena;
  }
  
}
