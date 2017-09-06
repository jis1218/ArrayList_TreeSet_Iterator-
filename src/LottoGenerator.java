import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;



public class LottoGenerator {
	
	public void generateLottoNum(){
	
	TreeSet<Integer> treeSet = new TreeSet<>();
	Random random = new Random();
	
	for(; 6>treeSet.size();){
	
	int num = random.nextInt(45) + 1;
	treeSet.add(num);
	}
	
	Iterator<Integer> iter = treeSet.iterator();
	
	while(iter.hasNext()){
		System.out.println(iter.next());
	}	
	}

}
