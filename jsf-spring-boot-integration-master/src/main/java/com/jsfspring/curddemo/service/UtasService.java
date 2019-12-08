package com.jsfspring.curddemo.service;

import com.jsfspring.curddemo.uito.UtasUITO;

import java.util.List;

public interface UtasService {
    UtasUITO doSaveUtas(UtasUITO utasUITO);

    List<UtasUITO> doFetchAllUtas();

    UtasUITO doGetUtas(UtasUITO utasUITO);

    void doDeleteStud(UtasUITO utasUITO);
}
