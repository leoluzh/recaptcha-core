package br.gov.mg.fazenda.recaptcha.component.recaptcha;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author leonardo luz fernandes
 * @since 15/03/2015
 * @version 0.1
 * 
 */

public class RecaptchaValidator implements Validator {

	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		//get values from parent component
		Recaptcha recaptcha = (Recaptcha)component;
		String publicKey = recaptcha.getDataPublicKey();
		String privateKey = recaptcha.getDataPrivateKey();
		
		//get values from submit values
		String remoteAddress = context.getExternalContext().getRemoteUser();
		String gRecaptchaResponse = ((HttpServletRequest)context.getExternalContext().getRequest()).getParameter("g-recaptcha-response");
		
		//TODO: Insert code for recaptcha api
		boolean success = false ;
		
		if( !success ){
			//TODO: Insert values ...
			String message  = null ;
			FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,null,message);
			throw new ValidatorException(fm);
		}
		
	}

}
