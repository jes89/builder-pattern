

import DTO.AmericanoDTO;
import DTO.DrinkDTO;


public class Main {

	public static void main(String[] args) {
		
		
		AmericanoDTO americanoDTO = new AmericanoDTO.Builder(DrinkDTO.Size.MEDIUM)
				.addAdditions(DrinkDTO.Addition.NO_MILK)
				.addAdditions(DrinkDTO.Addition.SUGAR)
				.setCalories(100)
				.setQuantity(1)
				.build();
		
		System.out.println(americanoDTO.getCalories());
		System.out.println(americanoDTO.getQuantity());
		System.out.println(americanoDTO.getSize());
		System.out.println(americanoDTO.getAdditions());
		
	}
}
