package empresa.empresaAlimentos;

public class ProductosRefrigerados extends Productos{

    public ProductosRefrigerados(String fechaCaducidad, int numLote, String paisOrigen) {
        super(fechaCaducidad, numLote, paisOrigen);
    }
    String codigoSupervision;
    String fechaEnvasado;
    float tempMantenimiento;
}