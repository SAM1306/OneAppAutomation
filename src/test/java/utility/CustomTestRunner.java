package utility;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class CustomTestRunner extends BlockJUnit4ClassRunner {
    public CustomTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }
    @Override
    public void run (RunNotifier notifier){
        notifier.addListener(new ScreenShotUtility());
        super.run(notifier);
    }
}
