package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    class FakeApi implements ExternalApi {
        public String getData() {
            return "Stubbed Data";
        }
    }

    @Test
    public void testFetchData() {
        ExternalApi stubApi = new FakeApi();
        MyService service = new MyService(stubApi);
        String result = service.fetchData();

        System.out.println("Fetched: " + result);
        assertEquals("Stubbed Data", result);
    }
}
