package src.com.streamMethods;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctNosTest {

    @Test
    public void testGetDistinctNumbers() {
        // Arrange: Create a sample input list
        List<Integer> inputList = Arrays.asList(1, 2, 1, 2, 3, 4, 5, 6, 6);

        // Act: Get the distinct numbers using the method
        DistinctNos distinctNos = new DistinctNos();
        List<Integer> distinctList = distinctNos.getDistinctNumbers(inputList);

        // Assert: Verify that the result matches the expected distinct numbers
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(expectedList, distinctList, "The distinct numbers should match the expected list.");
    }
}
