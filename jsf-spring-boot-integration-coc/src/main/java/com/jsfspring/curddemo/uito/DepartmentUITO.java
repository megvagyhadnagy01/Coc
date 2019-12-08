/*
package com.jsfspring.curddemo.uito;

import java.io.Serializable;
import java.util.List;

public class DepartmentUITO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long deptId;
	private String deptName;

	private List<StudentUITO> studentUITOLst;

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

	public List<StudentUITO> getStudentUITOLst() {
		return studentUITOLst;
	}

	public void setStudentUITOLst(List<StudentUITO> studentUITOLst) {
		this.studentUITOLst = studentUITOLst;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
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
		DepartmentUITO other = (DepartmentUITO) obj;
		if (deptId == null) {
			if (other.deptId != null)
				return false;
		} else if (!deptId.equals(other.deptId))
			return false;
		return true;
	}

}

 */
