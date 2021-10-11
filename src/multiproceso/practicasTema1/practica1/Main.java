package multiproceso.practicasTema1.practica1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  String ruta;

  // Las veces que se va a ejecutar el proceso va definido por los parametros de
  // main()
  public static void main(String[] args) {
    // Scanner para dar valor a los parametros pasados al metodo
    // lanzadorSuma()
    Scanner sc = new Scanner(System.in);
    // Lanzador de procesos
    Lanzador l = new Lanzador();
    // Recoge el parametro pasado al metodo main()
    int contSuma = Integer.parseInt(args[0]);
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    // Las veces que se va a ejecutar el proceso dado por el parametro pasado al
    // metodo main()
    for (int i = 1; i <= contSuma; i++) {
      // Recoleccion de elementos por teclado
      System.out.println("Lanzamiento: " + i);
      System.out.println("Introduce el primer valor:");
      n1 = sc.nextInt();
      System.out.println("Introduce el segundo valor:");
      n2 = sc.nextInt();
      n3 = i;
      // Ejecucion de lanzador con parametros recogidos por teclado y parametro con
      // nombre de archivo actualizado a las veces que se va a ejecutar el for
      l.lanzadorSuma(n1, n2, n3, "P1resultado" + i + ".txt");
      // Lectura de resultado a traves de los archivos P1resultadoX.txt
//      leerFichero("E:\\Documentos\\git\\DAM2\\ServiciosProcesosDAM2\\bin\\practicasTema1\\P1resultado"
//          + Integer.toString(i) + ".txt");
    }
      sc.close();
  }

  // Metodo para leer los ficheros previamente creados
  public static void leerFichero(String ruta) {
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(ruta));
      String linea;
      while ((linea = br.readLine()) != null) {
        System.out.println(linea);
      }
    } catch (FileNotFoundException e) {
      System.err.println("No se encuentra el archivo");
    } catch (IOException ex) {
      System.err.println("Error E/S");
    } finally {
      try {
        if (br != null)
          br.close();
      } catch (Exception e) {
        System.out.println("Error al cerrar el fichero");
        System.out.println(e.getMessage());
      }
    }
  }
}
