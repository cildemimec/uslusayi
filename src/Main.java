import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü  alınacak sayı : ");
        n =input.nextInt();
        System.out.print("Üssü  olacak sayı : ");
        k =input.nextInt();
        int total =1;

        for (int m=1; m<= k;m++){
            total *= n;
        }


        System.out.println("Cevap : "+ total);
    }
}
