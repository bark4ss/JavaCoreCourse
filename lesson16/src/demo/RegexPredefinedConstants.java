package demo;

public enum RegexPredefinedConstants {
    NUMBER("\\d"), //[0-9]
    NOT_NUMBER("\\D"), //[^0-9]
    SPACE("\\s"), //[ \t\n\x0B\f\r]
    NOT_SPACE("\\S"),//[^\s]
    WORD_SYMBOL("\\w"),//[a-zA-Z_0-9]
    NOT_WORD_SYMBOL("\\W");//[^\w]

    private String regex;

    RegexPredefinedConstants(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }
}
