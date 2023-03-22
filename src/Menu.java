import java.util.Scanner;

public class Menu {

    Scanner num = new Scanner(System.in);
    Tabuada tab = new Tabuada();
    Scanner opcao = new Scanner(System.in);

    public void painel () throws Exception {
        System.out.println("<----Tabuada Inteligente---->");
        System.out.println();
        System.out.println("escolha a opcao desejada 1 ou 2");
        System.out.println("opcao 1, para tabuada que deseja");
        System.out.println("opcao 2, até qual tabuada desejar");
        System.out.println("opção 3, encerrar tabuada");
        this.menu(opcao.nextInt());

    }

    public void menu(Integer op) throws Exception {

        switch (op){

            case 1:
                System.out.println("Qual tabuada deseja?");
                tab.tabuada (num.nextInt());

                break;

            case 2:
                System.out.println("ate qual tabuada deseja, sendo do 1 ao 100 ?");
                tab.tabuada2 (num.nextInt());

                break;
            case 3:
                System.out.println("tabuada encerrada");

                break;




        }

    }

}
