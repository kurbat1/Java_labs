package fablic;

import liter.Journal;

import java.util.ArrayList;

public class JournalFactory implements Factory<Journal> {
@Override
public Journal createInstance(){
        return new Journal("",new ArrayList<>(),0);
        }
}
