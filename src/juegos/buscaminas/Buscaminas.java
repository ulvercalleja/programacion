package juegos.buscaminas;

public class Buscaminas {
   int filas = 6;
   int columnas = 6;
   int numMinas;
   public Casilla[][] tablero;

   public Buscaminas(int filas, int columnas, int numMinas) {
      this.filas = filas;
      this.columnas = columnas;
      this.numMinas = numMinas;
      tablero = new Casilla[filas][columnas];
   }

   /**
    * Inicializa todas las casillas del tablero, creando un nuevo objeto Casilla
    * para cada una.
    */
   public void inicializarCasillas() {
      // Inicializar todas las casillas
      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
            tablero[i][j] = new Casilla();
         }
      }
   }

   public void mostrarTablero() {
      System.out.print("  ");

      // imprimir fila de columnas (0, 1 ,2...)
      for (int j = 0; j < columnas; j++) {
         System.out.print(j + " ");
      }

      System.out.println();
      for (int i = 0; i < filas; i++) {
         System.out.print(i + " ");
         for (int j = 0; j < columnas; j++) {
            System.out.print(tablero[i][j].toString() + " ");
         }
         System.out.println();
      }
   }

   public boolean comprobarVictoria() {
      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
            // Si hay alguna casilla sin descubrir que no es una mina, el juego aún no ha terminado
            if (!tablero[i][j].getEstaDescubierta() && !tablero[i][j].getEsMina()) {
               return false;
            }
         }
      }
      return true;
   }

   public void generarMinas() {
      int minasGeneradas = 0;
      while (minasGeneradas != numMinas) {

         // Asignamos las minas aleatoriamente
         int posMinaFila = (int) (Math.random() * filas + 0);
         int posMinaColumna = (int) (Math.random() * columnas + 0);

         // Comprobamos que la casilla elegida no tiene una mina previamente
         if (!tablero[posMinaFila][posMinaColumna].getEsMina()) {
            tablero[posMinaFila][posMinaColumna].setEsMina(true);
            minasGeneradas++;
         }
      }
   }
   
   public int minasAdyacentes(int fila, int columna, Casilla[][] tablero) {
      int numMinasAdyacentes = 0;

      // Recorremos las 8 minas adyacentes
      for (int i = fila - 1; i <= fila + 1; i++) {
         for (int j = columna - 1; j <= columna + 1; j++) {
            // Usamos la palabra 'continue' para ignorar la propia casilla
            if (i == fila && j == columna) {
               continue;
            }

            // Verificar si la casilla adyacente es válida y contiene una mina
            if (i >= 0 && i < tablero.length && j >= 0 && j < tablero[0].length && tablero[i][j].getEsMina()) {
               numMinasAdyacentes++;
            }
         }
      }
      return numMinasAdyacentes;
      
   }

   public void descubrirCasilla(int fila, int columna) {
      if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
         return;
     }
      // Si la casilla es una mina, la marcamos como descubierta y finalizamos el juego
      if (tablero[fila][columna].getEsMina()) {
         tablero[fila][columna].setEstaDescubierta(true);
         System.out.println("¡Has perdido! Has descubierto una mina.");
         //Aquí se podría mostrar el tablero completo con todas las minas
         return;
      }
      
      // Si la casilla no es una mina, la marcamos como descubierta y mostramos el número de minas adyacentes
      int numMinasAdyacentes = minasAdyacentes(fila, columna, tablero);
      tablero[fila][columna].setEstaDescubierta(true);
      tablero[fila][columna].setNumMinasAdyacentes(numMinasAdyacentes);
      
      // Si la casilla no tiene minas adyacentes, descubrimos las casillas adyacentes
      if (numMinasAdyacentes == 0) {
         for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
               if (i == fila && j == columna) {
                  continue;
               }
               descubrirCasilla(i, j);
            }
         }
      }
   }
   
  

}
