package com.jsfspring.curddemo.mbean;

import com.jsfspring.curddemo.service.UtasService;
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

@Controller("utasController")
@SessionScope
public class UtasController {
    @Autowired
    private UtasService utasService;

    private UtasUITO utasUITO;

    public String getActionLabel() {
        return actionLabel;
    }

    public void setActionLabel(String actionLabel) {
        this.actionLabel = actionLabel;
    }

    private String actionLabel;

    public List<UtasUITO> getUtasUITOS() {
        if (null == utasUITOS) {
            utasUITOS = new ArrayList<>();
        }
        return utasUITOS;
    }

    public void setUtasUITOS(List<UtasUITO> utasUITOS) {
        this.utasUITOS = utasUITOS;
    }

    private List<UtasUITO> utasUITOS;

    @PostConstruct
    public void getAllUtas() {
        if (!this.getUtasUITOS().isEmpty()) {
            this.getUtasUITOS().clear();
        }
        System.out.println(" >>>>>>>>>>>>> " + utasService);
        this.getUtasUITOS().addAll(utasService.doFetchAllUtas());
        this.setActionLabel("Add");
    }

    	public void deleteUtas(UtasUITO utasUITO) {
		utasService.doDeleteStud(utasUITO);
		getAllUtas();
	}

	public void editUtas(UtasUITO utasUITO) {
		this.setActionLabel("Update");
		BeanUtils.copyProperties(utasUITO, this.getUtasUITO());
		System.out.println(this.getUtasUITO());
	}

    	public void doSaveInfoUtas() {
		System.out.println(this.getUtasUITO());
		utasService.doSaveUtas(this.getUtasUITO());
		getAllUtas();
		this.setUtasUITO(new UtasUITO());
		RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Utas Details", "Utas Details added/Updated Successfully."));

	}

    public UtasService getUtasService() {
        return utasService;
    }

    public void setUtasService(UtasService utasService) {
        this.utasService = utasService;
    }

    public UtasUITO getUtasUITO() {
        if (utasUITO == null) {
            utasUITO = new UtasUITO();
        }
        return utasUITO;
    }

    public void setUtasUITO(UtasUITO utasUITO) {
        this.utasUITO = utasUITO;
    }
}
