package DTO;



public class MemberDTO {
	
	private final String name;
	private final String phone;
	private long point;
	
	private MemberDTO(Builder builder) {
		this.name = builder.name;
		this.phone = builder.phone;
		this.point = builder.point;
		
	}
	
	public static class Builder {
		
		private final String name;
		private final String phone;
		
		private long point = 0;

		
		public Builder(String name, String phone) {
			this.name = name;
			this.phone = phone;
		}
		
		public Builder setPoint(long val) {
			this.point = val;
			return this;
		}
		
		public MemberDTO build() {
			return new MemberDTO(this);
		}
		
	}

	public long getPoint() {
		return point;
	}

	public void setPoint(long point) {
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
}
