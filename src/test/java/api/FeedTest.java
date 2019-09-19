package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.Test;

import java.time.Instant;

public class FeedTest {

    @Test
    public void test() throws JsonProcessingException {
        Feed feed = new Feed(
                "Example Feed",
                "http://example.org/",
                Instant.now(),
                new Author("John Doe"),
                "urn:uuid:60a76c80-d399-11d9-b93C-0003939e0af6",
                new Entry(
                        "Atom-Powered Robots Run Amok",
                        "http://example.org/2003/12/13/atom03",
                        "urn:uuid:1225c695-cfb8-4ebb-aaaa-80da344efa6a",
                        Instant.now(),
                        "Some text."));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        System.out.println( objectMapper.writeValueAsString(feed) );
    }
}
