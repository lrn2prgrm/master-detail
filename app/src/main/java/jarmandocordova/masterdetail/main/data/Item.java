package jarmandocordova.masterdetail.main.data;

/**
 * A dummy item representing a piece of content.
 */
public class Item {
    public String id = "";
    public String content = "";
    public String details = "";

    public Item(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    public boolean noContentNorDetail() {
        return (content == null || content.equals("")) && (content == null || details.equals(""));
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
