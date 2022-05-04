import java.util.Scanner;

public class FoodList//cart
{
	public static int total_quantity=0;
	public static int total_purchase=0;
	//I have declared 4 products here 
	public static String[] products = {null, "1.) Quarter-Pounder Burger 50.00",
	 											"2.) One-Percenter (2-Stacks of Quarter Pounder Patty) 99.00",
	 											"3.) Tombstone Piledriver (3 Stacks of Quarter Pounder Patty) 150.00",
	 											"4.) God's Last Gift (Tombstone Burger with 100g of Carolina Reaper) 200.00"};
	//Prices in accordance of their elements
	public static int[] product_price ={0,50,99,150,200};
	//This is the cart for the check-out of all order you have
	public static int[] final_qty=new int[5];


			public static void main(String[] args)
			{
				Scanner s = new Scanner(System.in);
				int choose, quantity;
				String shop="Menus";
				int p1=0;
				int p2=0;
				int p3=0;
				int p4=0;
				char decision;
				System.out.println("Welcome to Burger TK, please choose any of the menu there..");
				do
				{

					for(int i = 0; i < products.length; i++)
					{
						if(products[i] != null)
						System.out.println(products[i]);
					}
					
					System.out.println("Choose any item: ");
					choose=s.nextInt();
					
					System.out.println("How many pieces? ");
					quantity=s.nextInt();

					switch(choose)
					{
						case 1:
						p1 += quantity;
						final_qty[1]=p1;
						break;
						
						case 2:
						p2 += quantity;
						final_qty[2]=p2;
						break;

						case 3: 
						p3 += quantity;
						final_qty[3]=p3;
						break;

						case 4: 
						p4 += quantity;
						final_qty[4]=p4;
						break;
					}
					System.out.print("Would you like to order again? Y/N / y/n: ");	
					decision=s.next().charAt(0);
				}while(decision != 'n' && decision != 'N');

				System.out.println("==Final Cart==");
				System.out.println("\t\\Shop name\t\\Item\t\\Qty\t\\Total");
				int sum=0;
				for(int i=0; i < final_qty.length; i++)
				{
					if(final_qty[i] != 0)
					{
						System.out.println(shop +" ,"+products[i]+","+final_qty[i]+","+final_qty[i]*product_price[i]);
						sum = sum + final_qty[i]*product_price[i];
					}
				}
				System.out.println("Total Purchased items: "+(p1+p2+p3+p4));
				System.out.println("Total Purchase: "+sum);
				int payment=0;
				do
				{
				System.out.print("Enter Payment: ");
				payment=s.nextInt();
				}while(sum > payment);
				System.out.println("Thank you for buying! here's your change: "+(payment-sum));
				}
	}


