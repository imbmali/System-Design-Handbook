public class SimplePrinter implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scan not supported.");
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("Copy not supported.");
    }
}