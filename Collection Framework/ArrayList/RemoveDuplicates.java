package ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
	
        list.add("Apple");    
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--; 
                }
            }
        }

        System.out.println(list);
        
        

	}

}
