package chapCollectionsFramework;
import java.util.*;
public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>(10);
		Scanner userInput = new Scanner(System.in);
		byte option;
		int index;
		String elem;
		 do{
		System.out.println("choose option");
		option = userInput.nextByte();
		switch(option) {
		case 1 : 
			System.out.println("what is the element's number?(input small than " + (al.size() + 1) + ")");
			index = userInput.nextInt();
			System.out.println("what is the element's name?");
			elem = userInput.next();
			al.add(index,elem);
			break;
		case 2 : 
			System.out.println("what is the element's number?");
			index = userInput.nextInt();
			System.out.println("delete" + al.remove(index));
			break;
		case 3: 
			System.out.println("what is the element's number?");
			index = userInput.nextInt();
			System.out.println(index + " : " + al.get(index));
			break;
		case 4 : 
			for(index = 0;index < al.size(); index++)
				System.out.println(index + " : " + al.get(index));	
			break;
				}
		}while(option != -1);
		userInput.close();
		System.out.println("end");
	}

}
