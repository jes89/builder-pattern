package DTO;

import java.util.Objects;




public class AmericanoDTO extends DrinkDTO {
	

	private final Size size;
	
	private AmericanoDTO(Builder builder) {
		super(builder);
		this.size = builder.size;
	}
	
	public static class Builder extends DrinkDTO.Builder<Builder>{
		
		private final Size size;
		
		public Builder(Size size) {
			super();
			this.size = Objects.requireNonNull(size);
		}
		
		@Override
		public AmericanoDTO build() {
			return new AmericanoDTO(this);
		}
		
		@Override
		protected Builder self() {
			return this;
		}
		
		
	}
	

	public Size getSize() {
		return size;
	}
	
	
}	
