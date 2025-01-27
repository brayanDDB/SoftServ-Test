import org.bguerrero.springcloud.msvc.StringProcessor;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class StringProcessorTest {

    private StringProcessor stringProcessor = new StringProcessor();

    @Test
    public void test() {
        assertThat(stringProcessor.process("AABBCCD112233")).isEqualTo("ABCD123");
        assertThat(stringProcessor.process("AAAAABBCCDD")).isEqualTo("ABCD");
        assertThat(stringProcessor.process("1233433456")).isEqualTo("123456");
        assertThat(stringProcessor.process("111")).isEqualTo("1");
        assertThat(stringProcessor.process("2")).isEqualTo("2");
        assertThat(stringProcessor.process("12313434AAGCC")).isEqualTo("1234AGC");
    }

}
