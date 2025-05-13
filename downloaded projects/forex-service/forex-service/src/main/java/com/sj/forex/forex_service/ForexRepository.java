/**
 * 
 */
package com.sj.forex.forex_service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.forex.forex_service.service.ExchangeValue;

/**
 * @author sange

 *
 */
@Repository
public interface ForexRepository extends JpaRepository<ExchangeValue,Integer>{
     public List<ExchangeValue> getByFrom1(String from1);
}
