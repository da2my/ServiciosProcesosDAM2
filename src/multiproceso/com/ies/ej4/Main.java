package multiproceso.com.ies.ej4;

public class Main {

  public static void main(String[] args) {
    Lanzador l = new Lanzador();
    l.lanzarSumador(1, 8, 1, "EJ1resultado.txt");
    l.lanzarSumador(2, 6, 2, "EJ2resultado.txt");
    l.lanzarSumador(2, 9, 3, "EJ3resultado.txt");
    l.lanzarSumador(3, 15, 4, "EJ4resultado.txt");
    l.lanzarSumador(1, 2, 5, "EJ5resultado.txt");
    System.out.println("Ok");

  }

}
