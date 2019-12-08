package com.jsfspring.curddemo.service;

import com.jsfspring.curddemo.uito.RepterUITO;

import java.util.List;

public interface RepterService {
    RepterUITO doSaveRepter(RepterUITO repterUITO);

    List<RepterUITO> doFetchAllRepter();

    RepterUITO doGetRepter(RepterUITO repterUITO);

    void doDeleteRepter(RepterUITO repterUITO);
}
