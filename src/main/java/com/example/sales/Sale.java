package com.example.sales;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.CreationTimestamp;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

//here java objects are mapped to the db
@Entity
@Table(name= "iphone_sales")
public class Sale{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	@Size(max=100)
	private String customerName;
	
	@Column(name = "phone_model")
	@NotBlank
	@Size(max=50)
	private String phoneModel;
	
	@NotBlank
	@Size(max=30)
	private String color;
	
	@Column(name = "storage_gb")
	@NotNull
	@Positive
	private Integer storageGB;
	
	@NotNull
	@Positive
	private BigDecimal price;
	
	@NotNull
	private LocalDate saleDate;
	
	@NotBlank
	@Size(max=100)
	private String storeLocation;
	
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDateTime createdAt;
	
//	Getter Setter for fields 
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id=id; }
	
	public String getCustomerName() {return customerName; }
	public void setCustomerName(String customerName) {this.customerName=customerName;}
	
	public String getPhoneModel() {return phoneModel; }
	public void setIphoneModel(String phoneModel) { this.phoneModel=phoneModel;}
	
	public String getColor() {return color; }
	public void setColor(String color) {this.color=color;}
    
	public Integer getStorageGB() { return storageGB; }
	public void setStorageGB(Integer storageGB) {this.storageGB = storageGB;}

	public BigDecimal getPrice() {return price;}
	public void setPrice(BigDecimal price) {this.price = price;}

	public LocalDate getSaleDate() { return saleDate;}
	public void setSaleDate(LocalDate saleDate) {this.saleDate = saleDate;}

	public String getStoreLocation() { return storeLocation;}
	public void setStoreLocation(String storeLocation) {this.storeLocation = storeLocation;}

	public LocalDateTime getCreatedAt() {return createdAt;}
}
	
	
           


	

