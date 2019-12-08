/*
package com.jsfspring.curddemo.uito;

import java.io.Serializable;
public class StudentUITO implements Serializable {

	private static final long serialVersionUID = 4840260415183676656L;
	private Long studId;
	private String studName;
	private String password;
	private String address1;
	private String emailId;
	private DepartmentUITO departmentUITO;

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

	public DepartmentUITO getDepartmentUITO() {
		return departmentUITO;
	}

	public void setDepartmentUITO(DepartmentUITO departmentUITO) {
		this.departmentUITO = departmentUITO;
	}

	@Override
	public String toString() {
		return "StudentUITO [studId=" + studId + ", studName=" + studName + ", password=" + password + ", address1="
				+ address1 + ", emailId=" + emailId + ", departmentUITO=" + departmentUITO + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studName == null) ? 0 : studName.hashCode());
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
		StudentUITO other = (StudentUITO) obj;
		if (studName == null) {
			if (other.studName != null)
				return false;
		} else if (!studName.equals(other.studName))
			return false;
		return true;
	}

}

 */
