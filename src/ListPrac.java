import java.util.ArrayList;

public class ListPrac {
	
	
	
	public void arraylistprac(){
		
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		arraylist.add(1);
		arraylist.add(2);
		
		//ArrayList�� add �� ����ϴ� �ڵ�
		for(int item : arraylist){
			System.out.println(item);
		}
		
		//ArrayList�� size�� ����ϴ� �ڵ�
		System.out.println(arraylist.size());
		
		//ArrayList�� ����ִ��� �ƴ��� Ȯ���ϴ� �ڵ�
		System.out.println(arraylist.isEmpty());
		
		//ArrayList�� �ִ� ������ ���ο� �迭�� �ִ� ���� Collection base���� array base�� �ٲ���
		Integer[] a = arraylist.toArray(new Integer[arraylist.size()]);
		System.out.println(a[1]);
		
		
	}

}
