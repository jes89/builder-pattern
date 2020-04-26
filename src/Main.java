

import DTO.AmericanoDTO;
import DTO.DrinkDTO;
import DTO.MemberDTO;


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
		
		MemberDTO member = new MemberDTO.Builder("정의섭", "010-3326-0722")
				.setPoint(1000)
				.build();
		
		System.out.println(member.getName());
		System.out.println(member.getPhone());
		System.out.println(member.getPoint());
	}
}
