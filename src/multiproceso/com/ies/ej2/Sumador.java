package multiproceso.com.ies.ej2;

public class Sumador {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Sumador s = new Sumador();
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    s.sumar(n1, n2);

  }

  public int sumar(int n1, int n2) {
    int resultado = 0;
    for (int i = n1; i <= n2; i++) {
      resultado = resultado + i;
    }
    System.out.println(resultado);
    return resultado;
  }

}
