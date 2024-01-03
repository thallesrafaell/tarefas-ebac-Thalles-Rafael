public class Main {
    public static void main(String[] args) {
        declaracaoArraySimples();
        arrayBidimensional();
    }

    private  static  void declaracaoArraySimples(){
        System.out.println("*****Declaraçâo do Array*****");
        int [] a = new int[4];

        int [] b;

        b = new int[10];

        int [] r = new int[44], k = new int [23];

        int [] iniciaValores = {12,32,54,6,8,89,64,64,6};

        int [] meuArray;

        meuArray = new int[10];


        meuArray [0] = 1;

        meuArray [1] = 2;

        meuArray [2] = 3;
        meuArray [3] = 4;
        meuArray [4] = 5;
        meuArray [5] = 6;
        meuArray [6] = 7;
        meuArray [7] = 8;
        meuArray [8] = 9;
        meuArray [9] = 10;

        System.out.println("Posição 8 do meuArray: " + meuArray[8]);
        System.out.println("");
        System.out.println("Posição 2 do meuArray: " + meuArray[2]);
        int tamanhoDoArray = meuArray.length;
        if(tamanhoDoArray > 2){
            System.out.println("");
            System.out.println("*****Tamanho do Array*****");
            System.out.println("");
            System.out.println(tamanhoDoArray);
            System.out.println("");

        }
    }
    private static void arrayBidimensional(){

        System.out.println("*****Declaraçâo de Array Bidimensional*****");
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 = {{1,2}, {3}, {4,5,6}};


        for(int linha = 0; linha < array1.length; linha++){
            for (int coluna = 0; coluna < array1[linha].length; coluna++){
                System.out.println("%D" + array1[linha][coluna]);
                System.out.println("");
            }
        }

        System.out.println("***** Array2 *****");

        for(int linha = 0; linha < array2.length; linha++){
            for (int coluna = 0; coluna < array2[linha].length; coluna++){
                System.out.println("%D" + array2[linha][coluna]);
                System.out.println("");
            }
        }

    }
}