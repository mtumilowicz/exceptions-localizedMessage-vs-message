import java.util.ResourceBundle;

/**
 * Created by mtumilowicz on 2018-11-12.
 */
class CustomException extends RuntimeException {

    private final static ResourceBundle labels = ResourceBundle.getBundle("exceptions");

    CustomException(String message) {
        super(message);
    }

    @Override
    public String getLocalizedMessage() {
        return labels.getString(getMessage());
    }
}
