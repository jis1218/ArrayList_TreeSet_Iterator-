import java.util.ArrayList;

public class ListPrac {
	
	
	
	public void arraylistprac(){
		
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		arraylist.add(1);
		arraylist.add(2);
		
		//ArrayList에 add 후 출력하는 코드
		for(int item : arraylist){
			System.out.println(item);
		}
		
		//ArrayList의 size를 출력하는 코드
		System.out.println(arraylist.size());
		
		//ArrayList가 비어있는지 아닌지 확인하는 코드
		System.out.println(arraylist.isEmpty());
		
		//ArrayList에 있는 내용을 새로운 배열에 넣는 과정 Collection base에서 array base로 바꿔줌
		Integer[] a = arraylist.toArray(new Integer[arraylist.size()]);
		System.out.println(a[1]);
		
		
	}

}
