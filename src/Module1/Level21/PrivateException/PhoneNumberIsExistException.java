package Module1.Level21.PrivateException;

//создаем свое исключение
public class PhoneNumberIsExistException extends Exception{

    public PhoneNumberIsExistException(String message) {
        super(message);
    }
}
