import javax.swing.*;

public class ConversorBinario {
   public static void main(String[] args) {
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero..."));
      String result = "";
      int count = 0;
      if (numero > 2000) {
         throw new Error("O numero nao pode ser maior que 2000");
      } else {
         String binario = converteBinario(numero, result, count);
         //depois reutilizo o código de inverter texto para inverter a string do binario e causar a leitura correta
         binario = inverteString(binario, 0, binario.length() - 1);
         System.out.println(binario);
      }
   }
   public static String inverteString(String palavra, int posInicial, int posFinal) {

      //condição de parada vai ser quando a posFinal for igual a inicial
      if (posFinal < posInicial) {
         return "";
      }
      // a ideia é a cada passo diminuir em 1 a posFinal e utilizando o substring eu pego e retorno de volta apenas o caracter
      // correspondente ao posFinal, ai entao é só mandar de volta caractere a caractere
      // nota: por não saber utilzar corretamente a função substring, quebrei a cabeça, tentei utilizar o exemplo que o profesor colocou no material, porém só dava errado
      // se eu faço palavra.substring(posInicial,posFinal + 1); o programa-me retorna uma ‘string’ totaltmente errada
      // agora se eu faço palavra.substring(posFinal,posFinal + 1); ai sim ele retorna-me corretamente
      String ultimoCaractere = palavra.substring(posFinal, posFinal + 1);
      return ultimoCaractere + inverteString(palavra, posInicial, posFinal - 1);
   }

   public static String converteBinario(long num, String result, long count) {
     // notei que se a divisão chegar a 0 sempre se retorna 1 e o programa acaba
      if (num / 2 <= 0) {
         return result + 1;
      } else {
         // a ideia aqui foi passar 3 variaveis como parametro, uma sendo o numero, outra sendo uma string e outra count que armazena o resto de cada divisao, a acada passo da recursão eu divido num por 2 e armazeno o resto na variavel count, e adiciono o count na variavel result
         count = num % 2;
         result += count;
         return converteBinario(num / 2, result, count);
      }
   }
}
