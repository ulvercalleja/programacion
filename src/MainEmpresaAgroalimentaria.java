import empresa.empresaagroalimentaria.CongeladosPorAgua;
import empresa.empresaagroalimentaria.CongeladosPorAire;
import empresa.empresaagroalimentaria.CongeladosPorNitro;
import empresa.empresaagroalimentaria.EmpresaAgroalimentaria;
import empresa.empresaagroalimentaria.ParametroInvalidoException;
import empresa.empresaagroalimentaria.Productos;
import empresa.empresaagroalimentaria.ProductosFrescos;
import empresa.empresaagroalimentaria.ProductosRefrigerados;

import java.util.Scanner;

public class MainEmpresaAgroalimentaria {
  public static void main(String[] args) {
    EmpresaAgroalimentaria empresa = new EmpresaAgroalimentaria("AgroUlver");
    Scanner sc = new Scanner(System.in);

    int opcion = 0;
    int opcionCSV = 0;

    Productos referencia;

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new ProductosFrescos("Agua", "2023-05-30", "ES202317", "ES", "2023-04-18");
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new ProductosFrescos("Tomate", "2023-05-30", "ES208317", "ES", "2023-04-18");
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new ProductosFrescos("Lechuga", "2023-06-30", "ES202335", "FR", "2023-04-15");
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new ProductosRefrigerados("Leche", "2023-05-29", "ES202316",
          "FR", "2023-04-15", 5, "CU00687B");
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new ProductosRefrigerados("Huevos", "2023-06-25", "ES202319",
          "IT", "2023-08-21", 4, "CU00690B");
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new ProductosRefrigerados("Filetes", "2023-06-10", "ES202676",
          "ES", "2023-07-25", 4, "CU01327A");
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new CongeladosPorAgua("Gambas Congeladas", "2023-09-21", "ES450231",
          "FR", "2023-04-25", 3, 4);
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new CongeladosPorAgua("Guisantes Congelados", "2023-08-19", "ES760831",
          "IT", "2023-04-21", 4, 3);
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new CongeladosPorAire("Helado de Vainilla", "2023-09-10", "ES827931",
          "IT", "2023-05-26", 3, 3, 4, 3, 4);
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new CongeladosPorAire("Merluza", "2023-07-15", "ES823431",
          "ES", "2023-04-21", 3, 4, 5, 3, 4);
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    System.out.println("Intentamos añadir el producto...");
    try {
      referencia = new CongeladosPorNitro("Pollo", "2023-09-10", "ES822931",
          "IT", "2023-05-26", 3, "?", "1 semana");
      empresa.addProducto(referencia);
      System.out.println("OK");
    } catch (ParametroInvalidoException e) {
      System.out.println("ERROR al añadir el producto. " + e.getMessage());
    }

    do {
      imprimirMenu();

      opcion = sc.nextInt();
      sc.nextLine();// Limpiar buffer

      switch (opcion) {
        case 1:
          System.out.println("Introduzca...");
          System.out.println("1. Guardar TODO.");
          System.out.println("2. Guardar FRESCOS.");

          opcionCSV = sc.nextInt();
          sc.nextLine();// Limpiar buffer
          
          empresa.guardarCsv(opcionCSV);
          break;

        case 2:
          System.out.println("Introduzca...");
          System.out.println("1. Cargar TODO.");
          System.out.println("2. Cargar FRESCOS.");

          opcionCSV = sc.nextInt();
          sc.nextLine();// Limpiar buffer

          empresa.cargarCsv(opcionCSV);
          break;

        case 3:
          System.out.println(empresa.toStringEmpresa());
          break;

        case 4:
          System.out.println(empresa.toStringProductosFrescos());
          break;

        case 5:
          System.out.println(empresa.toStringProductosCongelados());
          break;

        case 6:
          System.out.println(empresa.toStringOrdenNombre());
          break;

        case 7:
          System.out.println(empresa.toStringOrdenFechaCaducidad());
          break;

        case 8:
          System.out.println("Salimos...");
          break;

        default:
          System.out.println("Opción inválida");
          break;
      }
    } while (opcion != 8);
    sc.close();
  }

  private static void imprimirMenu() {
    System.out.println("### Menú empresa agroalimentaria:");
    System.out.println("# Elija la opción deseada:");
    System.out.println("1-> Guardar en csv");
    System.out.println("2-> Cargar productos desde los ficheros csv");
    System.out.println("3-> Imprimir todo");
    System.out.println("4-> Imprimir productos frescos");
    System.out.println("5-> Imprimir productos congelados");
    System.out.println("6-> Imprimir productos ordenados por nombre");
    System.out.println("7-> Imprimir productos ordenados por fecha de caducidad");
    System.out.println("8-> Salir");
  }
}