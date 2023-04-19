package empresa.empresaAlimentos;

public class CongeladosPorNitro extends ProductosCongelados{

    public CongeladosPorNitro(String fechaCaducidad, int numLote, String paisOrigen, String fechaEnvasado,
            float tempMantenimiento) {
        super(fechaCaducidad, numLote, paisOrigen, fechaEnvasado, tempMantenimiento);
    }
    String métodoCongelación;
    String tiempoExposición;
}
