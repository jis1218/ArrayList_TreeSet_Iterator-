import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetPrac {
	
	//Set�� �Ȱ��� element�� ������� ����
	//Set ��ü�� interface�̹Ƿ� ��üȭ�� �ȵ�, ���� implementing�� �޴� TreeSet�� ����ϴ°� ����.
	
	public void setPrac(){
		
		TreeSet<Integer> set = new TreeSet<>();
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		for(int i=0; i<10; i++){
			arraylist.add(i/2);
			System.out.print(arraylist.get(i));
		}
		
		//set.add�� ��ȯ���� boolean, �ߺ��Ǵ� ���� ���� ��� false�� ��ȯ�Ѵ�.
		System.out.println(set.add(11)); //true
		System.out.println(set.add(12)); //true
		System.out.println(set.add(15)); //true
		System.out.println(set.add(51)); //false
		
		//set.addAll�� �ߺ��Ǵ� ���� �� ������.
		System.out.println(set.addAll(arraylist));
		
		Integer integer[] = set.toArray(new Integer[set.size()]);
		
		for(int item : integer){
			System.out.println(item);
		}

	}

}
