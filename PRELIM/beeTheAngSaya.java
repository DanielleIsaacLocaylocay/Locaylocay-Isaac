import java.util.Scanner;

   public class beeTheAngSaya{
   public static void main (String[] args){
      System.out.println("ChicksNjoy");
      Scanner sc = new Scanner (System.in);
      
      //Prices
      final double  barkadaMeal = 280;
      final double  back2SchoolMeal = 120;
      
      //Input
      System.out.println("How many Barkada Meal would you like to order: ");
      int drumstickQty = sc.nextInt();
      
      System.out.println("How many Back 2 School would you like to order: ");
      int wingsQty = sc.nextInt();
                 
      //Total Prices
      double drumstickTotalPrice =  drumstick * drumstickQty;
      double wingsTotalPrice = wings * wingsQty;
      double breastTotalPrice = breast * breastQty;
      
      //Output
      System.out.println("Total DrumstickPrice: "+drumstickTotalPrice);
      System.out.println("Total WingsPrice: "+wingsTotalPrice);
      System.out.println("Total BreastPrice: "+breastTotalPrice);
   
   }
  }
