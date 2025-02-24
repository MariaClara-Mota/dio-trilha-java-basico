import java.util.Scanner;

public class ControleTeminal {
    public static void main(String[] args) throws Exception {
      Scanner entrada=new Scanner (System.in);

      System.out.println("Por favor, digite o numero da conta:");
      int numero=entrada.nextInt();

      System.out.println ("Por favor, digite o numero da agência com dígito:");
      String agencia= entrada.next();

      entrada.nextLine();

      System.out.println("Por favor, digite seu nome:");
      String nome= entrada.nextLine();

      System.out.println ("Por favor, digite seu saldo");
      double saldo= entrada.nextDouble();

      System.out.println ("Olá "+nome+" , obrigada por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já esta disponível para saque");

    }
}
