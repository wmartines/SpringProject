package br.com.spring.param;

public class ProductParam {

	private String name;

	private Double price;

	private Integer cdProduct;

	private Boolean status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getCdProduct() {
		return cdProduct;
	}

	public void setCdProduct(Integer cdProduct) {
		this.cdProduct = cdProduct;
	}

}
