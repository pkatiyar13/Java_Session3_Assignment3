import java.util.*;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter number to generate Random number: ");
		int num = scan.nextInt();
		RandomNumberGenerator obj = new RandomNumberGenerator(num);
		System.out.println("Random Number between 1 and "+num+" is: " +obj.GetRandomNumber());
	}

}

class RandomNumberGenerator {
	int num;
	double rnum;
	public RandomNumberGenerator(int num){
		this.num=num;
	}
	double GetRandomNumber(){
		rnum = this.num * Math.random();
		return rnum;
	}
	
}