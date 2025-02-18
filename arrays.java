import java.util.Arrays;

public class cursojava{
    public static void main(String[] args) {
        
        final int tam=10;
        int[] num={9, 2, 7, 1, 8, 5, 3, 4, 0, 6};
        int[] numeros=new int[tam];
        int p=15;
        int pos;
        
        //Arrays.sort(num);
        //Arrays.fill(numeros,10);
        //System.arraycopy(num, 0, numeros, 0, tam);

        Arrays.sort(num);
        pos=Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d esta no array? %s na posicao %d",p ,pos > 0 ? "Sim" : "Não", pos);

        //for(int n:numeros){
       //     System.out.printf("%d - ",n);
       // }
    }
}
