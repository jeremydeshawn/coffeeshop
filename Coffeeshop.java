import java.util.Scanner;

public class Coffeeshop{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        //ssk the user their balance
        //ask the user if they want expresso or amercano
        //ask the user how many they want
        //if the user inputs 0 or a negative number produce no output
        //if the user cannot afford the number of coffees requested produce no output
        //the user should get a different message depending on the type of coffe they purchased
        System.out.println("What's your balance?");
        String balanceInput = sc.nextLine();
        double balance = Double.parseDouble(balanceInput);
        System.out.println("What king of coffee do you want?");
        String coffeeInput = sc.nextLine();
        System.out.println("How many do you want?");
        String amountInput = sc.nextLine();
        int amount = Integer.parseInt(amountInput);
        double espressoPrice = 3.99;
        double americanoPrice = 2.99;
        double orderPrice = amount;

        if(amount > 0){
            //proceed with purchase
            boolean isEspresso = coffeeInput.equals("espresso");
            boolean isAmericano = coffeeInput.equals("americano");
            if(isEspresso){
                if(balance >= (espressoPrice * amount)){
                     orderPrice *= espressoPrice;
                     System.out.println("the price of your order is:"+ orderPrice);
                    System.out.println("Enjoy your espresso.");
                    System.out.println("your new balance:"+(balance - orderPrice));
                }
            }
            if(isAmericano){
                if(balance >= (americanoPrice * amount)){
                    orderPrice *= americanoPrice;
                    System.out.println("the price of your order is:"+ orderPrice);
                    System.out.println("Enjoy your americano.");
                    System.out.println("your new balance:"+(balance - orderPrice));
                }
            }
         }else{System.out.println("no coffee - amount requested negative or 0");
        }//no coffee

    }
}