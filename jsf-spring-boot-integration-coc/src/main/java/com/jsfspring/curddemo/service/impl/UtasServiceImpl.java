package com.jsfspring.curddemo.service.impl;

import com.jsfspring.curddemo.entity.UtasEntity;
import com.jsfspring.curddemo.repositry.UtasRepo;
import com.jsfspring.curddemo.service.UtasService;
import com.jsfspring.curddemo.uito.UtasUITO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UtasServiceImpl implements UtasService {
    @Autowired
    UtasRepo utasRepo;

    private void dtoToUito(UtasUITO utasUITO, UtasEntity dto) {
        BeanUtils.copyProperties(dto, utasUITO);
    }

    private UtasEntity UiToToDto(UtasUITO utasUITO) {
        UtasEntity dto = new UtasEntity();
        BeanUtils.copyProperties(utasUITO, dto);
        return dto;
    }

    @Transactional
    @Override
    public UtasUITO doSaveUtas(UtasUITO utasUITO) {
        UtasEntity dto = UiToToDto(utasUITO);
        dto = utasRepo.save(dto);
        BeanUtils.copyProperties(dto, utasUITO);

        dtoToUito(utasUITO, dto);
        return utasUITO;
    }

    @Override
    public List<UtasUITO> doFetchAllUtas() {
        List<UtasEntity> utasEntities = utasRepo.findAll();
        List<UtasUITO> utasUITOS = new ArrayList<>();
        for (UtasEntity utasEntity: utasEntities
             ) {
            UtasUITO utasUITO = new UtasUITO();
            dtoToUito(utasUITO, utasEntity);
            utasUITOS.add(utasUITO);
        }
        return utasUITOS;
    }

    @Override
    public UtasUITO doGetUtas(UtasUITO utasUITO) {
        UtasEntity utasEntity = utasRepo.findById(utasUITO.getUtasAzon()).get();
        dtoToUito(utasUITO, utasEntity);
        return utasUITO;
    }

    @Transactional
    @Override
    public void doDeleteStud(UtasUITO utasUITO) {
        utasRepo.deleteById(utasUITO.getUtasAzon());
    }
}
