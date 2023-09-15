package reader;

import com.google.gson.Gson;
import data.DataModel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.atomic.AtomicReference;

public class ReaderDataFromJason {
    public DataModel readJasonFile() throws FileNotFoundException {
        FileReader fileReader=new FileReader("data/jasonData.jason");
        DataModel dataModel = new Gson().fromJson(fileReader, DataModel.class);
        return dataModel;
    }
}
