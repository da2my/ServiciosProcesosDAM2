package multiproceso.practicasTema1.practica1;

import java.io.File;

public class Lanzador {
  public void lanzadorSuma(Integer n1, Integer n2, Integer n3, String P1resultado) {

    String clase = "multiproceso.practicasTema1.practica1.Suma";
    ProcessBuilder pb;

    try {
      pb = new ProcessBuilder("java", clase, n1.toString(), n2.toString(), n3.toString());
      pb.directory(new File("E:\\Documentos\\git\\DAM2\\ServiciosProcesosDAM2\\bin\\"));
      pb.redirectError(new File("P1errores.txt"));
      pb.redirectOutput(
          new File("E:\\Documentos\\git\\DAM2\\ServiciosProcesosDAM2\\bin\\multiproceso\\practicasTema1\\practica1\\"
              + P1resultado));
      pb.start().waitFor();// waitFor() hace que el proceso espere x segundos al terminar cada ejecucion

    } catch (Exception e) {
    }
  }
}
