package com.infodashboard.associate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "associaterecords")
public class AssociateRecords implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "employee_id")
	@NotNull
	private String employeeId;

	@Column(name = "employee_name")
	@NotNull
	private String employeename;

	@Column(name = "ldap_id")
	@NotNull
	private String ldapid;

	@Column(name = "contact_number")
	@NotNull
	private String contactnumber;

	@Column(name = "primary_skill")
	private String primaryskill;

	@Column(name = "secondary_skill")
	private String secondaryskill;

	public AssociateRecords() {
	}

	public Long getid() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getLdapid() {
		return ldapid;
	}

	public void setLdapid(String ldapid) {
		this.ldapid = ldapid;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getPrimaryskill() {
		return primaryskill;
	}

	public void setPrimaryskill(String primaryskill) {
		this.primaryskill = primaryskill;
	}

	public String getSecondaryskill() {
		return secondaryskill;
	}

	public void setSecondaryskill(String secondaryskill) {
		this.secondaryskill = secondaryskill;
	}

}
