public class testedeInversão {
public static void main(String[] args) throws Exception {
  // Programa para inversão de palavras
  String original = "Target Sistemas";
  StringBuilder reversed = new StringBuilder();

  for (int i = original.length() - 1; i >= 0; i--) {
    reversed.append(original.charAt(i));
  }
  
  // amostragem na tela
  System.out.println("String original: " + reversed);
    
    }
}