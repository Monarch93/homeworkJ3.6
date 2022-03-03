package secondtast;

import org.junit.Test;
import org.example.secondtask.MainSecondTask;

public class MainSecondTaskTestException {
    @Test(expected = RuntimeException.class)
    public void testException() {
        MainSecondTask.doIt(new int[]{1, 3, 7, 5, 2, 3, 8, 2, 1});
    }
}
