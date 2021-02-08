import java.util.Scanner;

public class MainJuego {

    static Scanner entrada = new Scanner(System.in);


    public static void main(String[] args) {

        int dado1;
        int dado2;
        int opcion;
        

        Dados dado = new Dados();
        Juego juego =new Juego();
        System.out.println("Bienvenido al juego de dados");
        
        do{
            do{
            System.out.println("Por favor introduzca el valor del primer dado: ");
            dado1 = entrada.nextInt();
            }while((dado1 <0) && (dado1>7));
            do{
                System.out.println("Por favor introduzca el valor del segundo dado: ");
                dado2 = entrada.nextInt();
            }while((dado1 <0) && (dado1>7));
            dado.setDado1(dado1);
            dado.setDado2(dado2);
            juego.setSuma(dado.getDado1() + dado.getDado2());
            System.out.println("La suma de los dados es " +juego.getSuma());
            if((juego.getSuma() == 7) || (juego.getSuma() == 11)){
                System.out.println("Usted ha ganado");
            }else if ((juego.getSuma() == 2) || (juego.getSuma() == 3) || (juego.getSuma() == 12)){
                System.out.println("Usted ha perdido");
            }else if ((juego.getSuma() == 4) || (juego.getSuma() == 5) || (juego.getSuma() == 6) || (juego.getSuma() == 8) || (juego.getSuma(