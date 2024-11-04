public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro","Pérez","1053121010",1998,"Argentina",'H');

        Persona p2 = new Persona("Luis","León","1053223344",2001,"Mexico",'H');

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        p1.imprimir();

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");


        p2.imprimir();
    }
}
