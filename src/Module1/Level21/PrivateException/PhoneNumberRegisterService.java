package Module1.Level21.PrivateException;

import java.util.Arrays;
import java.util.List;

public class PhoneNumberRegisterService {
    List<String> registeredPhoneNumbers = Arrays.asList("+1-111-111-11-11", "+1-111-111-11-12", "+1-111-111-11-13", "+1-111-111-11-14");

    public void validatePhone(String phoneNumber) throws PhoneNumberIsExistException{
        if (registeredPhoneNumbers.contains(phoneNumber)) {
            throw new PhoneNumberIsExistException("Указанный номер телефона уже используется другим клиентом!");
        }
    }
}
