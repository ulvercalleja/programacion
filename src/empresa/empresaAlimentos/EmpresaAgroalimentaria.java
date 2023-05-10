package empresa.empresaAlimentos;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class EmpresaAgroalimentaria {
  String nombre;
  List <ProductosFrescos> listaFrescos;
  List <ProductosRefrigerados> listaRefrigerados;
  List <ProductosCongelados> listaCongelados;

  public EmpresaAgroalimentaria(String nombre) {
    this.nombre = nombre;
    this.listaFrescos = new ArrayList<>();
    this.listaRefrigerados = new ArrayList<>();
    this.listaCongelados = new ArrayList<>();
  }

  // metodos para añadir productos
  public void addProductosFrescos(ProductosFrescos productoFresco) {
    listaFrescos.add(productoFresco);
  }

  public void addProductosRefrigerados(ProductosRefrigerados productoRefrigerado) {
    listaRefrigerados.add(productoRefrigerado);
  }

  public void addProductosCongelados(ProductosCongelados productoCongelado) {
    listaCongelados.add(productoCongelado);
  }

  public void guardarCsv() {
    try {
      //Abro stream
      FileWriter escritorFrescos = new FileWriter("ProductoFresco.csv");
      for (ProductosFrescos fresco : listaFrescos) {
        escritorFrescos.write(fresco.toCsv() + "\n");
      }
      escritorFrescos .close();
    } catch (Exception e) {
      System.out.println("Se ha producido un error :()");
    }
    try {
      FileWriter escritorRefrigerados = new FileWriter("ProductoRefrigerado.csv");
      for (ProductosRefrigerados refrigerado : listaRefrigerados) {
        escritorRefrigerados.write(refrigerado.toCsv() + "\n");
      }
      escritorRefrigerados.close();
    } catch (Exception e) {
      System.out.println("Se ha producido un error :()");
    }
    try {
      FileWriter escritorCongelados = new FileWriter("ProductosCongelados.csv",true);
      for (ProductosCongelados congeladosPorAgua : listaCongelados) {
        escritorCongelados.write(congeladosPorAgua.toCsv() + "\n");
      }
      escritorCongelados.close();
    } catch (Exception e) {
      System.out.println("Se ha producido un error :()");
    }
  }

  public void cargarCsv() {
    try {
      FileReader lectorFrescos = new FileReader("ProductoFresco.csv");
      BufferedReader bufferFrescos = new BufferedReader(lectorFrescos);
      String linea;
         while ((linea = bufferFrescos.readLine()) != null) {
            System.out.println(linea);
         }
        lectorFrescos.close();
        bufferFrescos.close(); 
    } catch (IOException e) {
        System.out.println("Se ha producido un error :()");
    }

    try {
      FileReader lectorRefrigerados = new FileReader("ProductoRefrigerado.csv");
      BufferedReader bufferRefrigerados = new BufferedReader(lectorRefrigerados);
      String linea;
         while ((linea = bufferRefrigerados.readLine()) != null) {
            System.out.println(linea);
         }
         lectorRefrigerados.close();
         bufferRefrigerados.close(); 
    } catch (IOException e) {
        System.out.println("Se ha producido un error :()");
    }

    try {
      FileReader lectorCongelados = new FileReader("ProductosCongelados.csv");
      BufferedReader bufferCongelados = new BufferedReader(lectorCongelados);
      String linea;
         while ((linea = bufferCongelados.readLine()) != null) {
            System.out.println(linea);
         }
         lectorCongelados.close();
         bufferCongelados.close(); 
    } catch (IOException e) {
        System.out.println("Se ha producido un error :()");
    }
  }
  
}
