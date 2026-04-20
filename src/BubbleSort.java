public class BubbleSort {
    public BubbleSort(){
        System.out.println("Se creo la clase en el constructor");
        
    }

    public void sortAscendente(int numeros[]){
        for (int i=0;i<numeros.length;i++){
            for (int j=i+1;j<numeros.length;i++){

                if(numeros[i]>numeros[j]){
                    int aux =numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=aux;
                }
            }
        }
    }

    public void sortDescendente(int[] numeros){
        for (int i=0;i<numeros.length;i++){
         for (int j=i+1;j<numeros.length;i++){

                if(numeros[i]>numeros[j]){
                    int aux =numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=aux;
                }
            } 
        }
    }

    public void printArreglo(int[] numeros) {
        int cont=0;
        for (int i : numeros) {
            cont=cont+1;
            if (cont<5){
            System.out.print(i+", ");
            }else{
            System.out.print(i);
            }
        }
    
    }


    public void sort(int numeros[], boolean asc){
        if (asc){
            sortAscendente(numeros);
        }else{
            sortDescendente(numeros);
        }
    }
}
