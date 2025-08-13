package classes;

public class GeometriaPlana {

    // prisma
    public double prismaAreaLateral(int n_De_lados, double lado1, double altura){
        return (lado1 * altura) * n_De_lados;
    }
    public double prismaAreaBase(int n_De_lados, double lado1, double apotema){
        return (n_De_lados * lado1 * apotema) / 2;
    }
    public double prismaAreaTotal(double prismaAreaBase, double prismaAreaLateral){
        return prismaAreaBase + prismaAreaLateral;
    }
    public double prismaVolume(double prismaAreaBase, double altura){
        return prismaAreaBase * altura;
    }
    // prisma

    // cilindro
    public double cilindroAreaBase(double raio){
        return Math.PI * Math.pow(raio, 2);
    }
    public double cilindroAreaLateral(double raio, double altura){
        return (2 * Math.PI) * raio * altura;
    }
    public double cilindroVolume(double raio, double altura){
        return Math.PI * Math.pow(raio, 2) * altura;
    }
    // cilindro 
    
    // pirâmide
    
    // pirâmide



}