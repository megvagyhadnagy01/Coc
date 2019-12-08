/*
package com.jsfspring.curddemo.service.impl;

import com.jsfspring.curddemo.entity.DepartmentDTO;
import com.jsfspring.curddemo.repositry.DepartmentRepo;
import com.jsfspring.curddemo.service.DepartmentService;
import com.jsfspring.curddemo.uito.DepartmentUITO;
import com.jsfspring.curddemo.uito.StudentUITO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public List<DepartmentUITO> getAllDepartment() {
        List<DepartmentUITO> departmentUITOLst = new ArrayList<>();
        List<DepartmentDTO> departmentDTOLst = departmentRepo.findAll();

        departmentDTOLst.forEach(x -> x.getEmployeedtolst().forEach(y -> System.out.println(y.getstudName())));

        departmentDTOLst.forEach(dto -> {
            DepartmentUITO tmpUiTO = new DepartmentUITO();
            tmpUiTO.setStudentUITOLst(new ArrayList<>());

            dto.getEmployeedtolst().forEach(y -> {
                StudentUITO emp = new StudentUITO();
                BeanUtils.copyProperties(y, emp);
                tmpUiTO.getStudentUITOLst().add(emp);
            });

            BeanUtils.copyProperties(dto, tmpUiTO);
            departmentUITOLst.add(tmpUiTO);
        });

        return departmentUITOLst;
    }

    @Override
    public DepartmentUITO getDepartment(DepartmentUITO departmentUITO) {
        System.out.println(">>>>> " + departmentUITO.getDeptName());
        DepartmentDTO dto = departmentRepo.findTitleByDeptName(departmentUITO.getDeptName());
        DepartmentUITO uito = new DepartmentUITO();

        BeanUtils.copyProperties(dto, uito);
        return uito;
    }
}

 */