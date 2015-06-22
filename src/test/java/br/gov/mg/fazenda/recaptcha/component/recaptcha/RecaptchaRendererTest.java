package br.gov.mg.fazenda.recaptcha.component.recaptcha;

import junit.framework.Test;

import org.apache.shale.test.base.AbstractJsfTestCase;
import org.apache.shale.test.mock.MockRenderKitFactory;
import org.apache.shale.test.mock.MockResponseWriter;

import br.gov.mg.fazenda.recaptcha.component.recaptcha.Recaptcha;
import br.gov.mg.fazenda.recaptcha.component.recaptcha.RecaptchaRenderer;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Class to test the behaviour of the recaptcha renderer
 * 
 * @author leonardo luz fernandes
 * @version 0.1
 * @since 10/03/2015
 * 
 */
public class RecaptchaRendererTest extends AbstractJsfTestCase
{

    public static Test suite()
    {
        return null;
    }

    private MockResponseWriter writer ;
    private Recaptcha recaptcha;

    public RecaptchaRendererTest(String name)
    {
        super(name);
    }

    public void setUp()
    {
        super.setUp();

        recaptcha = new Recaptcha();
        //recaptcha.setGRecaptchaResponse("INVALID-RESPONSE-KEY");
  
        writer = new MockResponseWriter(new StringWriter(), null, null);
        facesContext.setResponseWriter(writer);
        // TODO remove these two lines once shale-test goes alpha, see MYFACES-1155
        facesContext.getViewRoot().setRenderKitId(MockRenderKitFactory.HTML_BASIC_RENDER_KIT);
        facesContext.getRenderKit().addRenderer(
        		recaptcha.getFamily(),
        		recaptcha.getRendererType(),
                new RecaptchaRenderer());
    }

    public void tearDown()
    {
        super.tearDown();
        recaptcha = null;
        writer = null;
    }

    public void testEncodeEnd() throws IOException
    {
    	recaptcha.encodeEnd(facesContext);
        facesContext.renderResponse();

        String output = writer.getWriter().toString();

        assertEquals("TODO", output);
        assertNotSame("TODO", output);
    }

}
