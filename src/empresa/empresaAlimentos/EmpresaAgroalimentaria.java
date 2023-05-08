package empresa.empresaAlimentos;

import java.util.ArrayList;
import java.util.List;

import java.io.FileWriter;

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
    /*try {
      FileWriter escritorCongelados = new FileWriter("ProductoCongeladoPorAgua.csv");
      for (ProductosCongelados congeladosPorAgua : listaCongelados) {
        escritorCongelados.write(congeladosPorAgua.toCsv() + "\n");
      }
      escritorCongelados.close();
    } catch (Exception e) {
      System.out.println("Se ha producido un error :()");
    }
    */
  }
  
}
