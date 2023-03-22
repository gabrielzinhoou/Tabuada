public class Tabuada {

   private  Integer resultado;
   Menu menu = new Menu ();

   public void limitetabuada (Integer num) throws Exception {
      if (num >100){
         throw new Exception("tabuada permitida apenas do número 1 ao 100");
      }
   }
   public void tabuada (Integer num) throws Exception {
      this.limitetabuada(num);
      for (int x = 1; x < 11; x++){
         resultado = num * x;
         System.out.println(num + "x" + x + "=" + resultado);
         //menu.painel();

      }

   }

   public void tabuada2 (Integer num) throws Exception {
      this.limitetabuada(num);
      for (int x = 1; x <= num; x++){
         for (int y = 1; y < 11; y++){
            resultado = x * y;
            System.out.println(x + "x" + y + "=" + resultado);


         }
      }
   }
}
