import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int paramentroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int paramentroDois = scan.nextInt();

        try{
            contar(paramentroUm, paramentroDois);
        }catch(ParametrosInvalidosException e){
            System.out.println("O primeiro parâmetro tem que ser menor que o segundo parâmetro");
        }
        
    }

    public static void contar(int inicio, int fim) throws ParametrosInvalidosException{
        if(fim < inicio){
            throw new ParametrosInvalidosException();
        }

        int contagem = fim - inicio;
        for (int i = 0; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
        
    }
}
