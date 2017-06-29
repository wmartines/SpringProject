/* ***********************************
 * Entity Generator
 * Automatic generated class
 * 20/10/2016 21:03
 * ***********************************/
package br.com.spring.entity.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 * Primary key table representation <code>INVOICE</code><br>
 * Lista nota fiscal
 * 
 * @author martini_rodrigo
 */
@Embeddable
public class UserId {

	
	/**
	 * CAMPO: NU_INVOICE, TIPO: NUMBER, COMMENT: Order identification
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name = "CD_USER")
	private java.lang.Integer cdUser;

	public java.lang.Integer getCdUser() {
		return cdUser;
	}

	public void setCdUser(java.lang.Integer cdUser) {
		this.cdUser = cdUser;
	}

	

}