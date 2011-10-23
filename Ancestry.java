import java.util.*;

public class Ancestry{
	static ArrayList<ArrayList<String>> lists;
	static ArrayList<String> result;
	static Scanner scan = new Scanner(System.in);
	static int numRecs, count = 0, checkedCount =0;
	static String name;
	
	public static void main(String[] args){
		lists = new ArrayList<ArrayList<String>>();
		numRecs = scan.nextInt();
		result = new ArrayList<String>();
		for(int i = 0; i < numRecs; i++){
			ArrayList<String> pair = new ArrayList<String>();
			pair.add(scan.next());
			pair.add(scan.next());
			lists.add(pair);
		}	
		
		for(int i = 0; i<numRecs; i++){
			name = lists.get(i).get(0);
			for(int j = 0; j<numRecs; j++){
				if(!(name.equals(lists.get(j).get(1)))){
					checkedCount++;
				}
			}
			if(checkedCount == numRecs){
				result.add(name);
			}
			checkedCount = 0;
		}
		
		for(int i=0; i<result.size(); i++){
			for(int j = 0; j<result.size(); j++){
				if((result.get(i).equals(result.get(j))) && i != j)
					result.remove(i);
			}			
		}
		
		for(int i=0; i<result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}