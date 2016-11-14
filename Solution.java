import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Solution {
	public static void main(String a[])throws IOException {
		Time object1 = new Time();
		object1 = new Time(23,59,59);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int option;
		System.out.println("1.nextSecond 2.nextMinute 3.nextHour 4.previousSecond 5.previousMinute 6.previousHour");
		option = Integer.parseInt(bf.readLine());
		switch(option) {
			case 1:object1.nextSecond();
                   break; 
            case 2:object1.nextMinute();
                   break; 
            case 3:object1.nextHour();
                   break;    
            case 4:object1.previousSecond();
                   break; 
            case 5:object1.previousMinute();
                   break; 
            case 6:object1.previousHour();
                   break;                   
		}
	}
}