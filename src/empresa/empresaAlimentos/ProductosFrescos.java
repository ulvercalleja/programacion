package empresa.empresaAlimentos;

public class ProductosFrescos extends Productos{

    public ProductosFrescos(String fechaCaducidad, int numLote, String paisOrigen) {
        super(fechaCaducidad, numLote, paisOrigen);
    }
    String fechaEnvasado;
}