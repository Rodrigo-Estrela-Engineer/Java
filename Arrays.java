public class Arrays {
    public static void main(String[] args){
        String[] carros = new String[]  { "Volvo", "BMW", "Ford", "Mazda", "Fiat" }; // Ao inicializar o array, é necessário definir o tamanho (new String[5]) 
        // ou os elementos dentro de chaves {}

        // carros[0] = "Volvo";
        // carros[1] = "BMW";
        // carros[2] = "Ford";
        // carros[3] = "Mazda";
        // carros[4] = "Fiat";

        for(int i =0; i< carros.length ; i++)
        {
            System.out.println(carros[i]);
        }
    }
}
