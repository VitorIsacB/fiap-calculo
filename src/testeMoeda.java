import java.util.Scanner;

public class testeMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();
        System.out.println("informe o valor em reais ; R$");
        moeda.valorReal = leitor.nextDouble();
        System.out.println("informe a cotação do dólar de hoje");
        moeda.cotacaoDoDolar = leitor.nextDouble();
        moeda.calcularConversao();
        System.out.println(moeda.quantidadeDolar);
        System.out.println(moeda.retornarCalculoConversao());
    }





    
}
