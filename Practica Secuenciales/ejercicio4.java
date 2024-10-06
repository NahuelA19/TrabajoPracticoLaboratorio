import java.util.Scanner;

public class ejercicio4 {


        //Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
        //recomiende una actividad basada en su estado de ánimo.


        public static void main (String[] args) {

            Scanner entrada = new Scanner (System.in);
            System.out.println("Ingrese por favor la opcion que mas se aproxime a su estado de animo: (feliz,triste,energico o relajado) ");


            String estadoAnimo = entrada.nextLine();


            if(estadoAnimo.equals("feliz")){

                System.out.println("Lista de Reproducción para el estado de ánimo 'Feliz':");
                System.out.println("- " + "Good as Hell - Lizzo");
                System.out.println("- " + "Best Day of My Life - American Authors");
                System.out.println("- " + "Happy Together - The Turtles");
                System.out.println("- " + "Shut Up and Dance - WALK THE MOON");
                System.out.println("- " + "On Top of the World - Imagine Dragons");

            } else if (estadoAnimo.equals("triste")){

                System.out.println("Lista de Reproducción para el estado de ánimo 'Triste':");
                System.out.println("- " + "Creep - Radiohead");
                System.out.println("- " + "Back to December - Taylor Swift");
                System.out.println("- " + "Everybody Hurts - R.E.M.");
                System.out.println("- " + "The A Team - Ed Sheeran");
                System.out.println("- " + "Skinny Love - Bon Iver");

            } else if (estadoAnimo.equals("energico")){

                System.out.println("Lista de Reproducción para el estado de ánimo 'Enérgico':");
                System.out.println("- " + "Don't Stop Believin' - Journey");
                System.out.println("- " + "Feel This Moment - Pitbull ft. Christina Aguilera");
                System.out.println("- " + "Run the World (Girls) - Beyoncé");
                System.out.println("- " + "Levels - Avicii");
                System.out.println("- " + "We Will Rock You - Queen");

            } else if (estadoAnimo.equals("relajado")) {

                System.out.println("Lista de Reproducción para el estado de ánimo 'Relajado':");
                System.out.println("- " + "Ocean Eyes - Billie Eilish");
                System.out.println("- " + "Someone Like You - Adele");
                System.out.println("- " + "Come Away With Me - Norah Jones");
                System.out.println("- " + "Let It Be - The Beatles");
                System.out.println("- " + "Gravity - John Mayer");

            }


        }


    }




