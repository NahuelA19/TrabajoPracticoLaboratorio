import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese por favor la cantidad de horas que descansa:");

       int horasDescanso= sc.nextInt();

        System.out.print("Ingrese la cantidad de horas que realiza ejercicio: ");

        int horasDeEjercicio= sc.nextInt();

        System.out.print("Ingrese la cantidad de comidas saludables que realiza por dia : ");

        int cantidadComidas= sc.nextInt();


          //Cantidad de horas de descanso:
          if(horasDescanso>8){

              System.out.println("Tienes un buen descanso,intenta no superar las 8 horas de descanso.");

          } else if(horasDescanso<8 && horasDescanso>=6){

              System.out.println("Estas durmiendo menos de 8 horas por dia pero mas de 6 intenta descansar un poco mas. ");

          }  else {
              System.out.println("Estas durmiendo menos de 6 horas. Tienes que descansar mejor");
          }

          //Cantidad de comidas saludables por dia
           if(cantidadComidas == 4){

               System.out.println("Estas comiendo muy saludable. Felicitaciones");
           } else if(cantidadComidas == 3){
               System.out.println("Estas comiendo bien pero no descuides la buena alimentacion");
           } else if(cantidadComidas == 2){
               System.out.println("Estas comiendo muy poco o la mitad de tu alimentacion no es sana.");

           } else if(cantidadComidas == 1){
               System.out.println("Debes comer mejor. Una sola comida sana por dia es peligroso para la salud.");
           }



           //Cantidad de horas entrenadas:


            if (horasDeEjercicio == 3 ){
                System.out.println("Entrenas mucho,vas muy bien a no descuidar otras cosas.");
            } else if(horasDeEjercicio == 2){
                System.out.println("Entrenas lo necesario. Muy bien ");
            } else if(horasDeEjercicio == 1){
                System.out.println("Entrenas una hora por dia .Entrena mas si quieres mejores resultados ");

            } else if(horasDeEjercicio < 1){
                System.out.println("No estas entrenando lo recomendable.Necesitas entrenar al menos 1 hora por dia.");
            }



    }









}

