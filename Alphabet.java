public class Alphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "123456789";
    public static final String SYMBOLS = "!@#$%^&*()-_=+\\\\/~?";

    private final StringBuilder pool;

    public Alphabet(boolean uppercaseincluded , boolean lowercaseincluded , boolean numbersincluded , boolean symbolsincluded){
        pool = new StringBuilder();

        if(uppercaseincluded) pool.append(UPPERCASE_LETTERS);
        if(lowercaseincluded) pool.append(LOWERCASE_LETTERS);
        if(numbersincluded) pool.append(NUMBERS);
        if(symbolsincluded) pool.append(SYMBOLS);
    }

    public String getAlphabet(){
        return pool.toString();
    }

}
