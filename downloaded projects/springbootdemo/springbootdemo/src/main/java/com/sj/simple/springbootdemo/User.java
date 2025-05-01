/**
 * 
 */
package com.sj.simple.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author sangeeta
 *
 */

@Component(value="user1")
public class User {
    @Value("1")
	int id;
    @Value("actUser")
    String name;
    @Autowired 
    @Qualifier("account2")
    Account account;
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((account == null) ? 0 : account.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (account == null) {
		if (other.account != null)
			return false;
	} else if (!account.equals(other.account))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public User(int id, String name, Account account) {
	super();
	this.id = id;
	this.name = name;
	this.account = account;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
   
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", account=" + account + "]";
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the account
 */
public Account getAccount() {
	return account;
}
/**
 * @param account the account to set
 */

public void setAccount(Account account) {
	this.account = account;
}

  public void withdrawFromAccount(int amount) {
	  account.withdraw(amount);
  }




}
