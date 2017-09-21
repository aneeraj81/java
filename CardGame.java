import java.util.Scanner;

class CardGame{
	
	public static void main(String args[]){

		int number,cardNumber;
		String c1="Ace",c2="2",c3="3",c4="4",c5="5",c6="6",c7="7",c8="8",c9="9",c10="10",c11="Jack",c12="Queen",c13="King";

		Scanner inputNumber = new Scanner(System.in);		

		System.out.print("Enter Number: ");

		number = inputNumber.nextInt();

		if(number > 0 && number <= 13) {

			cardNumber=number%13;	

			if(cardNumber == 1){ System.out.println("The card you picked is "+c1+" of Clubs"); } 
			if(cardNumber == 2){ System.out.println("The card you picked is "+c2+" of Clubs"); } 
			if(cardNumber == 3){ System.out.println("The card you picked is "+c3+" of Clubs"); } 
			if(cardNumber == 4){ System.out.println("The card you picked is "+c4+" of Clubs"); } 
			if(cardNumber == 5){ System.out.println("The card you picked is "+c5+" of Clubs"); } 
			if(cardNumber == 6){ System.out.println("The card you picked is "+c6+" of Clubs"); } 
			if(cardNumber == 7){ System.out.println("The card you picked is "+c7+" of Clubs"); } 
			if(cardNumber == 8){ System.out.println("The card you picked is "+c8+" of Clubs"); } 
			if(cardNumber == 9){ System.out.println("The card you picked is "+c9+" of Clubs"); } 
			if(cardNumber == 10){ System.out.println("The card you picked is "+c10+" of Clubs"); } 
			if(cardNumber == 11){ System.out.println("The card you picked is "+c11+" of Clubs"); } 
			if(cardNumber == 12){ System.out.println("The card you picked is "+c12+" of Clubs"); } 
			if(cardNumber == 0){ System.out.println("The card you picked is "+c13+" of Clubs"); }			

		}

		else if(number > 14 && number <= 26) {

			cardNumber=number%13;	

			if(cardNumber == 1){ System.out.println("The card you picked is "+c1+" of Daimonds"); } 
			if(cardNumber == 2){ System.out.println("The card you picked is "+c2+" of Daimonds"); } 
			if(cardNumber == 3){ System.out.println("The card you picked is "+c3+" of Daimonds"); } 
			if(cardNumber == 4){ System.out.println("The card you picked is "+c4+" of Daimonds"); } 
			if(cardNumber == 5){ System.out.println("The card you picked is "+c5+" of Daimonds"); } 
			if(cardNumber == 6){ System.out.println("The card you picked is "+c6+" of Daimonds"); } 
			if(cardNumber == 7){ System.out.println("The card you picked is "+c7+" of Daimonds"); } 
			if(cardNumber == 8){ System.out.println("The card you picked is "+c8+" of Daimonds"); } 
			if(cardNumber == 9){ System.out.println("The card you picked is "+c9+" of Daimonds"); } 
			if(cardNumber == 10){ System.out.println("The card you picked is "+c10+" of Daimonds"); } 
			if(cardNumber == 11){ System.out.println("The card you picked is "+c11+" of Daimonds"); } 
			if(cardNumber == 12){ System.out.println("The card you picked is "+c12+" of Daimonds"); } 
			if(cardNumber == 0){ System.out.println("The card you picked is "+c13+" of Daimonds"); }		

		}

		else if(number > 27 && number <= 39) {

			cardNumber=number%13;	

			if(cardNumber == 1){ System.out.println("The card you picked is "+c1+" of Hearts"); } 
			if(cardNumber == 2){ System.out.println("The card you picked is "+c2+" of Hearts"); } 
			if(cardNumber == 3){ System.out.println("The card you picked is "+c3+" of Hearts"); } 
			if(cardNumber == 4){ System.out.println("The card you picked is "+c4+" of Hearts"); } 
			if(cardNumber == 5){ System.out.println("The card you picked is "+c5+" of Hearts"); } 
			if(cardNumber == 6){ System.out.println("The card you picked is "+c6+" of Hearts"); } 
			if(cardNumber == 7){ System.out.println("The card you picked is "+c7+" of Hearts"); } 
			if(cardNumber == 8){ System.out.println("The card you picked is "+c8+" of Hearts"); } 
			if(cardNumber == 9){ System.out.println("The card you picked is "+c9+" of Hearts"); } 
			if(cardNumber == 10){ System.out.println("The card you picked is "+c10+" of Hearts"); } 
			if(cardNumber == 11){ System.out.println("The card you picked is "+c11+" of Hearts"); } 
			if(cardNumber == 12){ System.out.println("The card you picked is "+c12+" of Hearts"); } 
			if(cardNumber == 0){ System.out.println("The card you picked is "+c13+" of Hearts"); }				

		}

		else if(number > 40 && number <= 52) {

			cardNumber=number%13;	

			if(cardNumber == 1){ System.out.println("The card you picked is "+c1+" of Spades"); } 
			if(cardNumber == 2){ System.out.println("The card you picked is "+c2+" of Spades"); } 
			if(cardNumber == 3){ System.out.println("The card you picked is "+c3+" of Spades"); } 
			if(cardNumber == 4){ System.out.println("The card you picked is "+c4+" of Spades"); } 
			if(cardNumber == 5){ System.out.println("The card you picked is "+c5+" of Spades"); } 
			if(cardNumber == 6){ System.out.println("The card you picked is "+c6+" of Spades"); } 
			if(cardNumber == 7){ System.out.println("The card you picked is "+c7+" of Spades"); } 
			if(cardNumber == 8){ System.out.println("The card you picked is "+c8+" of Spades"); } 
			if(cardNumber == 9){ System.out.println("The card you picked is "+c9+" of Spades"); } 
			if(cardNumber == 10){ System.out.println("The card you picked is "+c10+" of Spades"); } 
			if(cardNumber == 11){ System.out.println("The card you picked is "+c11+" of Spades"); } 
			if(cardNumber == 12){ System.out.println("The card you picked is "+c12+" of Spades"); } 
			if(cardNumber == 0){ System.out.println("The card you picked is "+c13+" of Spades"); }			

		}
		
		else{

			System.out.println("Please input between 1 to 52");
		}


		

	}

}