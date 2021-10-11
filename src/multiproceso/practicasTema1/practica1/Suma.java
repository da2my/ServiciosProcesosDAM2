package multiproceso.practicasTema1.practica1;

public class Suma {
  static int process;

  public static void main(String[] args) {
    Suma s = new Suma();
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    int n3 = Integer.parseInt(args[2]);
    s.sumar(n1, n2, n3);
  }

  public void sumar(int n1, int n2, int n3) {
    int resultado = 0;
    resultado = n1 + n2;

    System.out.println("Lanzador # " + n3 + "\nResultado de la suma: " + resultado);
  }
}
