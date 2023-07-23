package seminar_03;


import java.util.Comparator;
import java.util.List;

public class StreamService {
    
    public void sortStream(List<Stream>streams){
        streams.sort((Comparator<? super Stream>) new StreamComperator());
    }
}
