/*
package com.jsfspring.curddemo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

@Table(name = "STUD_INFO")
@NamedQuery(name = "StudentDTO.findAll", query = "SELECT a FROM StudentDTO a")
public class StudentDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studId;
	@Column(name = "stud_NAME", nullable = false)
	private String studName;
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	private String address1;
	@Column(name = "EMAIL_ID")
	private String emailId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPT_ID")
	private DepartmentDTO departmentDTO;

	public Long getstudId() {
		return studId;
	}

	public void setstudId(Long studId) {
		this.studId = studId;
	}

	public String getstudName() {
		return studName;
	}

	public void setstudName(String studName) {
		this.studName = studName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public DepartmentDTO getDepartmentDTO() {

		return departmentDTO;
	}

	public void setDepartmentDTO(DepartmentDTO departmentDTO) {
		this.departmentDTO = departmentDTO;
	}

}
*/