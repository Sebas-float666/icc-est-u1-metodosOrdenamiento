public class BubbleSortAvz {
    
    int[] array;

    public BubbleSortAvz(int[] arreglo){ 
        array = new int[]{10,5,0};
        this.array=arreglo;
    }
    public void sort(boolean asc){
        int tam=array.length;
        boolean huboIntercambio;
        int contComparaciones=0;
        for (int i=0;i<tam-1;i++){
            huboIntercambio=false;
            for (int j=0;j<tam-1;j++){
                contComparaciones++;
                huboIntercambio=true;
                if (array[j]>array[j+1]){
                    int aux = array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                    huboIntercambio=true;   
                }
            }
            if (!huboIntercambio){
                break;
            }
        }
        System.out.println(" Compraciones Totales: "+contComparaciones);
    }
   public void printArray() {
    int cont=0;
       for (int i : array) {
        cont=cont+1;
        if (cont<array.length){
            System.out.print(i+", ");
            }else{
            System.out.print(i);
            }
    }
}

}
