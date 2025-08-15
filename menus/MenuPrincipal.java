package menus;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner ler = new Scanner(System.in);

    public void exibir() {
        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Geometria Plana");
            System.out.println("2 - Geometria Espacial");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    new MenuGeometriaPlana().exibir();
                    break;
                case 2:
                    new MenuGeometriaEspacial().exibir();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
