import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Kaç elemanlı küme: ");
        long eleman= input.nextInt();

        System.out.println("kaç elemanlı farklı grup: ");
        long grup= input.nextInt();

        long efak=1,gfak=1,egfak=1;

        for (int i=1; i<=eleman;i++){
            efak*=i;
        }
        for (int i=1; i<=grup;i++){
            gfak*=i;
        }
        for (int i=1; i<=(eleman-grup);i++){
            egfak*=i;
        }

        long kombinasyon= efak/(gfak*egfak);
        System.out.println("kombinasyon: "+ kombinasyon);

    }
}