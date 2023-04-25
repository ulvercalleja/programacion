package empresa.empresaAlimentos;

import java.util.ArrayList;
import java.util.List;

public class EmpresaAgroalimentaria {
  String nombre;
  List<Productos> listaProductos;
  List<ProductosFrescos> listaFrescos;
  List<ProductosRefrigerados> listaRefrigerados;
  List<ProductosCongelados> listaCongelados;

  public EmpresaAgroalimentaria(String nombre) {
    this.nombre = nombre;
    this.listaProductos = new ArrayList<>();
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

}
