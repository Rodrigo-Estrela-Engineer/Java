import java.util.Arrays;
public class Matriz {
    public static void main(String[] args )
    {
        int[][] matriz; // criando uma matriz
        matriz = new int[3][3];
        for(int[] linha : matriz){
            Arrays.fill(linha, 1); // preenchendo a matriz com o valor 1
        }

        System.out.println("Elementos da matriz 3x3:");
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j =0; j< matriz.length; j++)
            {
                System.out.print(matriz[i][j] + " "); // exibindo os elementos da matriz
            }
            System.out.println();
        }
    }
}
