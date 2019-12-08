/*
package com.jsfspring.curddemo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
//

@Table(name = "DEPARTMENT_MASTER")
public class DepartmentDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DEPT_ID")
	private Long deptId;
	@Column(name = "Dept_Name")
	private String deptName;

	@OneToMany(mappedBy = "departmentDTO")
	private List<StudentDTO> employeedtolst;

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<StudentDTO> getEmployeedtolst() {
		if (null == employeedtolst) {
			employeedtolst = new ArrayList<>();
		}
		return employeedtolst;
	}

	public void setEmployeedtolst(List<StudentDTO> employeedtolst) {
		this.employeedtolst = employeedtolst;
	}
}
*/
