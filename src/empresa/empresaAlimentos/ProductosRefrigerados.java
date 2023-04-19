package empresa.empresaAlimentos;

import java.time.LocalDate;

public class ProductosRefrigerados extends Productos {

    public ProductosRefrigerados(String fechaCaducidad, int numLote, String paisOrigen,
    String fechaEnvasado, float tempMantenimiento, String codigoSupervision) {
        super(fechaCaducidad, numLote, paisOrigen, fechaEnvasado);
        this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
        this.tempMantenimiento = tempMantenimiento;
        this.codigoSupervision = codigoSupervision;
    }

    float tempMantenimiento;
    String codigoSupervision;
}