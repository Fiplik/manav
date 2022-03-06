import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
        System.out.print("Kaç kilo elma aldınız? :");
        double elma1= input.nextDouble();
        System.out.print("Kaç kilo armut aldınız? :");
        double armut1= input.nextDouble();
        System.out.print("Kaç kilo domates aldınız? :");
        double domates1= input.nextDouble();
        System.out.print("Kaç kilo muz aldınız? :");
        double muz1= input.nextDouble();
        System.out.print("Kaç kilo patlican aldınız? :");
        double patlican1= input.nextDouble();

        double toplam=(armut1*armut)+(elma1*elma)+(domates1*domates)+(muz1*muz)+(patlican1*patlican);
        System.out.println("********************************************");
        System.out.println("Manavımıza toplam borcunuz: "+ toplam);


    }
}
