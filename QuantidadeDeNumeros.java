import javax.swing.*;

public class QuantidadeDeNumeros {
   public static void main(String[] args) {
      int primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 10 e  999999"));
      if (primeiroNumero > 999999) {
         System.out.println("Erro");
      }

      int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo numero para saber a quantidade de vezes que ele aparece..."));

      int result = quantosNumeros(primeiroNumero, segundoNumero);
      System.out.println("O numero apareceu " + result + " vezes");
   }

   public static int quantosNumeros(int num, int segnum) {
      if(num / 10 == 0){
         return 1;
      }

      if (num % 10 == segnum) {
         return 1 + quantosNumeros(num / 10, segnum);
      } else {
         return quantosNumeros(num / 10, segnum);
      }
   }
}
