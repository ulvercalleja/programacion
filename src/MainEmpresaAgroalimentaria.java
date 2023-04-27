import empresa.empresaAlimentos.*;

public class MainEmpresaAgroalimentaria {
  public static void main(String[] args) {
    EmpresaAgroalimentaria empresa = new EmpresaAgroalimentaria("AgroUlver");

    // Crea un objeto de la clase (ProductosFrescos) y lo inicializa utilizando el constructor
    ProductosFrescos fresco = new ProductosFrescos("tomate", "2023-05-30", "ES202317", "ES", "2023-04-18");
    empresa.addProductosFrescos(fresco);

    // Crea otro objeto con diferentes valores
    fresco = new ProductosFrescos("lechuga", "2023-06-30", "ES202335", "FR", "2023-04-15");
    empresa.addProductosFrescos(fresco);

    ProductosRefrigerados refrigerado = new ProductosRefrigerados("leche", "2023-05-29", "ES202316",
        "FR", "2023-04-15", 5, "CU00687B");
    empresa.addProductosRefrigerados(refrigerado);

    refrigerado = new ProductosRefrigerados("huevos", "2023-06-25", "ES202319",
        "IT", "2023-08-21", 4, "CU00690B");
    empresa.addProductosRefrigerados(refrigerado);

    refrigerado = new ProductosRefrigerados("filetes", "2023-06-10", "ES202676",
        "ES", "2023-07-25", 4, "CU01327A");
    empresa.addProductosRefrigerados(refrigerado);

    CongeladosPorAgua congeladosPorAgua = new CongeladosPorAgua("Gambas Congeladas", "2023-09-21", "ES45231",
        "FR", "2023-04-25", 3, 4);
    empresa.addProductosCongelados(congeladosPorAgua);

    congeladosPorAgua = new CongeladosPorAgua("Guisantes Congelados", "2023-08-19", "ES76831",
        "IT", "2023-04-21", 4, 3);
    empresa.addProductosCongelados(congeladosPorAgua);

    CongeladosPorAire congeladosPorAire = new CongeladosPorAire("Helado de Vainilla", "2023-09-10", "ES827931",
        "IT", "2023-05-26", 3, 3, 4, 3 ,4);
    empresa.addProductosCongelados(congeladosPorAire);

    congeladosPorAire = new CongeladosPorAire("Merluza", "2023-07-15", "ES823431",
        "ES", "2023-04-21", 3, 4, 5, 3 ,4);
    empresa.addProductosCongelados(congeladosPorAire);

    CongeladosPorNitro congeladosPorNitro = new CongeladosPorNitro("Pollo", "2023-09-10", "ES827931",
        "IT", "2023-05-26", 3, "?","1 semana");
    empresa.addProductosCongelados(congeladosPorNitro);

  }
}