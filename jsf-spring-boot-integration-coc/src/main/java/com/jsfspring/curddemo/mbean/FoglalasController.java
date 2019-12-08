package com.jsfspring.curddemo.mbean;

import com.jsfspring.curddemo.service.FoglalasService;
import com.jsfspring.curddemo.uito.FoglalasUITO;
import org.primefaces.context.RequestContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import java.util.ArrayList;
import java.util.List;

@Controller("foglalasController")
@SessionScope
public class FoglalasController {

    @Autowired
    private FoglalasService foglalasService;

    private FoglalasUITO foglalasUITO;

    public String getActionLabel() {
        return actionLabel;
    }

    public void setActionLabel(String actionLabel) {
        this.actionLabel = actionLabel;
    }

    private String actionLabel;

    public List<FoglalasUITO> getFoglalasUITOS() {
        if (null == foglalasUITOS) {
            foglalasUITOS = new ArrayList<>();
        }
        return foglalasUITOS;
    }

    public void setFoglalasUITOS(List<FoglalasUITO> foglalasUITOS) {
        this.foglalasUITOS = foglalasUITOS;
    }

    private List<FoglalasUITO> foglalasUITOS;

    @PostConstruct
    public void getAllFoglalas() {
        if (!this.getFoglalasUITOS().isEmpty()) {
            this.getFoglalasUITOS().clear();
        }
        System.out.println(" >>>>>>>>>>>>> " + foglalasService);
        this.getFoglalasUITOS().addAll(foglalasService.doFetchAllFoglalas());
        this.setActionLabel("Foglal");
    }

    public void deleteFoglalas(FoglalasUITO foglalasUITO) {
        foglalasService.doDeleteFoglalas(foglalasUITO);
        getAllFoglalas();
    }

    public void editFoglalas(FoglalasUITO foglalasUITO) {
        this.setActionLabel("Módosít");
        BeanUtils.copyProperties(foglalasUITO, this.getFoglalasUITO());
        System.out.println(this.getFoglalasUITO());
    }

    public void doSaveInfoFoglalas() {
        System.out.println(this.getFoglalasUITO());
        foglalasService.doSaveFoglalas(this.getFoglalasUITO());
        getAllFoglalas();
        this.setFoglalasUITO(new FoglalasUITO());
        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Foglalas Details", "Foglalas Details added/Updated Successfully."));

    }

    public FoglalasService getFoglalasService() {
        return foglalasService;
    }

    public void setFoglalasService(FoglalasService foglalasService) {
        this.foglalasService = foglalasService;
    }

    public FoglalasUITO getFoglalasUITO() {
        if (foglalasUITO == null) {
            foglalasUITO = new FoglalasUITO();
        }
        return foglalasUITO;
    }

    public void setFoglalasUITO(FoglalasUITO foglalasUITO) {
        this.foglalasUITO = foglalasUITO;
    }
}

