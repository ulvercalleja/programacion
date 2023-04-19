import java.util.Scanner;
import juegos.buscaminas.*;
public class BuscaminasMain {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int filas = 6;
    int columnas = 6;
    int numMinas = 4;
    Buscaminas consBuscaminas = new Buscaminas(filas, columnas, numMinas);
    int opcion = 0;
    // Menu y bucle
    do {
      System.out.println("Bienvenido a buscaminas.");
      System.out.println("Seleccione una opción:");
      System.out.println("1. Jugar 1");
      System.out.println("2. Opciones 2");
      System.out.println("3. Salir 3");
      opcion = leer.nextInt();

      //Comprobamos que el jugador elige una opcion correcta
      while (opcion < 1 || opcion > 3) {
        System.out.println("Por favor, seleccione un numero entre el 1 y el 3.");
        opcion = leer.nextInt();
      }
      switch (opcion) {
        case 1:
        System.out.println("Usted ha seleccionado jugar.");

        //Inicializamos casillas y generamos minas ANTES DEL BUCLE.
        consBuscaminas.inicializarCasillas();
        consBuscaminas.generarMinas();

        while (true) {
          
          //Mostramos el tablero y le pedimos posiciones para revelar casilla
          consBuscaminas.mostrarTablero();

          if (consBuscaminas.comprobarVictoria()) {
            System.out.println("¡Has ganado!");
            break;
          }
          
          System.out.print("Introduce fila: ");
          int fila = leer.nextInt();
          System.out.print("Introduce columna: ");
          int columna = leer.nextInt();
          
          consBuscaminas.descubrirCasilla(fila, columna);
            // se verifica si la casilla seleccionada tiene una mina
            if (consBuscaminas.tablero[fila][columna].getEsMina()) {
              System.out.println("¡Has perdido! Has descubierto una mina.");
            } else {
              consBuscaminas.descubrirCasilla(fila, columna); // se descubre la casilla y se muestra el número de minas adyacentes
            }
        }

        case 2:
          System.out.println("Usted ha seleccionado opciones.");
          break;

        case 3:
          System.out.println("Usted ha seleccionado salir.");
          break;

        default:
          System.out.println("Solo números entre 1 y 3");
      }
    } while (opcion != 3);

    System.out.println("¡Vuelva pronto!");
  }
}