// Document class (provides content to be printed)
class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// Printer class (depends on Document to print)
class Printer {
    public void print(Document doc) {
        System.out.println("Printing document: " + doc.getContent());
    }
}

// Main class demonstrating Dependency relationship
public class DependencyExample {
    public static void main(String[] args) {
        Document doc = new Document("Dependency Example Document");
        Printer printer = new Printer();

        // Printer depends on Document to print its content
        printer.print(doc); // Output: Printing document: Dependency Example Document
    }
}