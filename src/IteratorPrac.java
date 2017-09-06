import java.util.Iterator;
import java.util.TreeSet;

public class IteratorPrac {
	
	public void iterPrac(){
	
	//TreeSet 자체는 값을 받는 메소드가 없으므로 TreeSet에 저장된 값을 Iterator에 넘겨준다.
	TreeSet<Integer> treeSet = new TreeSet<>();
	
	treeSet.add(1);
	treeSet.add(2);
	treeSet.add(5);
	treeSet.add(10);
	
	Iterator<Integer> iterator = treeSet.iterator();
	
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
	
	Iterator<Integer> iter = new Iterator<Integer>(){

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}; //다음과 같이 내가 원하는대로 hasNext와 next 함수의 기능을 지정을 해줄 수가 있다. treeSet의 iterator는 이미 기능이 저장되어 있음
	   // treeSet.iterator()를 iterator에 넣는 과정은 treeSet에서 설정된 Iterator의 기능을 iterator에 넣어준다고 생각할 수 있음
	
		
	}

}
