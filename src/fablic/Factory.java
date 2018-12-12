package fablic;

import basis.Document;

public  interface Factory<T extends Document> {
    T createInstance();
}
