import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;

public class Main3 {
    public static void main(String[] args) throws Exception {

        BookXmlReader reader = new BookXmlReader();
        Book book = reader.read(new File("excersise.xml"));

        System.out.println("タイトル: " + book.getTitle());
        System.out.println("著者: " + book.getAuthor());
        System.out.println("価格: " + book.getPrice());
    }
}

class BookXmlReader {

    public Book read(File file) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);

        Element bookElement = doc.getDocumentElement();

        String title = getText(bookElement, "title");
        String author = getText(bookElement, "author");
        int price = Integer.parseInt(getText(bookElement, "price"));

        return new Book(title, author, price);
    }

    private String getText(Element parent, String tagName) {
        return parent.getElementsByTagName(tagName)
                .item(0)
                .getTextContent();
    }
}

class Book {
    private final String title;
    private final String author;
    private final int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}