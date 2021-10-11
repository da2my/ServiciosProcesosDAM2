package multiproceso.lanzadorEjecutorProcesos;

import java.io.IOException;

public class PruebaPB {

  public static void main(String[] args) throws IOException {
//  // probar con los comandos DOR y DIR
  ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DiR"); // Como parametros
//                                                              // pasamos varags de
//                                                              // comandos para la CMD
//                                                              // despues de decirle que
//                                                              // sea en cadena /C.
//  ///// PRUEBAS Sabado///////
  pb.inheritIO();
//  // Sin la siguiente linea nos da null en el pb.directory() y hace DIR en el
//  // directorio del projecto, eso es por defecto. Este metodo depende de que el
//  // vararg este bien, si hay algun error como DoR, no se ejecuta:
//  pb.directory(new File("C:\\Users\\david\\Documents"));// ejecuta el directorio que se le pasa|
//  // Indico que los errores queden en un fichero:
//  pb.redirectError(new File("C:\\Users\\david\\Documents\\error.txt"));
//  // Indico que la salida se envie a un fichero:
//  pb.redirectOutput(new File("C:\\Users\\david\\Documents\\salida.txt"));
  pb.start();
//  File directorio = pb.directory();// metodo de pb que retorna un File... *1
//  System.out.println("El directorio es " + directorio);// *1 ... por eso se puede ver de que directorio viene
//  ///// PRUEBAS Sabado///////

//  try {
//    File directorio= pb.directory();
//    pb.inheritIO();// Ver Javadoc. metodo que (SACA POR CONSOLA, saca el ultimo)
//    pb.directory(new File("C:\\"));// ejecuta el directorio que se le pasa
//    pb.redirectError(new File("C:\\Users\\david\\Documents\\error.txt"));// crea archivo error.txt, si pongo DOR me
  // escribe dentro del archivo el error
//    pb.redirectOutput(new File("C:\\Users\\david\\Documents\\salida.txt"));

//    List<String> comando = pb.command();
//    System.out.println(comando);

//    Map<String, String> entorno = pb.environment();
//    System.out.println(entorno);

//    File directorio = pb.directory();
//    pb.start();
//    System.out.println("El directorio es " + directorio);
//    pb.start();
//  } catch (IOException e) {
//    // TODO Auto-generated catch block
//    e.printStackTrace();
//  }

//  try {
//    ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "copy", "C:\\Users\\david\\Documents\\nominas.txt",
//        "C:\\Users\\david\\Documents\\nominas2.txt");
//    pb.redirectError(new File("C:\\Users\\david\\Documents\\errornominas.txt"));
//    pb.redirectOutput(new File("C:\\Users\\david\\Documents\\nominasresultado.txt"));
//    pb.start();
//  } catch (IOException e) {
//    // TODO Auto-generated catch block
//    e.printStackTrace();
//  }
  }

}
