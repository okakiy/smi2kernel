package net.smi2.entities.db;

/**
 * @author ask
 */
public class Smi2Entity {
    private int id;
    private String title;
    private String text;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "============================================================================\n" + title + "\"" + author + "\"" + "\n\t" + text;
    }
}
