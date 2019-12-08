package com.jsfspring.curddemo.mbean;

import com.jsfspring.curddemo.service.RepterService;
import com.jsfspring.curddemo.service.UtasService;
import com.jsfspring.curddemo.uito.RepterUITO;
import com.jsfspring.curddemo.uito.UtasUITO;
import org.primefaces.context.RequestContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import java.util.ArrayList;
import java.util.List;

@Controller("repterController")
@SessionScope
public class RepterController {
    @Autowired
    private RepterService repterService;

    private RepterUITO repterUITO;

    public String getActionLabel() {
        return actionLabel;
    }

    public void setActionLabel(String actionLabel) {
        this.actionLabel = actionLabel;
    }

    private String actionLabel;

    public List<RepterUITO> getRepterUITOS() {
        if (null == repterUITOS) {
            repterUITOS = new ArrayList<>();
        }
        return repterUITOS;
    }

    public void setRepterUITOS(List<RepterUITO> repterUITOS) {
        this.repterUITOS = repterUITOS;
    }

    private List<RepterUITO> repterUITOS;

    @PostConstruct
    public void getAllRepter() {
        if (!this.getRepterUITOS().isEmpty()) {
            this.getRepterUITOS().clear();
        }
        System.out.println(" >>>>>>>>>>>>> " + repterService);
        this.getRepterUITOS().addAll(repterService.doFetchAllRepter());
        this.setActionLabel("Add");
    }

    public void deleteRepter(RepterUITO repterUITO) {
        repterService.doDeleteRepter(repterUITO);
        getAllRepter();
    }

    public void editRepter(RepterUITO repterUITO) {
        this.setActionLabel("Update");
        BeanUtils.copyProperties(repterUITO, this.getRepterUITO());
        System.out.println(this.getRepterUITO());
    }

    public void doSaveInfoRepter() {
        System.out.println(this.getRepterUITO());
        repterService.doSaveRepter(this.getRepterUITO());
        getAllRepter();
        this.setRepterUITO(new RepterUITO());
        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Repter Details", "Repter Details added/Updated Successfully."));

    }

    public RepterService getRepterService() {
        return repterService;
    }

    public void setRepterService(RepterService repterService) {
        this.repterService = repterService;
    }

    public RepterUITO getRepterUITO() {
        if (repterUITO == null) {
            repterUITO = new RepterUITO();
        }
        return repterUITO;
    }

    public void setRepterUITO(RepterUITO repterUITO) {
        this.repterUITO = repterUITO;
    }
}
