///**
// *
// */
///**
// * @author s727953
// *
// */
//package com.jsfspring.curddemo.mbean;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//
//import com.jsfspring.curddemo.uito.StudentUITO;
//import org.primefaces.context.RequestContext;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.context.annotation.SessionScope;
//
//import com.jsfspring.curddemo.service.DepartmentService;
//import com.jsfspring.curddemo.service.StudentService;
//import com.jsfspring.curddemo.uito.DepartmentUITO;
//
//@Controller("studController")
//@SessionScope
//public class StudentController {
//	@Autowired
//	private StudentService studentService;
//
//	@Autowired
//	private DepartmentService departmentService;
//
//	private String actionLabel;
//	private StudentUITO empUiTO;
//	private List<StudentUITO> empUiToList;
//
//	private List<DepartmentUITO> departmentUiToList;
//
//	/**
//	 * add or update new Record in DB
//	 *
//	 * @return
//	 */
//	public void doSaveInfoEmpl() {
//		System.out.println(this.getEmpUiTO());
//		studentService.doSaveStud(this.getEmpUiTO());
//		getAllRepter();
//		this.setEmpUiTO(new StudentUITO());
//		RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO,
//				"Employee Details", "Employee Details added/Updated Successfully."));
//
//	}
//
//	/**
//	 * Default load all the Employee info
//	 */
//	@PostConstruct
//	public void getAllRepter() {
//		if (!this.getEmpUiToList().isEmpty()) {
//			this.getEmpUiToList().clear();
//			this.getDepartmentUiToList().clear();
//		}
//		System.out.println(" >>>>>>>>>>>>> " + studentService);
//		this.getEmpUiToList().addAll(studentService.doFetchAllStud());
//		this.getDepartmentUiToList().addAll(departmentService.getAllDepartment());
//		this.setActionLabel("Add");
//	}
//
//	/**
//	 * Remove selected Employee info
//	 *
//	 * @return
//	 */
//
//	public void deleteEmployee(StudentUITO studentUiTO) {
//		studentService.doDeleteStud(studentUiTO);
//		getAllRepter();
//	}
//
//	public void editEmployee(StudentUITO studentUiTO) {
//		this.setActionLabel("Update");
//		BeanUtils.copyProperties(studentUiTO, this.getEmpUiTO());
//		System.out.println(this.getEmpUiTO());
//	}
//
//	public StudentUITO getEmpUiTO() {
//		if (empUiTO == null) {
//			empUiTO = new StudentUITO();
//		}
//		return empUiTO;
//	}
//
//	public void setEmpUiTO(StudentUITO empUiTO) {
//		this.empUiTO = empUiTO;
//	}
//
//	public List<StudentUITO> getEmpUiToList() {
//		if (null == empUiToList) {
//			empUiToList = new ArrayList<>();
//		}
//		return empUiToList;
//	}
//
//	public String getActionLabel() {
//		return actionLabel;
//	}
//
//	public void setActionLabel(String actionLabel) {
//		this.actionLabel = actionLabel;
//	}
//
//	public List<DepartmentUITO> getDepartmentUiToList() {
//		if (departmentUiToList == null) {
//			departmentUiToList = new ArrayList<>();
//		}
//		return departmentUiToList;
//	}
//
//	public void setDepartmentUiToList(List<DepartmentUITO> departmentUiToList) {
//		this.departmentUiToList = departmentUiToList;
//	}
//}