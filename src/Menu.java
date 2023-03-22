import java.util.Scanner;

public class Menu {

    Scanner num = new Scanner(System.in);
    Tabuada tab = new Tabuada();
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




        }

    }

}
