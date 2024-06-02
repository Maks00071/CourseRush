package Module1.Level21.PrivateException;

public class CreditCardIssue {
    public static void main(String[] args) {
        PhoneNumberRegisterService service = new PhoneNumberRegisterService();

        try {
            service.validatePhone("+1-111-111-11-14");
        } catch (PhoneNumberIsExistException e) {
            // здесь можно сделать запись в логи или вывод стека вызовов
            e.printStackTrace();
        }
    }
}
