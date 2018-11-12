import java.util.ResourceBundle;

/**
 * Created by mtumilowicz on 2018-11-12.
 */
public class CustomException extends RuntimeException {

    ResourceBundle labels = ResourceBundle.getBundle("exceptions");
    
    public CustomException(String message) {
        super(message);
    }

    @Override
    public String getLocalizedMessage() {
        return labels.getString(getMessage());
    }
}
