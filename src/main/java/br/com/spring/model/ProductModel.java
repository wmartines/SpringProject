package br.com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

/**
 * @author as
 *
 */
@Entity
@Table(name = "PRODUTO")
public class ProductModel extends SerializableSerializer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3064856030784367751L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CD_PRODUTO")
	private Integer cdProduct;

	@Column(name = "NOME")
	private String name;

	@Column(name = "PRECO")
	private Double price;

	@Column(name = "ACTIVE")
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
