package by.moiseenko;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestResultLoggerExtension implements TestWatcher, AfterAllCallback {
  private static final Logger LOG = LogManager.getLogger(TestResultLoggerExtension.class.getName());

  private List<TestResultStatus> testResultsStatus = new ArrayList<>();
  private enum TestResultStatus{
    SUCCESSFUL, ABORTED, FAILED, DISABLED
  }

  @Override
  public void testDisabled(ExtensionContext context, Optional<String> reason) {
    LOG.info("Test Disabled for test {}: with reason :- {}",
        context.getDisplayName(),
        reason.orElse("No reason"));

    testResultsStatus.add(TestResultStatus.DISABLED);
  }

  @Override
  public void testSuccessful(ExtensionContext context) {
    LOG.info("Test Successful for test {}: ", context.getDisplayName());

    testResultsStatus.add(TestResultStatus.SUCCESSFUL);
  }

  @Override
  public void testAborted(ExtensionContext context, Throwable cause) {
    LOG.info("Test Aborted for test {}: ", context.getDisplayName());

    testResultsStatus.add(TestResultStatus.ABORTED);
  }

  @Override
  public void testFailed(ExtensionContext context, Throwable cause) {
    LOG.info("Test Aborted for test {}: ", context.getDisplayName());

    testResultsStatus.add(TestResultStatus.FAILED);
  }

  @Override
  public void afterAll(ExtensionContext extensionContext) throws Exception {
    Map<TestResultStatus, Long> summary = testResultsStatus.stream().collect(Collectors.groupingBy(
        Function.identity(), Collectors.counting()));
    LOG.info("Test result summary for {} {}", extensionContext.getDisplayName(), summary.toString());
  }
}
