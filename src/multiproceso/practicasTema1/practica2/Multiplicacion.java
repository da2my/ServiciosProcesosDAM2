package multiproceso.practicasTema1.practica2;

public class Multiplicacion {
  public static void main(String[] args) {
    Multiplicacion m = new Multiplicacion();
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    m.multiplicar(n1, n2);
  }

  public void multiplicar(int n1, int n2) {
    System.out.println("Multiplicacion:\n" + n1 + " * " + n2 + " = " + (n1 * n2));
  }
}
