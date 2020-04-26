package DTO;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;


public abstract class  DrinkDTO {
	
	public enum Size { SMALL, MEDIUM, LARGE }
	public enum Addition { MILK, WHIPPING, NO_MILK, SUGAR, SYRUP }
	private final int calories;
	private final int quantity;
	
	final Set<Addition> additions;
	
	protected DrinkDTO(Builder<?> builder) {
		this.quantity = builder.quantity;
		this.calories = builder.calories;
		this.additions = builder.additions.clone();
	}
	
	abstract static class Builder<T extends Builder<T>> {
		
		private int calories;
		private int quantity;
		
		EnumSet<Addition> additions = EnumSet.noneOf(Addition.class);
		
		public Builder() {

		}
		
		public T addAdditions(Addition addition) {
			this.additions.add(Objects.requireNonNull(addition));
			return self();
		}
		
		public T setCalories(int calories) {
			this.calories = calories;
			return self();
		}
		
		public T setQuantity(int quantity) {
			this.quantity = quantity;
			return self();
		}
		
		abstract DrinkDTO build();
		protected abstract T self();
		
	}

	public int getCalories() {
		return calories;
	}

	public int getQuantity() {
		return quantity;
	}

	public Set<Addition> getAdditions() {
		return additions;
	}
	
}
