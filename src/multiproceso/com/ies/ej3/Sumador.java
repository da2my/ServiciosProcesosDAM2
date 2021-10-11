package multiproceso.com.ies.ej3;

public class Sumador {

  public static void main(String[] args) {
    Sumador s = new Sumador();
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    int proceso = Integer.parseInt(args[2]);
    s.sumar(n1, n2, proceso);
  }

  public void sumar(int n1, int n2, int p) {
    int resultado = 0;
    for (int i = n1; i <= n2; i++) {
      resultado = resultado + i;
    }
    System.out.println("Ejecutado por el LanzarSumador " + p);
    System.out.println("Resultado sumar los numero comprendidos entre " + n1 + " y " + n2 + " es " + resultado);
  }

}
