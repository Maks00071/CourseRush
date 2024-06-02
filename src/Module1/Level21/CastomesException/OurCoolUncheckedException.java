package Module1.Level21.CastomesException;


//мы сделали несколько конструкторов для разных целей.
// Это позволяет нам расширить возможности нашего исключения.
public class OurCoolUncheckedException  extends RuntimeException{

    private Integer errorCode;

    public OurCoolUncheckedException(String message) {
        super(message);
    }

    public OurCoolUncheckedException(Throwable cause) {
        super(cause);
    }

    public OurCoolUncheckedException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public OurCoolUncheckedException(String message, Throwable cause, ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode.getCode();
    }

    public Integer getErrorCode() {
        return errorCode;
    }
}
