package br.gov.mg.fazenda.recaptcha.component.recaptcha;

import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.webapp.UIComponentTag;

/**
 * The tag for recaptcha component
 * @author leonardo luz fernandes
 * @version 0.1
 * @since 15/03/2015
 * 
 */
public class RecaptchaTag extends UIComponentTag
{

    //private String gRecaptchaResponse;   
    //tag attributes
    private String dataPublicKey;
    private String dataPrivateKey;
    
    //js parameters
    private String dataOnLoad;
    private String dataRender;
    private String dataLanguage;
    
    //recaptcha tag parameters
    private String dataTheme;
    private String dataType;
    private String dataSize;
    private String dataTabIndex;
    private String dataCallback;
    private String dataExpiredCallback;
    private String dataClass;
    private String dataStyle;
    private String dataIncludeNoScript;

    /**
     * @see javax.faces.webapp.UIComponentTag#getComponentType()
     */
    public String getComponentType(){
        return Recaptcha.COMPONENT_TYPE;
    }

    /**
     * @see javax.faces.webapp.UIComponentTag#getRendererType()
     */
    public String getRendererType(){
        return Recaptcha.DEFAULT_RENDERER_TYPE;
    }

    /**
     * @see javax.faces.webapp.UIComponentTag#setProperties
     */
     protected void setProperties(UIComponent component) {
         
    	 super.setProperties(component);

         FacesContext context = FacesContext.getCurrentInstance();
         Application application = context.getApplication();

         setKeys(component,application);
         setJsParameters(component,application);
         setRecaptchaParameters(component,application);
         
     }
     
    @SuppressWarnings("unchecked") 
    private void setKeys( UIComponent component , Application application ){

        if (UIComponentTag.isValueReference(dataPublicKey))
        {
            component.setValueBinding("dataPublicKey", application.createValueBinding(dataPublicKey));
        }
        else
        {
            component.getAttributes().put("dataPublicKey", dataPublicKey);
        }
        
        if (UIComponentTag.isValueReference(dataPrivateKey))
        {
            component.setValueBinding("dataPrivateKey", application.createValueBinding(dataPrivateKey));
        }
        else
        {
            component.getAttributes().put("dataPrivateKey", dataPublicKey);
        }
    	
    	
    }

    @SuppressWarnings("unchecked")
    private void setJsParameters( UIComponent component , Application application ){
    
        if (UIComponentTag.isValueReference(dataOnLoad)){
            component.setValueBinding("dataOnLoad", application.createValueBinding(dataOnLoad));
        }else{
            component.getAttributes().put("dataOnLoad", dataOnLoad);
        }
    	
        if (UIComponentTag.isValueReference(dataRender)){
            component.setValueBinding("dataRender", application.createValueBinding(dataRender));
        }else{
            component.getAttributes().put("dataRender", dataRender);
        }
        
        if (UIComponentTag.isValueReference(dataLanguage)){
            component.setValueBinding("dataLanguage", application.createValueBinding(dataLanguage));
        }else{
            component.getAttributes().put("dataLanguage", dataLanguage);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    private void setRecaptchaParameters( UIComponent component , Application application ){
        
        if (UIComponentTag.isValueReference(dataTheme))
        {
            component.setValueBinding("dataTheme", application.createValueBinding(dataTheme));
        }
        else
        {
            component.getAttributes().put("dataTheme", dataTheme);
        }
        
        if (UIComponentTag.isValueReference(dataType))
        {
            component.setValueBinding("dataType", application.createValueBinding(dataType));
        }
        else
        {
            component.getAttributes().put("dataType", dataType);
        }

        if (UIComponentTag.isValueReference(dataSize))
        {
            component.setValueBinding("dataSize", application.createValueBinding(dataSize));
        }
        else
        {
            component.getAttributes().put("dataSize", dataSize);
        }
        
        if (UIComponentTag.isValueReference(dataTabIndex))
        {
            component.setValueBinding("dataTabIndex", application.createValueBinding(dataTabIndex));
        }
        else
        {
            component.getAttributes().put("dataTabIndex", dataTabIndex);
        }

        if (UIComponentTag.isValueReference(dataCallback))
        {
            component.setValueBinding("dataCallback", application.createValueBinding(dataCallback));
        }
        else
        {
            component.getAttributes().put("dataCallback", dataCallback);
        }
        
        if (UIComponentTag.isValueReference(dataExpiredCallback))
        {
            component.setValueBinding("dataExpiredCallback", application.createValueBinding(dataExpiredCallback));
        }
        else
        {
            component.getAttributes().put("dataExpiredCallback", dataExpiredCallback);
        }
        
        if (UIComponentTag.isValueReference(dataClass))
        {
            component.setValueBinding("dataClass", application.createValueBinding(dataClass));
        }
        else
        {
            component.getAttributes().put("dataClass", dataClass);
        }
        
        if (UIComponentTag.isValueReference(dataStyle))
        {
            component.setValueBinding("dataStyle", application.createValueBinding(dataStyle));
        }
        else
        {
            component.getAttributes().put("dataStyle", dataStyle);
        }
        
        if (UIComponentTag.isValueReference(dataIncludeNoScript))
        {
            component.setValueBinding("dataIncludeNoScript", application.createValueBinding(dataIncludeNoScript));
        }
        else
        {
            component.getAttributes().put("dataIncludeNoScript", dataIncludeNoScript);
        }
        
    }
    
    public void release() {
        super.release();
        
        this.dataPublicKey = null;
        this.dataPrivateKey = null;
        
        //js parameters
        this.dataOnLoad = null;
        this.dataRender = null;
        this.dataLanguage = null;
        
        //recaptcha tag parameters
        this.dataTheme = null;
        this.dataType = null;
        this.dataSize = null;
        this.dataTabIndex = null;
        this.dataCallback = null;
        this.dataExpiredCallback = null;
        this.dataClass = null;
        this.dataStyle = null;
        this.dataIncludeNoScript = null;
        
    }

	public void setDataPublicKey(String dataPublicKey) {
		this.dataPublicKey = dataPublicKey;
	}

	public void setDataPrivateKey(String dataPrivateKey) {
		this.dataPrivateKey = dataPrivateKey;
	}

	public void setDataOnLoad(String dataOnLoad) {
		this.dataOnLoad = dataOnLoad;
	}

	public void setDataRender(String dataRender) {
		this.dataRender = dataRender;
	}

	public void setDataLanguage(String dataLanguage) {
		this.dataLanguage = dataLanguage;
	}

	public void setDataTheme(String dataTheme) {
		this.dataTheme = dataTheme;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public void setDataSize(String dataSize) {
		this.dataSize = dataSize;
	}

	public void setDataTabIndex(String dataTabIndex) {
		this.dataTabIndex = dataTabIndex;
	}

	public void setDataCallback(String dataCallback) {
		this.dataCallback = dataCallback;
	}

	public void setDataExpiredCallback(String dataExpiredCallback) {
		this.dataExpiredCallback = dataExpiredCallback;
	}

	public void setDataClass(String dataClass) {
		this.dataClass = dataClass;
	}

	public void setDataStyle(String dataStyle) {
		this.dataStyle = dataStyle;
	}

	public void setDataIncludeNoScript(String dataIncludeNoScript) {
		this.dataIncludeNoScript = dataIncludeNoScript;
	}
    
}
