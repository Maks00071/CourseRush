package Module1.Level21.CastomesException;

public enum ErrorCodes {
    FIRST_ERROR(1),
    SECOND_CODE(2),
    THIRD_CODE(3);

    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
