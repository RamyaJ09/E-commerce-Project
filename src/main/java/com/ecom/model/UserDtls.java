package com.ecom.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class UserDtls {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String mobileNumber;
	
	private String email;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String pincode;
	
	private String password;
	
	private String profileImage;
	
	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getMobileNumber() {
	    return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
	    this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}

	public String getAddress() {
	    return address;
	}

	public void setAddress(String address) {
	    this.address = address;
	}

	public String getCity() {
	    return city;
	}

	public void setCity(String city) {
	    this.city = city;
	}

	public String getState() {
	    return state;
	}

	public void setState(String state) {
	    this.state = state;
	}

	public String getPincode() {
	    return pincode;
	}

	public void setPincode(String pincode) {
	    this.pincode = pincode;
	}

	public String getPassword() {
	    return password;
	}

	public void setPassword(String password) {
	    this.password = password;
	}

	public String getProfileImage() {
	    return profileImage;
	}

	public void setProfileImage(String profileImage) {
	    this.profileImage = profileImage;
	}
	
	private String role; // Should be set to "ROLE_USER" or "ROLE_ADMIN"

	public String getRole() {
	    return role;
	}

	public void setRole(String role) {
	    this.role = role;
	}
	
	@Column(name = "is_enable")
	private Boolean isEnable;

	
	public boolean isEnable() {
	    return isEnable;
	}

	public void setEnable(boolean isEnable) {
	    this.isEnable = isEnable;
	}

	public boolean getIsEnable() {
	    return isEnable;
	}

	public void setIsEnable(Boolean status) {
	    this.isEnable = status;
	}
	
	public Integer getId() {
	    return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}
	
    private Boolean accountNonLocked;

    private Integer failedAttempt;

    private Date lockTime;
    
    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public Integer getFailedAttempt() {
        return failedAttempt;
    }

    public void setFailedAttempt(Integer failedAttempt) {
        this.failedAttempt = failedAttempt;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    private String resetToken;

    // Getter for resetToken
    public String getResetToken() {
        return resetToken;
    }

    // Setter for resetToken
    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }
    


}
