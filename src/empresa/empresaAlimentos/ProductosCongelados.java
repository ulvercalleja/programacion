package empresa.empresaAlimentos;

public abstract class ProductosCongelados extends Productos{

    public ProductosCongelados(String fechaCaducidad, int numLote, String paisOrigen, String fechaEnvasado,
    float tempMantenimiento) {
        super(fechaCaducidad, numLote, paisOrigen, fechaEnvasado);
        this.tempMantenimiento = tempMantenimiento;
    }
    float tempMantenimiento;
}