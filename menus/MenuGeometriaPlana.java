package menus;

import java.util.Scanner;
import classes.GeometriaPlana;

public class MenuGeometriaPlana {
    private Scanner ler = new Scanner(System.in);
    private GeometriaPlana gp = new GeometriaPlana();

    public void exibir() {
        while (true) {
            System.out.println("\n=== MENU GEOMETRIA PLANA ===");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Triângulo");
            System.out.println("4 - Triângulo Equilátero");
            System.out.println("5 - Paralelogramo");
            System.out.println("6 - Losango");
            System.out.println("7 - Trapézio");
            System.out.println("8 - Círculo");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    menuQuadrado();
                    break;

                case 2:
                    menuRetangulo();
                    break;

                case 3:
                    menuTriangulo();
                    break;

                case 4:
                    menuTrianguloEquilatero();
                    break;

                case 5:
                    menuParalelogramo();
                    break;

                case 6:
                    menuLosango();
                    break;

                case 7:
                    menuTrapezio();
                    break;

                case 8:
                    menuCirculo();
                    break;

                case 9:
                    return;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void menuQuadrado() {
        while (true) {
            System.out.println("\n-- Quadrado --");
            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Perímetro");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int op = ler.nextInt();

            if (op == 9) {
                return;
            }
            if (op == 0) {
                System.exit(0);
            }

            System.out.print("Informe o lado: ");
            double a = ler.nextDouble();

            if (op == 1) {
                System.out.println("Área: " + gp.calcularAreaQuadrado(a));
            }
            else if (op == 2) {
                System.out.println("Perímetro: " + gp.calcularPerimetroQuadrado(a));
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuRetangulo() {
        while (true) {
            System.out.println("\n-- Retângulo --");
            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Perímetro");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int op = ler.nextInt();

            if (op == 9) {
                return;
            }
            if (op == 0) {
                System.exit(0);
            }

            System.out.print("Informe o lado A: ");
            double a = ler.nextDouble();
            System.out.print("Informe o lado B: ");
            double b = ler.nextDouble();

            if (op == 1) {
                System.out.println("Área: " + gp.calcularAreaRetangulo(a, b));
            }
            else if (op == 2) {
                System.out.println("Perímetro: " + gp.calcularPerimetroRetangulo(a, b));
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuTriangulo() {
        while (true) {
            System.out.println("\n-- Triângulo --");
            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Perímetro");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int op = ler.nextInt();

            if (op == 9) {
                return;
            }
            if (op == 0) {
                System.exit(0);
            }

            if (op == 1) {
                System.out.print("Base: ");
                double a = ler.nextDouble();
                System.out.print("Altura: ");
                double h = ler.nextDouble();
                System.out.println("Área: " + gp.calcularAreaTriangulo(a, h));
            }
            else if (op == 2) {
                System.out.print("Lado A: ");
                double a = ler.nextDouble();
                System.out.print("Lado B: ");
                double b = ler.nextDouble();
                System.out.print("Lado C: ");
                double c = ler.nextDouble();
                System.out.println("Perímetro: " + gp.calcularPerimetroTriangulo(a, b, c));
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuTrianguloEquilatero() {
        while (true) {
            System.out.println("\n-- Triângulo Equilátero --");
            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Perímetro");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int op = ler.nextInt();

            if (op == 9) {
                return;
            }
            if (op == 0) {
                System.exit(0);
            }

            System.out.print("Lado: ");
            double l = ler.nextDouble();

            if (op == 1) {
                System.out.println("Área: " + gp.calcularAreaTrianguloEquilatero(l));
            }
            else if (op == 2) {
                System.out.println("Perímetro: " + gp.calcularPerimetroTrianguloEquilatero(l));
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuParalelogramo() {
        while (true) {
            System.out.println("\n-- Paralelogramo --");
            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Perímetro");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int op = ler.nextInt();

            if (op == 9) {
                return;
            }
            if (op == 0) {
                System.exit(0);
            }

            if (op == 1) {
                System.out.print("Base: ");
                double a = ler.nextDouble();
                System.out.print("Altura: ");
                double h = ler.nextDouble();
                System.out.println("Área: " + gp.calcularAreaParalelogramo(a, h));
            }
            else if (op == 2) {
                System.out.print("Lado A: ");
                double a = ler.nextDouble();
                System.out.print("Lado B: ");
                double b = ler.nextDouble();
                System.out.println("Perímetro: " + gp.calcularPerimetroParalelogramo(a, b));
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuLosango() {
        while (true) {
            System.out.println("\n-- Losango --");
            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Perímetro");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int op = ler.nextInt();

            if (op == 9) {
                return;
            }
            if (op == 0) {
                System.exit(0);
            }

            if (op == 1) {
                System.out.print("Diagonal maior: ");
                double D = ler.nextDouble();
                System.out.print("Diagonal menor: ");
                double d = ler.nextDouble();
                System.out.println("Área: " + gp.calcularAreaLosango(D, d));
            }
            else if (op == 2) {
                System.out.print("Lado: ");
                double a = ler.nextDouble();
                System.out.println("Perímetro: " + gp.calcularPerimetroLosango(a));
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuTrapezio() {
        while (true) {
            System.out.println("\n-- Trapézio --");
            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Perímetro");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int op = ler.nextInt();

            if (op == 9) {
                return;
            }
            if (op == 0) {
                System.exit(0);
            }

            if (op == 1) {
                System.out.print("Base maior: ");
                double B = ler.nextDouble();
                System.out.print("Base menor: ");
                double b = ler.nextDouble();
                System.out.print("Altura: ");
                double h = ler.nextDouble();
                System.out.println("Área: " + gp.calcularAreaTrapezio(B, b, h));
            }
            else if (op == 2) {
                System.out.print("Lado A: ");
                double a = ler.nextDouble();
                System.out.print("Lado B: ");
                double b = ler.nextDouble();
                System.out.print("Lado C: ");
                double c = ler.nextDouble();
                System.out.print("Lado D: ");
                double d = ler.nextDouble();
                System.out.println("Perímetro: " + gp.calcularPerimetroTrapezio(a, b, c, d));
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private void menuCirculo() {
        while (true) {
            System.out.println("\n-- Círculo --");
            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Perímetro");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            int op = ler.nextInt();

            if (op == 9) {
                return;
            }
            if (op == 0) {
                System.exit(0);
            }

            System.out.print("Raio: ");
            double r = ler.nextDouble();

            if (op == 1) {
                System.out.println("Área: " + gp.calcularAreaCirculo(r));
            }
            else if (op == 2) {
                System.out.println("Perímetro: " + gp.calcularPerimetroCirculo(r));
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
