import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        String pedra = "pedra";
        String papel = "papel";
        String ataque = "ataque";

        for(int i = 0; i < a; i++){
            String x = sc.next();
            String y = sc.next();

            if(x.equals(pedra) && y.equals(pedra)){
                System.out.println("Sem ganhador");
            }
            
            else if(x.equals(ataque) && y.equals(ataque)){
                System.out.println("Aniquilacao mutua");
            }
            
            else if(x.equals(ataque) && !y.equals(ataque)){
                System.out.println("Jogador 1 venceu");
            }
            
            else if(y.equals(ataque) && !x.equals(ataque)){
                System.out.println("Jogador 2 venceu");
            }
            
            else if(x.equals(pedra) && y.equals(papel)){
                System.out.println("Jogador 1 venceu");
            }
            
            else if(x.equals(papel) && y.equals(pedra)){
                System.out.println("Jogador 2 venceu");
            }
            
            else if(y.equals(papel) && x.equals(papel)){
                System.out.println("Ambos venceram");
            }
        }

        sc.close();

    }
}
