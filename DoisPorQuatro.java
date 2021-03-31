package doisporquatro;
import java.util.Random;
public class Doisporquatro {
    public static void main(String[] args) {
        int twofour[][] = new int[2][4];
        Random makenumber = new Random();
        for(int x = 0; x < 2; x++){
            for(int y = 0;y < 4 ; y++){
                twofour[x][y] = makenumber.nextInt(11);
            }
        }
        for (int x = 0; x < 2; x++) {
            if(x == 1){
                System.out.println("");
            }
            for(int y = 0;y < 4 ; y++){
                System.out.print(twofour[x][y]);
            }
        }
        System.out.println("");
    }
}
