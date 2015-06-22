package br.gov.mg.fazenda.recaptcha.component.recaptcha;

import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

/**
 * The recaptcha component
 * @author leonardo luz fernandes
 * @since 15/03/2015
 * @version 0.1
 * 
 */
public class Recaptcha extends UIOutput
{
    public static final String COMPONENT_TYPE = "br.gov.mg.fazenda.recaptcha.Recaptcha";
    public static final String DEFAULT_RENDERER_TYPE = "br.gov.mg.fazenda.recaptcha.RecaptchaRenderer";
    public static final String COMPONENT_FAMILY = "javax.faces.Output";

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
    
    public Recaptcha(){
        // do nothing
    }

    public String getFamily(){
        return COMPONENT_FAMILY;
    }

    /**
     * Code to maintain the state across requests. 
     * This is handled by the saveState() and restoreState() methods, that save and restore the variable values using an array. 
     * We have to save and restore the state of all the component properties.    
     */
    
    public void restoreState(FacesContext context, Object state) {
        Object values[] = (Object[])state;
        super.restoreState(context, values[0]);
    }

    /**
     * Code to maintain the state across requests. 
     * This is handled by the saveState() and restoreState() methods, that save and restore the variable values using an array. 
     * We have to save and restore the state of all the component properties.    
     */

    public Object saveState(FacesContext context) {
        
    	Object values[] = new Object[15];
        values[0] = super.saveState(context);
        
        //keys
        values[1] = dataPublicKey;
        values[2] = dataPrivateKey;

        //recaptcha tag parameters
        values[3] = dataTheme;
        values[4] = dataType;
        values[5] = dataSize;
        values[6] = dataTabIndex;
        values[7] = dataCallback;
        values[8] = dataExpiredCallback;
        values[9] = dataClass;
        values[10] = dataStyle;
        values[11] = dataIncludeNoScript;
        
        //js parameters
        values[12] = dataOnLoad;
        values[13] = dataRender;
        values[14] = dataLanguage;
      
        //values[15] = gRecaptchaResponse;
        
        return values;
    }


	public String getDataPublicKey() {
		if( this.dataPublicKey != null ){
			return dataPublicKey;			
		}
        ValueBinding vb = getValueBinding("dataPublicKey");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataPublicKey(String dataPublicKey) {
		this.dataPublicKey = dataPublicKey;
	}


	public String getDataPrivateKey() {
		if( this.dataPrivateKey != null ){
			return dataPrivateKey;			
		}
        ValueBinding vb = getValueBinding("dataPrivateKey");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataPrivateKey(String dataPrivateKey) {
		this.dataPrivateKey = dataPrivateKey;
	}


	public String getDataOnLoad() {
		if( this.dataOnLoad != null ){
			return dataOnLoad;			
		}
        ValueBinding vb = getValueBinding("dataOnload");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataOnLoad(String dataOnLoad) {
		this.dataOnLoad = dataOnLoad;
	}


	public String getDataRender() {
		if( this.dataRender != null ){
			return dataRender;			
		}
        ValueBinding vb = getValueBinding("dataRender");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataRender(String dataRender) {
		this.dataRender = dataRender;
	}


	public String getDataLanguage() {
		if( this.dataLanguage != null ){
			return dataLanguage;			
		}
        ValueBinding vb = getValueBinding("dataLanguage");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataLanguage(String dataLanguage) {
		this.dataLanguage = dataLanguage;
	}


	public String getDataTheme() {
		if( this.dataTheme != null ){
			return dataTheme;			
		}
        ValueBinding vb = getValueBinding("dataTheme");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataTheme(String dataTheme) {
		this.dataTheme = dataTheme;
	}


	public String getDataType() {
		if( this.dataType != null ){
			return dataType;			
		}
        ValueBinding vb = getValueBinding("dataType");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataType(String dataType) {
		this.dataType = dataType;
	}


	public String getDataSize() {
		if( this.dataSize != null ){
			return dataSize;			
		}
        ValueBinding vb = getValueBinding("dataSize");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataSize(String dataSize) {
		this.dataSize = dataSize;
	}


	public String getDataTabIndex() {
		if( this.dataTabIndex != null ){
			return dataTabIndex;			
		}
        ValueBinding vb = getValueBinding("dataTabIndex");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataTabIndex(String dataTabIndex) {
		this.dataTabIndex = dataTabIndex;
	}


	public String getDataCallback() {
		if( this.dataCallback != null ){
			return dataCallback;			
		}
        ValueBinding vb = getValueBinding("dataCallback");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataCallback(String dataCallback) {
		this.dataCallback = dataCallback;
	}


	public String getDataExpiredCallback() {
		if( this.dataExpiredCallback != null ){
			return dataExpiredCallback;			
		}
        ValueBinding vb = getValueBinding("dataExpiredCallback");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataExpiredCallback(String dataExpiredCallback) {
		this.dataExpiredCallback = dataExpiredCallback;
	}


	public String getDataClass() {
		if( this.dataClass != null ){
			return dataClass;			
		}
        ValueBinding vb = getValueBinding("dataClass");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataClass(String dataClass) {
		this.dataClass = dataClass;
	}


	public String getDataStyle() {
		if( this.dataStyle != null ){
			return dataStyle;			
		}
        ValueBinding vb = getValueBinding("dataStyle");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataStyle(String dataStyle) {
		this.dataStyle = dataStyle;
	}


	public String getDataIncludeNoScript() {
		if( this.dataIncludeNoScript != null ){
			return dataIncludeNoScript;			
		}
        ValueBinding vb = getValueBinding("dataIncludeNoScript");
        return (vb == null)? null : (String) vb.getValue(FacesContext.getCurrentInstance());		
	}


	public void setDataIncludeNoScript(String dataIncludeNoScript) {		
		this.dataIncludeNoScript = dataIncludeNoScript;
	}

    
}
