package exercicios;
import java.util.Scanner;
public class Exercicios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int small = 0;
        int media = 0;
        int numbers[] = new int[5];
        System.out.println("Escreva 5 valores a serem armazenados: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
            media += numbers[i];
            if (i == 0){
                small = numbers[0];
            }
            if (small > numbers[i]) {
                small = numbers[i];
            }
        }
        System.out.print("Os valores informados foram: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.print(". Já os pares foram: ");
        for (int i = 0; i < 5; i++) {
            if (numbers[i]%2 == 0) {
                System.out.print(numbers[i]+"  ");
            }
        }
        System.out.println(", o menor número exibido na tela foi: "+small);
        System.out.println("A media dos números foi: "+media/5+" Os mariores que ele são: ");
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > media/5){
                System.out.print(numbers[i]+" "); 
            }
        }
    }
    
}