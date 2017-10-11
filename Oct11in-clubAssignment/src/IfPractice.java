
public class IfPractice {
	public static void main(String[] args){
		int small = 5;
		int med = 9;
		int big = 16;
		if((small < big)&&(med < big)){
			System.out.print(big);
		}
		System.out.print(" ");
		if(med > small || med > big){
			System.out.print(med);
		}
		System.out.print(" ");
		if(small < big && small < big){
			System.out.println(small);
		}
		int i = 0;
		while(i < 3){
			System.out.println("go prograamming");
			i++;
		}
		int john = 10;
		while(john > 0){
			System.out.println("SOMETHING ATE MY PIZZA");
			john--;
			if(john == 0){
				System.out.println("THEN I STABBED HIM!!!");
				}
			}
		for(i = 0;i < 10; i++){
			System.out.println("THEN I MADE A PIZZA OUT OF HIM!");
			if(i == 9){
				System.out.println("HE TASTED LIKE HUMAN!");
				}
			}
		}
	}
