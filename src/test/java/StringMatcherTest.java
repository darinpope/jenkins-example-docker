import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class StringMatcherTest {
  @Test
  public void testMatchOne() {
    String a="hugo";
    String b="HUGO";
    assertThat(a,equalToIgnoringCase(b));
  }
}