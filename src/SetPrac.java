import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetPrac {
	
	//Set은 똑같은 element를 허용하지 않음
	//Set 자체는 interface이므로 객체화가 안됨, 따라서 implementing을 받는 TreeSet을 사용하는게 좋다.
	
	public void setPrac(){
		
		TreeSet<Integer> set = new TreeSet<>();
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		for(int i=0; i<10; i++){
			arraylist.add(i/2);
			System.out.print(arraylist.get(i));
		}
		
		//set.add의 반환값은 boolean, 중복되는 값이 있을 경우 false를 반환한다.
		System.out.println(set.add(11)); //true
		System.out.println(set.add(12)); //true
		System.out.println(set.add(15)); //true
		System.out.println(set.add(51)); //false
		
		//set.addAll은 중복되는 값은 다 버린다.
		System.out.println(set.addAll(arraylist));
		
		Integer integer[] = set.toArray(new Integer[set.size()]);
		
		for(int item : integer){
			System.out.println(item);
		}

	}

}
