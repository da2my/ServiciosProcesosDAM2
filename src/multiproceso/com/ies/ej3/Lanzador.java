package multiproceso.com.ies.ej3;

import java.io.File;

public class Lanzador {
  public void lanzarSumador(Integer n1, Integer n2, Integer p) {// Metodo lanzador de la clase Sumador.class
    String clase = "multiproceso.com.ies.ej3.Sumador";// por que hace caso a los puntos?? ruta del paquete donde tengo creado el .class
    ProcessBuilder pb;
    try {
      pb = new ProcessBuilder("java", clase, n1.toString(), n2.toString(), p.toString());// Que ejecute esta linea...*1
      pb.inheritIO(); // para que salga en consola del eclipse lo que sacan los procesos
      pb.directory(new File("E:\\Documentos\\git\\DAM2\\ServiciosProcesosDAM2\\bin\\")); // ...*1 Aqui.Ruta donde esta
                                                                                         // el ejecutable, indica el
                                                                                         // directorio donde está el
                                                                                         // ejecutable que va a lanzar
                                                                                         // como proceso, en nuestro
                                                                                         // caso buscará el .class de
                                                                                         // clase com.ies.ej3.Sumador
      pb.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}