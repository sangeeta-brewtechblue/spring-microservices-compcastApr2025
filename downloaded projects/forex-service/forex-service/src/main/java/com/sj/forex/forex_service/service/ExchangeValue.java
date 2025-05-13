/**
 * 
 */
package com.sj.forex.forex_service.service;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author sange
 *
 */
@Entity
public class ExchangeValue {
	
	@Id
	private long id;
	
	@Column(name="_from1")
	private String from1;
	
	private String to1;
	
	private BigDecimal conversionMultiple;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conversionMultiple == null) ? 0 : conversionMultiple.hashCode());
		result = prime * result + ((from1 == null) ? 0 : from1.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((to1 == null) ? 0 : to1.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExchangeValue other = (ExchangeValue) obj;
		if (conversionMultiple == null) {
			if (other.conversionMultiple != null)
				return false;
		} else if (!conversionMultiple.equals(other.conversionMultiple))
			return false;
		if (from1 == null) {
			if (other.from1 != null)
				return false;
		} else if (!from1.equals(other.from1))
			return false;
		if (id != other.id)
			return false;
		if (to1 == null) {
			if (other.to1 != null)
				return false;
		} else if (!to1.equals(other.to1))
			return false;
		return true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom1() {
		return from1;
	}

	public void setFrom1(String from1) {
		this.from1 = from1;
	}

	public String getTo1() {
		return to1;
	}

	public void setTo1(String to1) {
		this.to1 = to1;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	

}
