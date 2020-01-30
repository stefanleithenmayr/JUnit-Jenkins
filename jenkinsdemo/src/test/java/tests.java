import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Tests {

    @Test
    void t01_test(){
        assertThat("test").isEqualTo("test");
    }

    @Test
    void t02_test_fail(){
        assertThat("test").isEqualTo("test2");
    }
}
