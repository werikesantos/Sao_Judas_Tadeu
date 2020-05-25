public class Mostrador{
   
   //armazena o valor do mostrador
   private int valor;
   //armazena o limite do mostrador
   private int limite;
   
   public Mostrador(int limite){
      this.limite = limite;
      valor = 0;
   }
   public int getValor(){
      return valor;
   }
   //novo metodo para acertar o relogio
   public void setValor(int v){
      if(v >= 0 && v < limite){
         valor = v;
      } else {
         System.out.println("Valor invalido");
      }
   }
   public void incrementa(){
      valor = (valor + 1)%limite;
   }
   public String mostra(){
      if(valor<10){
         return "0"+valor;
      } else {
         return ""+valor;
      }
   }
}