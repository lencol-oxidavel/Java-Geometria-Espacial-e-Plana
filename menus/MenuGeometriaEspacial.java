package menus;

import java.util.Scanner;
import classes.GeometriaEspacial;

public class MenuGeometriaEspacial {
    private Scanner ler = new Scanner(System.in);
    private GeometriaEspacial ge = new GeometriaEspacial();

    public void exibir() {
        while (true) {
            System.out.println("\n=== GEOMETRIA ESPACIAL ===");
            System.out.println("1 - Prisma");
            System.out.println("2 - Pirâmide");
            System.out.println("3 - Cilindro");
            System.out.println("4 - Esfera");
            System.out.println("5 - Cone");
            System.out.println("6 - Tronco");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    menuPrisma();
                    break;

                case 2:
                    menuPiramide();
                    break;

                case 3:
                    menuCilindro();
                    break;

                case 4:
                    menuEsfera();
                    break;

                case 5:
                    menuCone();
                    break;

                case 6:
                    menuTronco();
                    break;

                case 9:
                    return;

                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void menuPrisma() {
        while (true) {
            System.out.println("\n--- Prisma ---");
            System.out.println("1 - Área Lateral");
            System.out.println("2 - Área Total");
            System.out.println("3 - Volume");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.print("Nº de lados da base: ");
                int n = ler.nextInt();
                System.out.print("Tamanho do lado: ");
                double lado = ler.nextDouble();
                System.out.print("Altura: ");
                double altura = ler.nextDouble();
                System.out.println("Área Lateral: " + ge.prismaAreaLateral(n, lado, altura));
            } 
            else if (opcao == 2) {
                System.out.print("Área da base: ");
                double areaBase = ler.nextDouble();
                System.out.print("Área lateral: ");
                double areaLat = ler.nextDouble();
                System.out.println("Área Total: " + ge.prismaAreaTotal(areaBase, areaLat));
            } 
            else if (opcao == 3) {
                System.out.print("Área da base: ");
                double areaBase = ler.nextDouble();
                System.out.print("Altura: ");
                double altura = ler.nextDouble();
                System.out.println("Volume: " + ge.prismaVolume(areaBase, altura));
            } 
            else if (opcao == 9) {
                return;
            } 
            else if (opcao == 0) {
                System.out.println("Saindo...");
                System.exit(0);
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuPiramide() {
        while (true) {
            System.out.println("\n--- Pirâmide ---");
            System.out.println("1 - Área Lateral");
            System.out.println("2 - Área Total");
            System.out.println("3 - Volume");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.print("Nº de lados da base: ");
                double n = ler.nextDouble();
                System.out.print("Base: ");
                double base = ler.nextDouble();
                System.out.print("Altura da face: ");
                double alt = ler.nextDouble();
                System.out.println("Área Lateral: " + ge.piramideAreaLateral(n, base, alt));
            } 
            else if (opcao == 2) {
                System.out.print("Área lateral: ");
                double areaLat = ler.nextDouble();
                System.out.print("Área da base: ");
                double areaBase = ler.nextDouble();
                System.out.println("Área Total: " + ge.piramideAreaTotal(areaLat, areaBase));
            } 
            else if (opcao == 3) {
                System.out.print("Área da base: ");
                double areaBase = ler.nextDouble();
                System.out.print("Altura: ");
                double altura = ler.nextDouble();
                System.out.println("Volume: " + ge.piramideVolume(areaBase, altura));
            } 
            else if (opcao == 9) {
                return;
            } 
            else if (opcao == 0) {
                System.out.println("Saindo...");
                System.exit(0);
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuCilindro() {
        while (true) {
            System.out.println("\n--- Cilindro ---");
            System.out.println("1 - Área Lateral");
            System.out.println("2 - Área Total");
            System.out.println("3 - Volume");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.print("Raio: ");
                double raio = ler.nextDouble();
                System.out.print("Altura: ");
                double altura = ler.nextDouble();
                System.out.println("Área Lateral: " + ge.cilindroAreaLateral(raio, altura));
            } 
            else if (opcao == 2) {
                System.out.print("Área lateral: ");
                double areaLat = ler.nextDouble();
                System.out.print("Área da base: ");
                double areaBase = ler.nextDouble();
                System.out.println("Área Total: " + ge.cilindroAreaTotal(areaLat, areaBase));
            } 
            else if (opcao == 3) {
                System.out.print("Raio: ");
                double raio = ler.nextDouble();
                System.out.print("Altura: ");
                double altura = ler.nextDouble();
                System.out.println("Volume: " + ge.cilindroVolume(raio, altura));
            } 
            else if (opcao == 9) {
                return;
            } 
            else if (opcao == 0) {
                System.out.println("Saindo...");
                System.exit(0);
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuEsfera() {
        while (true) {
            System.out.println("\n--- Esfera ---");
            System.out.println("1 - Área Superficial");
            System.out.println("2 - Volume");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.print("Raio: ");
                double raio = ler.nextDouble();
                System.out.println("Área Superficial: " + ge.esferaAreaSuperficial(raio));
            } 
            else if (opcao == 2) {
                System.out.print("Raio: ");
                double raio = ler.nextDouble();
                System.out.println("Volume: " + ge.esferaVolume(raio));
            } 
            else if (opcao == 9) {
                return;
            } 
            else if (opcao == 0) {
                System.out.println("Saindo...");
                System.exit(0);
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuCone() {
        while (true) {
            System.out.println("\n--- Cone ---");
            System.out.println("1 - Área Lateral");
            System.out.println("2 - Volume");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.print("Raio: ");
                double raio = ler.nextDouble();
                System.out.print("Geratriz: ");
                double geratriz = ler.nextDouble();
                System.out.println("Área Lateral: " + ge.coneAreaLateral(raio, geratriz));
            } 
            else if (opcao == 2) {
                System.out.print("Raio: ");
                double raio = ler.nextDouble();
                System.out.print("Altura: ");
                double altura = ler.nextDouble();
                System.out.println("Volume: " + ge.coneVolume(raio, altura));
            } 
            else if (opcao == 9) {
                return;
            } 
            else if (opcao == 0) {
                System.out.println("Saindo...");
                System.exit(0);
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuTronco() {
        while (true) {
            System.out.println("\n--- Tronco ---");
            System.out.println("1 - Tronco de Cilindro");
            System.out.println("2 - Tronco Poligonal");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.print("Raio maior: ");
                double rMaior = ler.nextDouble();
                System.out.print("Raio menor: ");
                double rMenor = ler.nextDouble();
                System.out.print("Altura: ");
                double altura = ler.nextDouble();
                System.out.println("Volume: " + ge.troncoCilindroVolume(rMaior, rMenor, altura));
            } 
            else if (opcao == 2) {
                System.out.print("Altura: ");
                double altura = ler.nextDouble();
                System.out.print("Área da base maior: ");
                double areaMaior = ler.nextDouble();
                System.out.print("Área da base menor: ");
                double areaMenor = ler.nextDouble();
                System.out.println("Volume: " + GeometriaEspacial.troncoPoligonalVolume(altura, areaMaior, areaMenor));
            } 
            else if (opcao == 9) {
                return;
            } 
            else if (opcao == 0) {
                System.out.println("Saindo...");
                System.exit(0);
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
