/**
 * 
 */
package com.sj.forex.forex_service.service;

import java.math.BigDecimal;

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
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionMultiple;
	
	

}
