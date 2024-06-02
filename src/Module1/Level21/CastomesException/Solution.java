package Module1.Level21.CastomesException;

public class Solution {
    public static void main(String[] args) throws Exception {
        OurCoolUncheckedException exception = getException(3);
        System.out.println("getException().getErrorCode() = " + exception.getErrorCode());
        throw exception;
    }

    public static OurCoolUncheckedException getException(int errorCode) {
        return switch (errorCode) {
            case 1:
                yield new OurCoolUncheckedException(
                        "Наше крутое исключение! Мы получили ошибку: " +
                                ErrorCodes.FIRST_ERROR.getCode(),
                        new Throwable(),
                        ErrorCodes.FIRST_ERROR
                );
            case 2:
                yield new OurCoolUncheckedException(
                        "Наше крутое исключение! Мы получили ошибку: " +
                                ErrorCodes.SECOND_CODE.getCode(),
                        new Throwable(),
                        ErrorCodes.SECOND_CODE
                );
                // здесь мы подхватим тройку и все остальные коды, которые мы еще не добавили
            default:
                yield new OurCoolUncheckedException(
                        "Наше крутое исключение! Мы получили ошибку: " +
                                ErrorCodes.THIRD_CODE.getCode(),
                        new Throwable(),
                        ErrorCodes.THIRD_CODE
                );
        };
    }
}
