package features;

import basis.Document;

import java.io.*;
import java.util.List;

public class Serialization {

    public static void serialize(Document o, OutputStream out) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(o);
    }

    public static void serialize(List<Document> o, OutputStream out) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(o);

    }

    public static Document deserialize(InputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(in);
        return (Document) objectInputStream.readObject();
    }

    public static List<Document> deserializeArray(InputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(in);
        return (List<Document>) objectInputStream.readObject();
    }
}


