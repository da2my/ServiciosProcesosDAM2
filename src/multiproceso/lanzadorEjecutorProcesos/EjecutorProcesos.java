package multiproceso.lanzadorEjecutorProcesos;

public class EjecutorProcesos {

  public static void main(String[] args) throws Exception {
//    // ProcessBuilder pb = new ProcessBuilder("notepad");
//    // pb.start();
//

    LanzadorProcesos lp = new LanzadorProcesos();
    // /C para que se termine el proceso || /K para que no se termine el proceso
    lp.ejecutar("CMD", "/c", "dir", "e:\\Escritorio");// /C para que se termine el proceso
    System.out.println("Terminado");

  }

}
