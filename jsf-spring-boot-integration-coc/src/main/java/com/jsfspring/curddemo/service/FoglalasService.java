package com.jsfspring.curddemo.service;

import com.jsfspring.curddemo.uito.FoglalasUITO;

import java.util.List;

public interface FoglalasService {
    FoglalasUITO doSaveFoglalas(FoglalasUITO foglalasUITO);

    List<FoglalasUITO> doFetchAllFoglalas();

    FoglalasUITO doGetFoglalas(FoglalasUITO foglalasUITO);

    void doDeleteFoglalas(FoglalasUITO foglalasUITO);
}
