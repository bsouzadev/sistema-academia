package app;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner sc = new Scanner(System.in);

    public void menu(){
        while(true){
            System.out.println("======");
            System.out.println("Digite 1 para fazer um cadastro: ");
            System.out.println("Digite 2 para fazer uma alteração: ");
            System.out.println("Digite 3 para para consultar o Relatório da Academia: ");
            System.out.println("Digite 0 para sair: ");
            System.out.println("======");
            int op = sc.nextInt();
            sc.nextLine();

            if(op == 1){
                MenuCadastro menuCadastro = new MenuCadastro();
                menuCadastro.menuCadastro();
            } else if (op == 2) {
                MenuAlteracao menuAlteracao = new MenuAlteracao();
                menuAlteracao.menuAlteracao();
            } else if(op == 3){
                MenuRelatorio menuRelatorio = new MenuRelatorio();
                menuRelatorio.menuRelatorio();
            } else {
                return;
            }
        }
    }
}
