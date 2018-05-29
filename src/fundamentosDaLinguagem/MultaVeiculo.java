package fundamentosDaLinguagem;

import java.util.Scanner;

public class MultaVeiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Tipo de veiculo(passeio, caminhão): ");
        String tipoVeiculo = entrada.nextLine();
        
        System.out.println("Velocidade maxima da via: ");
        int velocidadeVia = entrada.nextInt();
        
        System.out.println("Velocidade do veiculo: ");
        int velocidadeVeiculo = entrada.nextInt();
        
        if(tipoVeiculo.equals("passeio") && velocidadeVeiculo > (velocidadeVia *1.1) ||
                tipoVeiculo.equals("caminhao") && velocidadeVeiculo > (velocidadeVia * 1.5)){
            System.out.println("Multa");
        }else{
            System.out.println("Não Multa");
        }
        
        
    }
}
