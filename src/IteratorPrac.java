import java.util.Iterator;
import java.util.TreeSet;

public class IteratorPrac {
	
	public void iterPrac(){
	
	//TreeSet ��ü�� ���� �޴� �޼ҵ尡 �����Ƿ� TreeSet�� ����� ���� Iterator�� �Ѱ��ش�.
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
		
	}; //������ ���� ���� ���ϴ´�� hasNext�� next �Լ��� ����� ������ ���� ���� �ִ�. treeSet�� iterator�� �̹� ����� ����Ǿ� ����
	   // treeSet.iterator()�� iterator�� �ִ� ������ treeSet���� ������ Iterator�� ����� iterator�� �־��شٰ� ������ �� ����
	
		
	}

}
