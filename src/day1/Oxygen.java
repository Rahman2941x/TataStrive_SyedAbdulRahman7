package day1;

import java.util.*;

public class Oxygen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" Enter the length of the room(in m)");
        double len = sc.nextDouble();
        if(len<=0) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println(" Enter the breadth of the room(in m)");
        double breath = sc.nextDouble();
        if(breath<=0){
        System.out.println("Invalid Input");
        return;
        }

        System.out.println(" Enter the plant area of a single plant(in cm2)");
        double area = sc.nextDouble();
        if(area<=0){
            System.out.println("Invalid Input");
            return;
        }

        double totalNumberOfPlants ;
         totalNumberOfPlants= (((len*breath)/area)*100*100);

        totalNumberOfPlants = totalNumberOfPlants - (totalNumberOfPlants%10);

        System.out.printf("Total number of plants is: %.0f /n" , totalNumberOfPlants);
        System.out.printf("Total oxygen production is:  %.2f",(totalNumberOfPlants*0.9));

    }

}
