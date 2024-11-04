public class Main {

     public static void main(String[] args) {

         Planeta planeta1 = new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000,TipoPlaneta.TERRESTRE,22,true,23);

         Planeta planeta2 = new Planeta("Jupiter",79,1.899E27,1.4313E15,139820,139820,TipoPlaneta.GASEOSO,25,true,22);

         planeta1.imprimirAtributos();


         System.out.println("Densidad: " + planeta1.calcularDensidad() + " kg/km³");
         System.out.println("¿Es un planeta exterior? " + planeta1.esPlanetaExterior());
         System.out.println();

         planeta2.imprimirAtributos();
         System.out.println("Densidad: " + planeta2.calcularDensidad() + " kg/km³");
         System.out.println("¿Es un planeta exterior? " + planeta2.esPlanetaExterior());

     }




}
