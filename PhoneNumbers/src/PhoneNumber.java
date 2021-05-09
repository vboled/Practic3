public class PhoneNumber {
    private String countryCode;
    private String firstNumbers;
    private String middleNumbers;
    private String lastNumbers;

    PhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 11) {
            if (phoneNumber.charAt(0) != '8')
                throw new IllegalArgumentException("Wrong Russian format(8 doesn't first letter)");
            if (!phoneNumber.matches("\\d+"))
                throw new IllegalArgumentException("Wrong Russian format");
            countryCode = "+7";
            firstNumbers = phoneNumber.substring(1, 4);
            middleNumbers = phoneNumber.substring(4, 7);
            lastNumbers = phoneNumber.substring(7, 11);
        } else if (phoneNumber.length() > 11) {
            int length = phoneNumber.length();
            if (phoneNumber.charAt(0) != '+')
                throw new IllegalArgumentException("Wrong international format(+ doesn't first letter)");
            if (!phoneNumber.substring(1, length).matches("\\d+"))
                throw new IllegalArgumentException("Wrong international format");
            countryCode = phoneNumber.substring(0, length - 10);
            firstNumbers = phoneNumber.substring(length - 10, length - 7);
            middleNumbers = phoneNumber.substring(length - 7, length - 4);
            lastNumbers = phoneNumber.substring(length - 4, length);
        }
    }

    @Override
    public String toString() {
        return countryCode + firstNumbers + "-" + middleNumbers + "-" + lastNumbers;
    }
}
