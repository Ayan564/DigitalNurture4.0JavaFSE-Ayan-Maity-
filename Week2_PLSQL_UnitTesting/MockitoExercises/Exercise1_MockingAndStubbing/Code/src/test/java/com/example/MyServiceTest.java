import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject into service
        MyService service = new MyService(mockApi);

        // Step 4: Call and assert
        String result = service.fetchData();
        System.out.println("Fetched: " + result); // ✅ visible in Replit
        assertEquals("Mock Data", result);
    }
}
