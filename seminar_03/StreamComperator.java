package seminar_03;

public class StreamComperator {
    public int compare(Stream stream_1, Stream stream_2){
        int countGroup_1 = stream_1.count();
        int countGroup_2 = stream_2.count();

        return Integer.compare(countGroup_1, countGroup_2);
    }
}
