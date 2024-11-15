package exceptions;

public class MemberNotFoundException extends RuntimeException {
    private String NIF;
    public MemberNotFoundException(String NIF) {
        this.NIF = NIF;
    }
    public String getNIF() {
        return NIF;
    }
}
