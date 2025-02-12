package com.ecom.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private UserDtls user;
	
	@ManyToOne
	private Product product;
	
	private Integer quantity;
	
	@Transient
	private Double totalPrice;
	
	 public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    // Getter and Setter for 'user'
	    public UserDtls getUser() {
	        return user;
	    }

	    public void setUser(UserDtls user) {
	        this.user = user;
	    }

	    // Getter and Setter for 'product'
	    public Product getProduct() {
	        return product;
	    }

	    public void setProduct(Product product) {
	        this.product = product;
	    }

	    // Getter and Setter for 'quantity'
	    public Integer getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(Integer quantity) {
	        this.quantity = quantity;
	    }
	    
	    // Getter for 'totalPrice'
	    public Double getTotalPrice() {
	        return totalPrice;
	    }

	    // Setter for 'totalPrice'
	    public void setTotalPrice(Double totalPrice) {
	        this.totalPrice = totalPrice;
	    }
	    
	    @Transient
	    private Double totalOrderPrice;
	    
	    // Getter
	    public Double getTotalOrderPrice() {
	        return totalOrderPrice;
	    }

	    // Setter
	    public void setTotalOrderPrice(Double totalOrderPrice) {
	        this.totalOrderPrice = totalOrderPrice;
	    }
}
