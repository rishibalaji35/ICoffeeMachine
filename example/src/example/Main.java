package example;

import java.util.*;

//Abstraction using Interface
  interface ICoffeeMachine{
 
 
  void cappuciano();

  void user_Cappuciano(int water,int milk,int tbspn);
 
    void expresso();
   
    void user_Expresso(int water,int milk,int tbspn);
   
    void latte();
   
    void user_Latte(int water,int milk,int tbspn);

}

class CoffeeMachine implements ICoffeeMachine{

//Encapsulation
   private double default_water = 20,default_milk = 20,default_coffee_powder = 40;

Scanner sc = new Scanner(System.in);
   
   @Override
   public void cappuciano(){

       System.out.println("Preparing Cappuciano");

       
       int water = 8;
       
       this.default_water = default_water - water;
       
       int milk = 10;

       this.default_milk = default_milk - milk;
       
       int coffee_powder = 5;

       this.default_coffee_powder = default_coffee_powder - coffee_powder;

       System.out.println("Cappuciano is Ready");
       System.out.println(default_water);
       
       if(default_coffee_powder <= 0 || default_milk <= 0 || default_water <= 0) {
       
        refill();
       
       }
       
   }
   
   @Override
   public void user_Cappuciano(int water,int milk,int coffee_powder){

       System.out.println("Preparing Cappuciano");

       default_water = default_water - water;
       default_milk = default_water - milk;
       default_coffee_powder = default_coffee_powder - coffee_powder;
       
       System.out.println("Cappuciano is Ready");
       System.out.println(water);
       
       if(default_coffee_powder <= 0 || default_milk <= 0 || default_water <= 0) {
       
        refill();
       
       }
   }
   

   @Override
   public void expresso(){

       System.out.println("Preparing Expresso");

       int water = 9;
       
       this.default_water = default_water - water;
       
       int milk = 11;

       this.default_milk = default_milk - milk;
       
       int coffee_powder = 6;

       this.default_coffee_powder = default_coffee_powder - coffee_powder;

       System.out.println("Expresso is Ready");

       if(default_coffee_powder <= 0 || default_milk <= 0 || default_water <= 0) {
       
        refill();
       
       }
       
     
   }
   
   public void user_Expresso(int water,int milk,int coffee_powder) {
   
    System.out.println("Preparing Expresso");
   
    default_water = default_water - water;
       default_milk = default_water - milk;
       default_coffee_powder = default_coffee_powder - coffee_powder;

       System.out.println("Expresso is Ready");

       if(default_coffee_powder <= 0 || default_milk <= 0 || default_water <= 0) {
       
        refill();
       
       }
   }

   @Override
   public void latte(){

       System.out.println("Preparing Latte");

       int water = 11;
       
       this.default_water = default_water - water;
       
       int milk = 9;

       this.default_milk = default_milk - milk;
       
       int coffee_powder = 9;

       this.default_coffee_powder = default_coffee_powder - coffee_powder;

       System.out.println("Latte is Ready");
       if(default_coffee_powder <= 0 || default_milk <= 0 || default_water <= 0) {
       
        refill();
       
       }
     
   }
   
   @Override
   public void user_Latte(int water,int milk,int coffee_powder){

       System.out.println("Preparing Latte");
       
       default_water = default_water - water;
       default_milk = default_water - milk;
       default_coffee_powder = default_coffee_powder - coffee_powder;

       System.out.println("Latte is Ready");
       if(default_coffee_powder <= 0 || default_milk <= 0 || default_water <= 0) {
       
        refill();
       
       }
     
   }

   private void refill(){
       this.default_water = 20;
       this.default_coffee_powder = 20;
       this.default_milk = 40;
   }


}

class Main{
   public static void main(String args[]){
   

   
       ICoffeeMachine c = new CoffeeMachine();
       System.out.println("Press 1 for Cappuciano");
       System.out.println("Press 2 for Expresso");
       System.out.println("Press 3 for Latte");

       Scanner sc = new Scanner(System.in);
       
       while(true) {
       
       int n = sc.nextInt();

       switch(n){
           case 1:
            System.out.println("Do you want to drink with the Default Proportion? y/n");
            char ch = sc.next().charAt(0);
            if(ch == 'y') {
            c.cappuciano();
               break;
            }
            else{
            System.out.println("Enter the water level in ml/n");
            int water1 = sc.nextInt();
           
            System.out.println("Enter the milk level in ml/n");
            int milk1 = sc.nextInt();
           
            System.out.println("Enter the Coffee powder level in Table Spoon/n");
            int coffee_powder1 = sc.nextInt();
           
            c.user_Cappuciano(water1, milk1, coffee_powder1);
            break;
            }

           case 2:
            System.out.println("Do you want to drink with the Default Proportion? y/n");
            char ch1 = sc.next().charAt(0);
            if(ch1 == 'y') {
            c.expresso();
               break;
            }
            else{
            System.out.println("Enter the water level in ml/n");
            int water1 = sc.nextInt();
           
            System.out.println("Enter the milk level in ml/n");
            int milk1 = sc.nextInt();
           
            System.out.println("Enter the Coffee powder level in Table Spoon/n");
            int coffee_powder1 = sc.nextInt();
           
            c.user_Expresso(water1,milk1,coffee_powder1);
            break;
            }

           case 3:
            System.out.println("Do you want to drink with the Default Proportion? y/n");
            char ch2 = sc.next().charAt(0);
            if(ch2 == 'y') {
            c.latte();
               break;
            }
            else{
            System.out.println("Enter the water level in ml/n");
            int water1 = sc.nextInt();
           
            System.out.println("Enter the milk level in ml/n");
            int milk1 = sc.nextInt();
           
            System.out.println("Enter the Coffee powder level in Table Spoon/n");
            int coffee_powder1 = sc.nextInt();
           
            c.user_Latte(water1,milk1,coffee_powder1);
            break;
            }
           
       }
       
       System.out.println("Do you want to use this machine again? y/n");
       char s = sc.next().charAt(0);
       if(s == 'y') {
        continue;
       }
       else  if(s == 'n')
        break;
       }
       
   }
 
}