import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su condicion fisica (1. para principiante/ 2.para intermedio/ 3. para experto): ");

        int TipoRutina = entrada.nextInt();


         if(TipoRutina == 1){
             //Rutina principiante

             System.out.println("Lunes: Fuerza (Cuerpo completo:)");
             System.out.println("Sentadillas: 3 series de 10-12 repeticiones");
             System.out.println("Flexiones de brazos (puedes hacerlas con las rodillas en el suelo): 3 series de 8-10 repeticiones");
             System.out.println("Remo con banda elástica o mancuernas: 3 series de 10-12 repeticiones");
             System.out.println("Puente de glúteos: 3 series de 10-15 repeticiones/n,Plancha: 3 series de 20-30 segundos");

             System.out.println();

             System.out.println("Martes: Cardio");
             System.out.println("- Caminata rápida: 20 minutos");
             System.out.println();

             System.out.println("Miércoles: Descanso activo");
             System.out.println("- Estiramientos suaves: 15 minutos");
             System.out.println();

             System.out.println("Jueves: Fuerza (Cuerpo completo)");
             System.out.println("- Zancadas: 2 series de 8 repeticiones por pierna");
             System.out.println("- Elevaciones de talones: 2 series de 10-12 repeticiones");
             System.out.println();

             System.out.println("Viernes: Cardio");
             System.out.println("- Bicicleta: 20 minutos");
             System.out.println();

             System.out.println("Sábado: Actividad recreativa");
             System.out.println("- Escoge una actividad que disfrutes (natación, ciclismo, etc.)");
             System.out.println();

             System.out.println("Domingo: Descanso");
         } else if(TipoRutina == 2){
             //Rutina intermedia:
             System.out.println("Rutina Semanal para Intermedios:");
             System.out.println("Lunes: Fuerza (Cuerpo completo)");
             System.out.println("- Sentadillas con mancuernas: 3 series de 12 repeticiones");
             System.out.println("- Flexiones de brazos: 3 series de 10 repeticiones");
             System.out.println("- Remo con mancuernas: 3 series de 12 repeticiones");
             System.out.println("- Elevaciones de talones: 3 series de 15 repeticiones");
             System.out.println("- Plancha con toques de hombro: 3 series de 10 repeticiones por lado");
             System.out.println();

             System.out.println("Martes: Cardio (Circuito)");
             System.out.println("- Saltos de tijera: 30 segundos");
             System.out.println("- Burpees: 30 segundos");
             System.out.println("- Correr en el lugar: 1 minuto");
             System.out.println("- Descanso: 1 minuto");
             System.out.println("- Repetir el circuito 4 veces");
             System.out.println();

             System.out.println("Miércoles: Flexibilidad y Core");
             System.out.println("- Estiramientos dinámicos: 10 minutos");
             System.out.println("- Elevación de piernas: 3 series de 12 repeticiones");
             System.out.println("- Plancha lateral: 3 series de 30 segundos por lado");
             System.out.println("- Giros rusos: 3 series de 15 repeticiones por lado");
             System.out.println("- Posturas de yoga (perro boca abajo, cobra): 5 minutos");
             System.out.println();
             System.out.println("Jueves: Fuerza (Cuerpo superior e inferior)");
             System.out.println("- Press de hombros con mancuernas: 3 series de 10 repeticiones");
             System.out.println("- Zancadas con mancuernas: 3 series de 10 repeticiones por pierna");
             System.out.println("- Flexiones de tríceps en banco: 3 series de 10 repeticiones");
             System.out.println("- Sentadilla sumo con mancuernas: 3 series de 12 repeticiones");
             System.out.println("- Plancha: 3 series de 30-45 segundos");
             System.out.println();

             System.out.println("Viernes: Cardio (Intervalos)");
             System.out.println("- Correr o andar en bicicleta: 30-40 minutos, alternando 1 minuto rápido y 2 minutos a ritmo moderado.");
             System.out.println();

             System.out.println("Sábado: Actividad recreativa");
             System.out.println("- Escoge una actividad intensa que disfrutes (escalada, deportes en equipo, etc.)");
             System.out.println();

             System.out.println("Domingo: Descanso activo");
             System.out.println("- Yoga o estiramientos: 30 minutos, centrado en la respiración y la movilidad.");



         } else if (TipoRutina ==3) {

             //Rutina Avanzada
             System.out.println("Rutina Semanal para Avanzados:");
             System.out.println("Lunes: Fuerza (Cuerpo completo)");
             System.out.println("- Sentadillas con barra: 4 series de 10 repeticiones");
             System.out.println("- Flexiones de brazos con pies elevados: 4 series de 12 repeticiones");
             System.out.println("- Peso muerto: 4 series de 10 repeticiones");
             System.out.println("- Remo con barra: 4 series de 10 repeticiones");
             System.out.println("- Plancha con elevación de piernas: 3 series de 15 repeticiones");
             System.out.println();

             System.out.println("Martes: Cardio (HIIT)");
             System.out.println("- Sprints de 30 segundos seguido de 1 minuto de trote suave. Repetir 8 veces.");
             System.out.println("- Enfriamiento: 5-10 minutos de caminata.");
             System.out.println();

             System.out.println("Miércoles: Flexibilidad y Core");
             System.out.println("- Sesión de yoga intensa: 30-45 minutos, enfocándose en la fuerza y la flexibilidad.");
             System.out.println("- Plancha (variaciones): frontales, laterales, con una pierna levantada: 3 series de 30 segundos cada una.");
             System.out.println();

             System.out.println("Jueves: Fuerza (Circuito)");
             System.out.println("- Kettlebell swings: 3 series de 15 repeticiones");
             System.out.println("- Flexiones de pike: 3 series de 10 repeticiones");
             System.out.println("- Dominadas o pull-ups: 3 series de 5-8 repeticiones");
             System.out.println("- Elevaciones de talones en un solo pie: 3 series de 10 repeticiones por pierna");
             System.out.println("- Plancha con desplazamiento lateral: 3 series de 10 repeticiones por lado.");
             System.out.println();

             System.out.println("Viernes: Cardio (Long Distance)");
             System.out.println("- Correr: 45-60 minutos a un ritmo constante, manteniendo una conversación.");
             System.out.println();

             System.out.println("Sábado: Actividad recreativa");
             System.out.println("- Entrenamiento en equipo: fútbol, baloncesto, o cualquier deporte que involucre alta intensidad y diversión.");
             System.out.println();

             System.out.println("Domingo: Recuperación activa");
             System.out.println("- Caminata ligera: 30 minutos.");
             System.out.println("- Estiramientos estáticos: 15 minutos, enfocándose en todos los grupos musculares.");



         }


    }







}
