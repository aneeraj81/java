import java.util.Scanner;

class PostiveNegativeCount{
	
	public static void main(String args[]){

		int number,pcount=0,ncount=0,sum=0;

		Scanner inputNumber = new Scanner(System.in);		

		do {

			System.out.print("Enter Number: ");

			number = inputNumber.nextInt();

			if(number > 0) {	
				pcount++;
			}			

			if(number < 0) {	
				ncount++;
			}

			sum=sum+number;

		}
		while(number != 0);
		
		System.out.println("(Postive Count: "+pcount+",Negtive Count: "+ncount+",Total: "+sum+")");

	}

}