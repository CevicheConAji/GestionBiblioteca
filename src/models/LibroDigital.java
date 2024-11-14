package models;

public class LibroDigital extends Libro{
    private int views;

    public LibroDigital(String ISBN, String titulo, String autor, int views) {
        super(ISBN, titulo, autor);
        this.views = views;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return super.toString()+" " +this.getClass().getName() +
                " views=" + views +
                '}';
    }
}
