public class Moeda {
    public double valorReal ;
    public double cotacaoDoDolar;
    public double quantidadeDolar;

    public void calcularConversao(){
    this.quantidadeDolar = this.valorReal/this.cotacaoDoDolar;
   }
   public double retornarCalculoConversao(){
       double dolar = this.valorReal/this.cotacaoDoDolar;
       return dolar;



        }






}

