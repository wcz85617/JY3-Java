package com.alibaba.tt;

public class Account {
	
	public Account() {
		
		
	}
	public Account(Integer useId, String useName, Double deposit) {
		super();
		this.useId = useId;
		this.useName = useName;
		this.deposit = deposit;
	}
	
	public Integer getUseId() {
		return useId;
	}
	public void setUseId(Integer useId) {
		this.useId = useId;
	}
	public String getUseName() {
		return useName;
	}
	public void setUseName(String useName) {
		this.useName = useName;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	@Override
	public String toString() {
		return "Account [useId=" + useId + ", useName=" + useName + ", deposit=" + deposit + "]";
	}

	private Integer useId;
	private String useName;
	private Double deposit;

}
