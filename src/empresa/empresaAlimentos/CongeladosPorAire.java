package empresa.empresaAlimentos;

public class CongeladosPorAire extends ProductosCongelados{

    public CongeladosPorAire(String fechaCaducidad, int numLote, String paisOrigen, String fechaEnvasado,
            float tempMantenimiento) {
        super(fechaCaducidad, numLote, paisOrigen, fechaEnvasado, tempMantenimiento);
    }
    double porcentajeNitrógeno;
    double porcentajeOxígeno;
    double porcentajeDióxidoCarbono;
    double porcentajeVaporAgua;
}
