package multiproceso.lanzadorEjecutorProcesos;

import java.io.IOException;

public class LanzadorProcesos {

  public void ejecutar(String... ruta) {

    ProcessBuilder pb;
    try {
      pb = new ProcessBuilder(ruta);
      pb.inheritIO();
      pb.start();
    } catch (IOException e) {
      System.out.println("Error al lanzar el comando cmd");
//      e.printStackTrace();
    }

  }
}
