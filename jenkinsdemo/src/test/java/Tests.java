import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.Console;

import static org.assertj.core.api.Assertions.assertThat;


public class Tests {

    @Test
    void t01_test(){
        assertThat("test").isEqualTo("test");
    }

    @Test(DisplayName="Test which should fail")
    void t02_test_fail(){
        assertThat("test").isEqualTo("test2");
        System.out.println("Example ouput");
    }
}
