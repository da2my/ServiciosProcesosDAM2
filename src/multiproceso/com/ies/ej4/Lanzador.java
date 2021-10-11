package multiproceso.com.ies.ej4;

import java.io.File;

public class Lanzador {
  public void lanzarSumador(Integer n1, Integer n2, Integer p, String fichResultado) {

    String clase = "multiproceso.com.ies.ej4.Sumador";
    ProcessBuilder pb;
    try {
      pb = new ProcessBuilder("java", clase, n1.toString(), n2.toString(), p.toString());
      pb.directory(new File("E:\\Documentos\\git\\DAM2\\ServiciosProcesosDAM2\\bin\\"));
      pb.redirectError(new File("EJ4errores.txt"));
      pb.redirectOutput(new File(fichResultado));// si quiero llevarlo a otra ruta solo pongo delante de "fichResultado" la ruta que quiero 
      pb.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
