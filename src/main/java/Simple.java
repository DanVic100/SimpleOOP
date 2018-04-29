import java.util.Scanner;

public class Simple {

    public static void main(String[] args)
    {

        Candy candyCake = new Candy("cake Candy",5.7f,4.6f, 4.5f);
        Candy candyPie = new Candy("pie Candy",3.5f,7.4f, 0.1f);

        Cake cakeCake = new Cake("cake Cake", 9.1f,3.7f,"white");
        Cake pieCake = new Cake("pie Cake", 8.3f,7.3f,"pink");

        Jellybean cakeJellybean = new Jellybean("cake jellybean",9.2f,6.3f,223);
        Jellybean pieJellybean = new Jellybean("pie jellybean",5.33f,7.2f,223);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of cake Candy: ");
        int candyCakeNum = scanner.nextInt();
        System.out.println("Enter number of pie Candy: ");
        int candyPieNum = scanner.nextInt();
        System.out.println("Enter number of cake Cake: ");
        int cakeCakeNum  = scanner.nextInt();
        System.out.println("Enter number of pie Cake: ");
        int pieCakeNum  = scanner.nextInt();
        System.out.println("Enter number of cake Jellybean: ");
        int cakeJellybeanNum = scanner.nextInt();
        System.out.println("Enter number of pie Jellybean: ");
        int pieJellybeanNum = scanner.nextInt();

        int NumSweetness = candyCakeNum + candyPieNum + cakeCakeNum
                + pieCakeNum + cakeJellybeanNum +pieJellybeanNum;

        Prize newYearPrize = new Prize(NumSweetness);
        for (int i =0; i < candyCakeNum;i++)newYearPrize.addPrize(candyCake);
        for (int i =0; i < candyPieNum;i++)newYearPrize.addPrize(candyPie);
        for (int i =0; i < cakeCakeNum;i++)newYearPrize.addPrize(cakeCake);
        for (int i =0; i < pieCakeNum;i++)newYearPrize.addPrize(pieCake);
        for (int i =0; i < cakeJellybeanNum;i++)newYearPrize.addPrize(cakeJellybean);
        for (int i =0; i < pieJellybeanNum;i++)newYearPrize.addPrize(pieJellybean);

        float priceNewYearPrize = 0;
        float weightNewYearPrize = 0;


        for (Sweetness sweetness : newYearPrize.getSweetnesses()){
            if(sweetness != null) {
                priceNewYearPrize += sweetness.getPrice();
                weightNewYearPrize += sweetness.getWeight();
            }
        }

        System.out.println("Price of New Year Prize: " + priceNewYearPrize);
        System.out.println("Weight of New Year Prize: " + weightNewYearPrize);
        System.out.println("New Year Prize: ");

        for (Sweetness sweetness : newYearPrize.getSweetnesses()){
            if(sweetness != null) {System.out.println(sweetness.name); }
        }
    }
}
