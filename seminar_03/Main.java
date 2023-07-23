package seminar_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup("Group 1");
        StudyGroup group2 = new StudyGroup("Group 2");
        StudyGroup group3 = new StudyGroup("Group 3");

        Stream stream_1 = new Stream();
        stream_1.addGroup(group1);
        stream_1.addGroup(group2);

        Stream stream_2 = new Stream();
        stream_2.addGroup(group3);

        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        List<Stream>streams = new ArrayList<>();
        streams.add(stream_1);
        streams.add(stream_2);
        controller.sortStream(streams);

        for(Stream stream : streams){
            System.out.println("stream:     ");

            for(StudyGroup group:stream){
                System.out.println("- " + group.getName());
            }
        }
    }
}
