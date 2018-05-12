package util;

/**
 * This a util class with methods to matches phone, cpr, email and name
 */
public class Util {

  /**
   * Regex to phone Source:
   * https://www.etl-tools.com/regular-expressions/is-danish-phone-number.html
   */
  private static final String PHONE_REGEX = "(^((\\(?\\+45\\)?)?)(\\s?\\d{2}\\s?\\d{2}\\s?\\d{2}\\s?\\d{2})$)";

  /**
   * Regex to cpr Source: https://www.computerworld.dk/eksperten/spm/917490
   */
  private static final String CPR_REGEX = "^(?:(?:31(?:0[13578]|1[02])|(?:30|29)(?:0[13-9]|1[0-2])|(?:0[1-9]|1[0-9]|2[0-8])(?:0[1-9]|1[0-2]))[0-9]{2}-?[0-9]|290200-?[4-9]|2902(?:(?!00)[02468][048]|[13579][26])-?[0-3])[0-9]{3}|000000-?0000$";

  /**
   * Regex to email Source: http://emailregex.com/
   */
  private static final String EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

  /**
   * Regex to name Source:
   * https://stackoverflow.com/questions/2385701/regular-expression-for-first-and-last-name
   */
  private static final String NAME_REGEX = "^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]+$";

  /**
   * Checks if number is a valid Danish phone number
   *
   * @param number
   * @return true if Danish
   */
  public static boolean isPhone(String number) {
    return number.matches(PHONE_REGEX);
  }

  /**
   * Checks is cpr is a cpr-number
   *
   * @param cpr
   * @return true if a valid cpr-number
   */
  public static boolean isCPR(String cpr) {
    return cpr.matches(CPR_REGEX);
  }

  /**
   * Checks is a email
   *
   * @param email
   * @return true if a valid email
   */
  public static boolean isEmail(String email) {
    return email.matches(EMAIL_REGEX);
  }

  /**
   * Checks is a valid name
   *
   * @param name
   * @return true is valid name
   */
  public static boolean isName(String name) {
    return name.matches(NAME_REGEX);
  }
}
