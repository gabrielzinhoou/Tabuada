import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Scanner opcao = new Scanner(System.in);

        System.out.println("<----Tabuada Inteligente---->");
        System.out.println();
        System.out.println("escolha a opcao desejada 1 ou 2");
        System.out.println("opcao 1, para tabuada que deseja");
        System.out.println("opcao 2, até qual tabuada desejar");
        menu.menu(opcao.nextInt());

    }
}