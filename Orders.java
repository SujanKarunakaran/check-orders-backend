package com.sujan.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orders {
	@Id
	private String id;
    private String jewellryName;
    private long price;
    private String customerName;
    private String address;
		    
			public Orders(String id, String jewellryName, long price, String customerName, String address) {
				super();
				this.id = id;
				this.jewellryName = jewellryName;
				this.price = price;
				this.customerName = customerName;
				this.address = address;
			}

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getjewellryName() {
				return jewellryName;
			}

			public void setjewellryName(String jewellryName) {
				this.jewellryName = jewellryName;
			}

			public long getPrice() {
				return price;
			}

			public void setPrice(long price) {
				this.price = price;
			}
			
			public String getcustomerName() {
				return customerName;
			}

			public void setcustomerName(String customerName) {
				this.customerName = customerName;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}
		    

}
