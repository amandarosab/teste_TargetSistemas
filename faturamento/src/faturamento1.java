public class faturamento1 {
public static void main(String[] args) {
   // título do programa
   System.out.println("Faturamento diário da Distribuidora");

   // declaração de variáveis
   double sp = 67836.43;
   double rj = 36678.66;
   double mg = 29229.88;
   double es = 27165.48;
   double outros = 19849.53;

   double total = sp + rj + mg + es + outros;

   double percentualSP = (sp / total) * 100;
   double percentualRJ = (rj / total) * 100;
   double percentualMG = (mg / total) * 100;
   double percentualES = (es / total) * 100;
   double percentualOutros = (outros / total) * 100;

   // amostragem na tela
   System.out.println("Percentual SP: " + percentualSP + "%");
   System.out.println("Percentual RJ: " + percentualRJ + "%");
   System.out.println("Percentual MG: " + percentualMG + "%");
   System.out.println("Percentual ES: " + percentualES + "%");
   System.out.println("Percentual Outros: " + percentualOutros + "%");
   
   }
}
