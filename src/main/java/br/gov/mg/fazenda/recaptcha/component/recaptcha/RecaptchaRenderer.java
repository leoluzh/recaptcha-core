package br.gov.mg.fazenda.recaptcha.component.recaptcha;

import javax.faces.render.Renderer;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.component.UIComponent;
import java.io.IOException;

/**
 * The renderer for recaptcha component
 * 
 * @author leonardo luz fernandes
 * @since 15/03/2015
 * @version 0.1
 * 
 */
public class RecaptchaRenderer extends Renderer
{

    public void decode(FacesContext facesContext, UIComponent uiComponent)
    {
        super.decode(facesContext, uiComponent);
        // nothing to decode
    }

    public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException
    {
        super.encodeBegin(facesContext, uiComponent);
        // no need to use encodeBegin.
    }

    public void encodeChildren(FacesContext facesContext, UIComponent uiComponent) throws IOException
    {
        super.encodeChildren(facesContext, uiComponent);
        // this component does not have children
    }

    public void encodeEnd(FacesContext facesContext, UIComponent uiComponent) throws IOException
    {
        super.encodeEnd(facesContext, uiComponent);

        if (!uiComponent.isRendered())
        {
            return;
        }

        ResponseWriter writer = facesContext.getResponseWriter();

        Recaptcha recaptcha = (Recaptcha) uiComponent;
        //TODO: Configure recaptcha instance here ... passing value parameters
        
        String id = recaptcha.getId();
        
        String html = null;
        String js = null;

        writer.write(html);
        writer.write(js);
        
    }
}
