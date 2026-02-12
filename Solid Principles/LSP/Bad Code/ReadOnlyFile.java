public class ReadOnlyFile extends File{
    public void write(){
        throw new UnsupportedOperationException("Can't write to a read only file");
    }
}