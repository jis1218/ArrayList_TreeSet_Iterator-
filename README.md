# ArrayList, TreeSet, Iterator 연습

## 1. ArrayList
> ##### List가 implementing 된 클래스로 데이터를 array base가 아닌 Collection base로 받는다.

#### 코드 예제

```java

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
```

## 2. TreeSet
> ##### Set이 implementing된 클래스로 똑같은 element를 허용하지 않는다.

#### 코드 예제

```java

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
```

## 3. Iterator
> ##### iterate가 반복이라는 뜻을 가지고 있음, Collection에 대한 반복을 수행한다. Set 등의 interface는 모두 Iterable interface를 superinterface로 가지고 있고 Iterable interface에 iterator()라는 함수가 있는데 return 값으로 Iterator interface를 반환한다. 따라서 Iterable interface를 implementing 하는 모든 interface는 iterator() 함수를 사용해야 한다.

#### 코드 예제

```java

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
```
