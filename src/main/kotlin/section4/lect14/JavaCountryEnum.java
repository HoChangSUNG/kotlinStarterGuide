package section4.lect14;

public enum JavaCountryEnum {

    KOREA("KO"),
    AMERICA("US");

    private final String code;

    JavaCountryEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
