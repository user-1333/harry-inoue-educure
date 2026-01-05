import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;

public class Main3 {
    public static void main(String[] args) throws Exception {

        // XMLパーサ生成
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File("excersise.xml"));

        Element book = doc.getDocumentElement();

        // 各要素取得
        String title = book.getElementsByTagName("title").item(0).getTextContent();
        String author = book.getElementsByTagName("author").item(0).getTextContent();
        int price = Integer.parseInt(
                book.getElementsByTagName("price").item(0).getTextContent()
        );

        // 出力
        System.out.println("タイトル: " + title);
        System.out.println("著者: " + author);
        System.out.println("価格: " + price);
    }
}
