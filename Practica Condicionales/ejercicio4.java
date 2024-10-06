import javax.swing.*;
import java.util.Scanner;

public class ejercicio4 {

    public static void main (String[]args){

        Scanner entrada = new Scanner (System.in);

        System.out.println("Por favor ingrese su peso en kilogramos: (Ej: 70.5) ");

        float peso = entrada.nextFloat();


        System.out.println("Ingrese porfavor su altura en metros: (Ej: 1.75)");

        float altura = entrada.nextFloat();


        float indiceMc = (peso)/(altura*altura);


        JOptionPane.showMessageDialog(null,"Su indice de masa corporal es: " +indiceMc);


        if(indiceMc<18.5) {
            JOptionPane.showMessageDialog(null, "Su indice de masa corporal indica que usted esta por debajo de el peso promedio . Tiene el peso bajo");
        }else if (indiceMc>18.5 && indiceMc<25.0) {
            JOptionPane.showMessageDialog(null,"Su indice de masa corporal indica que usted esta en los rangos normales de peso segun el promedio . Tiene el peso normal");

        } else if (indiceMc>25.0 && indiceMc<30.0){
            JOptionPane.showMessageDialog(null, "Su indice de masa corporal indica que usted esta por encima  de el peso promedio. Tiene sobrepeso.");
        }else if (indiceMc>30.0){
            JOptionPane.showMessageDialog(null, "Su indice de masa corporal indica que usted esta muy por encima  de el peso promedio. Tiene obesidad.");
        }






    }






}




