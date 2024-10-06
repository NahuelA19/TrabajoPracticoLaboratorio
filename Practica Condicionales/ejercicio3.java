import javax.swing.*;

public class ejercicio3 {

    public static void main(String[]args){
        int contador = 1;


       while (contador >0) {
           int categoria = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese un valor segun la categoria del libro que desee: (1.Fantasia ,2.Misterio, 3.Romance, 4.Ciencia Ficcion) "));

           if(categoria == 1){
              JOptionPane.showMessageDialog(null,"Seleccionaste la categoria fantasia: El libro que se te recomienda segun tu gusto es:  El león, la bruja y el ropero - C.S. Lewis");

           } else if (categoria == 2){
               JOptionPane.showMessageDialog(null,"Seleccionaste la categoria misterio: El libro que se te recomienda segun tu gusto es: La chica del tren - de Paula Hawkins ");
           }else if(categoria == 3){
               JOptionPane.showMessageDialog(null,"Seleccionaste la categoria romance: El libro que se te recomienda segun tu gusto es: Yo antes de ti de Jojo Moyes ");
           }else if(categoria == 4){
               JOptionPane.showMessageDialog(null,"Seleccionaste la categoria ciencia ficcion: El libro que se te recomienda segun tu gusto es:  La guerra de los mundos de H.G. Wells -");
           }else{
               JOptionPane.showMessageDialog(null,"La opcion seleccionada no corresponde a ninguna de las categorias porfavor seleccione una nueva.");
               ++contador;
           }
           --contador;



       }





    }

}
