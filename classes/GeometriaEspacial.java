package classes;

public class GeometriaEspacial {

    // metodos reutilizados
    // algumas formas geometricas como piramides e prismas tem a base como um poligono regular logo podemos usar o mesmo método para calcula-las
    public double areaPoligonoRegular(double n_De_Lados, double lado1, double apotema){
        return (n_De_Lados * lado1 * apotema) / 2;
    }
    
    public double areaCircunferencia(double raio){
        return Math.PI * Math.pow(raio, 2);
    }
    // metodos reutilizados
    
    // prisma

    //area da base é a area do poligono

    public double prismaAreaLateral(int n_De_lados, double lado1, double altura){
        return (lado1 * altura) * n_De_lados;
    }
    
    public double prismaAreaTotal(double prismaAreaBase, double prismaAreaLateral){
        return prismaAreaBase + prismaAreaLateral;
    }
    public double prismaVolume(double prismaAreaBase, double altura){
        return prismaAreaBase * altura;
    }
    // prisma

    // pirâmide
    public double piramideAreaLateral(double n_De_Lados, double base, double altura){
        return n_De_Lados * ((base * altura) / 2);
    }
    public double piramideAreaTotal(double piramideAreaLateral, double piramideAreaBase){
        return piramideAreaLateral + piramideAreaBase;
        
    }
    public double piramideVolume(double piramideAreaBase, double altura){
        return (piramideAreaBase * altura) / 3;
        
    }
    // pirâmide

    // cilindro

    // area da base é a area de uma circunferencia

    public double cilindroAreaLateral(double raio, double altura){
        return (2 * Math.PI) * raio * altura;
    }
    public double cilindroVolume(double raio, double altura){
        return Math.PI * Math.pow(raio, 2) * altura;
    }
    // cilindro 
    
    // Esfera
    public double esferaAreaSuperficial(double raio){
        return 4 * Math.PI * Math.pow(raio, 2);
    }
    public double esferaVolume(double raio){
        return Math.PI * Math.pow(raio, 2) * (4/3);
    }
    // Esfera

    // Cone
    public double coneAreaLateral(double raio, double geratriz){
        return Math.PI * raio * geratriz;
    }

    // area da base é a area da circunferencia

    public double coneVolume(double raio, double altura){
        return (Math.PI * Math.pow(raio, 2) * altura) / 3;
    }
    // Cone

    // troncos
    public double troncoCilindroVolume(double raioMaior, double raioMenor, double altura){
        return (Math.PI * altura * (Math.pow(raioMenor, 2) * raioMenor * raioMaior * Math.pow(raioMaior, 2))) / 3;
    }
    public static double troncoPoligonalVolume(double altura, double areaBaseMaior, double areaBaseMenor) {
        return (altura / 3) * (areaBaseMaior + Math.sqrt(areaBaseMaior * areaBaseMenor) + areaBaseMenor);
    }
    // troncos
}
