package tresportres;
import java.util.Random;
public class Tresportres {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int somapc = 0;
        int produtopl = 0; //Fazendo a variavel receber 1 se obtem o mesmo resultado 
        int somaT = 0;
        int somadp = 0;
        Random alet = new Random();
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                matriz[x][y] = alet.nextInt(11);
                if (y == 0){
                    somapc += matriz[x][0];
                }
                if (x == 0) {
                    if (x == 0 && y == 0) {
                        produtopl = matriz[0][0];
                    } else {
                    produtopl *= matriz[0][y];
                    }
                }
                if (x == y) {
                    somadp += matriz[x][y];
                }
                somaT += matriz[x][y];
            }
        }
        System.out.println("A matriz formada é uma 3X3 com os seguinets valores: ");
        for (int x = 0; x < 3; x++) {
            System.out.println("");
            for (int y = 0; y < 3; y++) {
                System.out.print(matriz[x][y]+" ");
            }
        }
        System.out.println("");
        System.out.println("A soma dos elementos da primeira coluna é: "+somapc+" .O produto é da primeira linha é: "+produtopl);
        System.out.print("A soma de todos os elementos é: "+somaT+" E a soma da diagonal principal é: "+somadp);
    }
    
}