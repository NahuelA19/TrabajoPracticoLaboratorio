import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento: (Formato DD/MM/AAAA) ");

        String fecha = entrada.nextLine();



        String[] partes = fecha.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        String signo = null;
        String mensaje = null;

        if (  (dia >=21 && mes==1) || (dia<=19 && mes==2) ) {
            signo = "Acuario";
            mensaje = "Tu originalidad brillará hoy. Aprovecha tu creatividad para resolver problemas y aportar nuevas ideas.";

        } else if (  (dia >=20 && mes==2) || (dia<=20 && mes==3) ) {
            signo = "Piscis";
            mensaje = "Tu intuición está en su punto más alto. Confía en tus instintos y deja que tu empatía guíe tus decisiones.";

        } else if ((dia >=21 && mes==3) || (dia<=20 && mes==4) ) {
            signo = "Aries";
            mensaje = "Hoy es un día perfecto para tomar la iniciativa. No dudes en perseguir tus sueños; la energía está a tu favor.";


        } else if ((dia >=21 && mes==4) || (dia<=21 && mes==5)) {
            signo = "Tauro";
            mensaje = "Es un buen momento para disfrutar de los placeres de la vida. Tómate un tiempo para relajarte y consentirte.";

        } else if ((dia >=22 && mes==5) || (dia<=21 && mes==6)) {
            signo = "Gemini";
            mensaje = "Tu curiosidad te llevará a nuevas experiencias. Mantén la mente abierta y no temas comunicar tus ideas.";

        } else if ((dia >=22 && mes==6) || (dia<=23 && mes==7)) {
            signo = "Cancer";
            mensaje = "Hoy es un día para cuidar de ti y de tus seres queridos. La empatía será tu mayor fortaleza.";

        } else if ( (dia >=24 && mes==7) || (dia<=23 && mes==8)) {
            signo = "Leo";
            mensaje = "Brilla con todo tu esplendor. Tu carisma atraerá a las personas hacia ti, así que aprovecha la oportunidad para liderar.";

            
        } else if ((dia >=24 && mes==8) || (dia<=23 && mes==9)) {
            signo = "Virgo";
            mensaje = "La atención a los detalles te ayudará a alcanzar tus metas. Hoy es un buen día para organizarte y ser productivo.";
        } else if ((dia >=24 && mes==9) || (dia<=23 && mes==10)) {
            signo = "Libra";
            mensaje = "Busca el equilibrio en tus relaciones. La armonía será clave hoy, así que intenta resolver conflictos de manera pacífica.";

        } else if ((dia >=24 && mes==10) || (dia<=22 && mes==11)) {
            signo = "Escorpio";
            mensaje = "Tu pasión y determinación te impulsarán. No temas profundizar en tus emociones y perseguir lo que realmente deseas.";
        } else if ((dia >=23 && mes==11) || (dia<=22 && mes==12)) {
            signo = "Sagitario";
            mensaje = "Hoy es un día para expandir tus horizontes. Explora nuevas ideas y no temas aventurarte hacia lo desconocido.";
        } else if ((dia >=23 && mes==12) || (dia<=20 && mes==1)) {
            signo = "Capricornio";
            mensaje = "La disciplina y la responsabilidad te llevarán al éxito. Es un buen momento para fijar metas y trabajar en ellas con determinación.";
        }

        System.out.println("Tu signo zodiacal es: " + signo);
        System.out.println("Tu mensaje del horoscopo es: " + mensaje);

        }
    }
