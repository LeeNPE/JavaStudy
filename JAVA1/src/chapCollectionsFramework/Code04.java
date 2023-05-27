package chapCollectionsFramework;
import java.util.*;
class Worker{
	
	void readWork(int workData) {
		System.out.print("start reading(" + workData + ") : ");
		while(workData != 0) {
			if(workData > 0) workData--;
			else if(workData < 0) workData++;
			System.out.print(workData+", ");
		}
		System.out.println("finish");
	}
}
public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> ll= new LinkedList<Integer>();
		Scanner user = new Scanner(System.in);
		Worker listWorker = new Worker();
		int countData, startData, endData;
		byte option;	
		Random rand = new Random();
		do{	
		System.out.println("what do you want to do");
		option = user.nextByte();
			switch(option) {
			case 1 : 
				System.out.println("How much data dou you want to put in");
				countData = user.nextInt();
				System.out.println("What range do you want to work(Integer Range)");
				startData = user.nextInt();
				System.out.print(" to ");
				endData = user.nextInt();
				for( ; countData > 0 ; countData--) {
					int data = rand.nextInt(startData, endData);
					try {
						ll.add(data);
					} catch(Exception e) {
						// TODO: handle exception
						System.out.println("Exception : " + e);
					}
				}
				break;
			case 2 : 
				System.out.println("How much data do you want to read.");
				for(int countRead = user.nextInt(); countRead > 0 ; countRead--) {
					listWorker.readWork(ll.poll());
				}
				//break;
			case 3 : 
				System.out.print("Queue - {");
				Iterator<Integer> llIter = ll.iterator();
				while(llIter.hasNext()) {
					System.out.print(llIter.next() + ", ");
				}
				System.out.println("}");
			}
		}while(option != -1);
		user.close();
	}
}
