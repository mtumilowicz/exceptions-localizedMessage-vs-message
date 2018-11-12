import org.junit.Test;

import java.util.Locale;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mtumilowicz on 2018-11-12.
 */
public class ExceptionMessageTest {

    @Test
    public void message() {
        CustomException test = new CustomException("test.message");

        assertThat(test.getMessage(), is("test.message"));
    }
    
    @Test
    public void localizedMessage_fr() {
        Locale.setDefault(Locale.FRANCE);
        
        CustomException test = new CustomException("test.message");
        
        assertThat(test.getLocalizedMessage(), is("La nouvelle en francaise"));
    }

    @Test
    public void localizedMessage_en() {
        Locale.setDefault(Locale.US);

        CustomException test = new CustomException("test.message");

        assertThat(test.getLocalizedMessage(), is("Message in English"));
    }
}
