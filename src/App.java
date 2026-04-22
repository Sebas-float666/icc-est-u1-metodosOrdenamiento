public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros={10,0,-5,5,15,2};
        runBubbleSort();
        runBubbleSortAvz();
    }

    public static void runBubbleSort(){
        // System.out.println("Metodo Burbuja");
        // int[] numeros={-5,10,2,0,7};
        // BubbleSort bubbleSort=new BubbleSort();
        // bubbleSort.printArreglo(numeros);

        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.printArreglo(numeros);
        
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglo(numeros);

        // bubbleSort.sort(numeros,true);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sort(numeros,false);
        // bubbleSort.printArreglo(numeros);
        
        
    }

    public static void runBubbleSortAvz(){
        System.out.println("Metodo Burbuja Avanzado");
        int[] array={9,2,3,0,8,5};
        BubbleSortAvz bSortAvz=new BubbleSortAvz(array);
        bSortAvz.printArray();
        bSortAvz.sort(true);
        bSortAvz.printArray();
    }
   
}
