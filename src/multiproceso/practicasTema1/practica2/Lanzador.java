package multiproceso.practicasTema1.practica2;

import java.io.File;

public class Lanzador {

  public void lanzadorX(Integer n1, Integer n2) {

    String clases[] = { "multiproceso.practicasTema1.practica2.Suma", "multiproceso.practicasTema1.practica2.Resta",
        "multiproceso.practicasTema1.practica2.Multiplicacion", "multiproceso.practicasTema1.practica2.Division" };

    ProcessBuilder pb = null;

    try {
      for (int i = 0; i < clases.length; i++) {
        pb = new ProcessBuilder("java", clases[i], n1.toString(), n2.toString());
        pb.inheritIO();
        pb.directory(new File("E:\\Documentos\\git\\DAM2\\ServiciosProcesosDAM2\\bin\\"));
        pb.start().waitFor();// waitFor() hace que el proceso espere x segundos al terminar su ejecucion
      }
    } catch (Exception e) {
    }
  }
}
