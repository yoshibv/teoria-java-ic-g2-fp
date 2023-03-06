package fp.testBasico;

import java.util.ArrayList;
import java.util.List;

public class TestLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> temp;
		temp = new ArrayList<Integer>();
		temp.add(42);
		temp.add(43);
		temp.add(44);
		System.out.println(temp);
		System.out.println(temp.get(2));
		
		Integer suma = 0;
		for(int i=0;i<temp.size();i++) {
			suma += temp.get(i);
		}
		System.out.println(suma/temp.size());
		suma=0;
		for (Integer e : temp) {
			suma+=e;
		}
		System.out.println(suma/temp.size());
		
		

	}

}
