package com.jsfspring.curddemo.service.impl;

import com.jsfspring.curddemo.entity.RepterEntity;
import com.jsfspring.curddemo.entity.UtasEntity;
import com.jsfspring.curddemo.repositry.RepterRepo;
import com.jsfspring.curddemo.repositry.UtasRepo;
import com.jsfspring.curddemo.service.RepterService;
import com.jsfspring.curddemo.uito.RepterUITO;
import com.jsfspring.curddemo.uito.UtasUITO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RepterServiceImpl implements RepterService {
    @Autowired
    RepterRepo repterRepo;

    private void dtoToUito(RepterUITO repterUITO, RepterEntity dto) {
        BeanUtils.copyProperties(dto, repterUITO);
    }

    private RepterEntity UiToToDto(RepterUITO repterUITO) {
        RepterEntity dto = new RepterEntity();
        BeanUtils.copyProperties(repterUITO, dto);
        return dto;
    }

    @Transactional
    @Override
    public RepterUITO doSaveRepter(RepterUITO repterUITO) {
        RepterEntity dto = UiToToDto(repterUITO);
        dto = repterRepo.save(dto);
        BeanUtils.copyProperties(dto, repterUITO);

        dtoToUito(repterUITO, dto);
        return repterUITO;
    }

    @Override
    public List<RepterUITO> doFetchAllRepter() {
        List<RepterEntity> repterEntities = repterRepo.findAll();
        List<RepterUITO> repterUITOS = new ArrayList<>();
        for (RepterEntity repterEntity: repterEntities
        ) {
            RepterUITO repterUITO = new RepterUITO();
            dtoToUito(repterUITO, repterEntity);
            repterUITOS.add(repterUITO);
        }
        return repterUITOS;
    }

    @Override
    public RepterUITO doGetRepter(RepterUITO repterUITO) {
        RepterEntity repterEntity = repterRepo.findRepterEntityByRepterkod(repterUITO.getRepterkod());
        dtoToUito(repterUITO, repterEntity);
        return repterUITO;
    }

    @Transactional
    @Override
    public void doDeleteRepter(RepterUITO repterUITO) {
        repterRepo.deleteByRepterkod(repterUITO.getRepterkod());
    }
}
