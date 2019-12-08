package com.jsfspring.curddemo.service.impl;

import com.jsfspring.curddemo.entity.FoglalasEntity;
import com.jsfspring.curddemo.entity.RepterEntity;
import com.jsfspring.curddemo.repositry.FoglalasRepo;
import com.jsfspring.curddemo.service.FoglalasService;
import com.jsfspring.curddemo.uito.FoglalasUITO;
import com.jsfspring.curddemo.uito.RepterUITO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class FoglalasServiceImpl implements FoglalasService {
    @Autowired
    FoglalasRepo foglalasRepo;

    private void dtoToUito(FoglalasUITO foglalasUiTO, FoglalasEntity dto) {
        BeanUtils.copyProperties(dto, foglalasUiTO);
    }

    private FoglalasEntity UiToToDto(FoglalasUITO foglalasUiTO) {
        FoglalasEntity dto = new FoglalasEntity();
        BeanUtils.copyProperties(foglalasUiTO, dto);
        return dto;
    }

    @Override
    @Transactional(readOnly = false)
    public FoglalasUITO doSaveFoglalas(FoglalasUITO foglalasUITO) {
        FoglalasEntity dto = UiToToDto(foglalasUITO);
        dto = foglalasRepo.save(dto);
        BeanUtils.copyProperties(dto, foglalasUITO);

        dtoToUito(foglalasUITO, dto);
        return foglalasUITO;
    }

    @Override
    public List<FoglalasUITO> doFetchAllFoglalas() {
        List<FoglalasEntity> foglalasEntities = foglalasRepo.findAll();
        List<FoglalasUITO> foglalasUITOS = new ArrayList<>();
        for (FoglalasEntity foglalasEntity: foglalasEntities
        ) {
            FoglalasUITO foglalasUITO = new FoglalasUITO();
            dtoToUito(foglalasUITO, foglalasEntity);
            foglalasUITOS.add(foglalasUITO);
        }
        return foglalasUITOS;
    }

    @Override
    public FoglalasUITO doGetFoglalas(FoglalasUITO foglalasUITO) {
        FoglalasEntity foglalasEntity = foglalasRepo.findFoglalasEntityByJegy(foglalasUITO.getJegy());
        dtoToUito(foglalasUITO, foglalasEntity);
        return foglalasUITO;
    }

    @Override
    @Transactional
    public void doDeleteFoglalas(FoglalasUITO foglalasUITO) {
        foglalasRepo.deleteByJegy(foglalasUITO.getJegy());

    }
}
