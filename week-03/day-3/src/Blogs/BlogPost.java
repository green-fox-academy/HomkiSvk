package Blogs;

public class BlogPost {

    private String authorName;
    private String title;
    private String text;
    private String publicationDate;

    BlogPost(String authorName, String title, String publicationDate, String text) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Author name: " + authorName + "\n" + "Title: " + title + "\n" +
                "Text: " + text + "\n" + "Publication date: " + publicationDate + "\n";
    }

}
