import java.util.Scanner;

public class ejercicio7 {

    public static void main (String[] args) {

        Scanner entrada =new Scanner(System.in);


        System.out.println("Hola buenas,segun los datos que proporciones mediremos su indice de felicidad: ");

        System.out.println("El rango sera del 0 al 100.");

        System.out.print("Ingrese porfavor su nivel de satisfaccion con la vida: ");

        int satisfaccionVida= entrada.nextInt();

        System.out.print("Ingrese por favor su nivel de estres: ");

        int estresVida= entrada.nextInt();

        System.out.print("Ingrese por favor su nivel de salud: ");
        int saludVida= entrada.nextInt();


        int nivelFelicidad= (satisfaccionVida+estresVida+saludVida)/3;


        if(nivelFelicidad==0){
            System.out.println("El nivel de felicidad esta vacio");
        } else if(nivelFelicidad<=25){
            System.out.println("Su nivel de felicidad es de " + nivelFelicidad + " es muy bajo. Necesita cuidar mas sus niveles de estres y su salud tanto mental como fisica..");

        } else if(nivelFelicidad<=50){
            System.out.println("Su nivel de felicidad es de " + nivelFelicidad + " esta por debajo de la mitad . Esta bajo, trate de mejorar sus condiciones de salud y niveles de estres porfavor .");

        } else if(nivelFelicidad<=75){
            System.out.println("Su nivel de felicidad es de " + nivelFelicidad + " supera la mitad . Con pequeñas recomendaciones puede mejorar mucho su nivel de felicidad.");

        } else if(nivelFelicidad<100){
            System.out.println("Su nivel de felicidad es de " + nivelFelicidad + " es bastante alto. Si sus niveles de salud son correctos trate de descansar para reducir su estres.");
    } else {
            System.out.println("El nivel de felicidad esta al maximo. Felicitaciones!!!!");
        }



}
    }
