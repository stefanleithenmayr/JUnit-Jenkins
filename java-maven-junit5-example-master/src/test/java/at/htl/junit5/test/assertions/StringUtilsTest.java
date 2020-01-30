package at.htl.junit5.test.assertions;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * * assertions method and description.
 *
 * +-- 1. Checks that two primitives/objects are equal.
 * +-- void assertEquals(boolean expected, boolean actual)
 *
 * +-- 2. Checks that a condition is true.
 * +-- void assertTrue(boolean condition)
 *
 * +-- 3. Checks that a condition is false.
 * +-- void assertFalse(boolean condition)
 *
 * +-- 4. Checks that an object isn't null.
 * +-- void assertNotNull(Object object)
 *
 * +-- 5. Checks that an object is null.
 * +-- void assertNull(Object object)
 *
 * +-- 6. The assertSame() method tests if two object references point to the same object.
 * +-- void assertSame(object1, object2)
 *
 * +-- 7. The assertNotSame() method tests if two object references do not point to the same object.
 * +-- void assertNotSame(object1, object2)
 *
 * +-- 8. The assertArrayEquals() method will test whether two arrays are equal to each other.
 * +-- void assertArrayEquals(expectedArray, resultArray);
 */
@RunWith(JUnitPlatform.class)
class StringUtilsTest {

    @Test
    void t01_assertNull() {
        // Test case with the age is null
        String age = null;
        Double actual = StringUtils.convertToDouble(age);

        assertNull(actual, "The actual is not null");
        // Java 8 Style
        assertNull(actual, () -> "The actual is not null");
        //AssertJ - Version
        assertThat(actual).isEqualTo(null);
    }

    @Test
    void testConvertToDoubleThrowException() {
        // Test with the age is a non numeric string
        String age = "N/A";
        assertThrows(NumberFormatException.class, () -> {
            StringUtils.convertToDouble(age);
        });

        assertThrows(NumberFormatException.class, () -> {
            StringUtils.convertToDouble(age);
        });
    }

    @Test
    public void testIsNullOrBlank() {
        // Test the case that the input is NULL
        String input = null;

        assertTrue(StringUtils.isNullOrBlank(input));
        // Java 8 Lambdas Style
        assertTrue(StringUtils.isNullOrBlank(input), () -> "The string is not null or blank");

        // Test case with the input is empty
        input = " ";
        assertTrue(StringUtils.isNullOrBlank(input));

        // Test case with the input is not empty
        input = "abc";

        assertFalse(StringUtils.isNullOrBlank(input));

    }

    @Test
    public void testGetDefaultIfNull() {
        // Test case with input string is null
        String str = null;
        String defaultStr = "abc";

        String actual = StringUtils.getDefaultIfNull(str, defaultStr);
        assertSame(defaultStr, actual);
        // Java 8 Lambdas Style
        assertSame(defaultStr, actual, () -> "Expected ouput is not same with actual");

        // Test case with input string is not null
        str = "def";

        actual = StringUtils.getDefaultIfNull(str, defaultStr);
        assertNotSame(defaultStr, actual);
        // Java 8 Lambdas Style
        assertNotSame(defaultStr, actual, () -> "Expected ouput is same with actual");

        // Test case with input string is empty
        str = "";
        actual = StringUtils.getDefaultIfNull(str, defaultStr);
        if (actual.equals(defaultStr)) {
            fail("The actual should be empty");

            // Java 8 Lambdas Style
            fail(() -> "The actual should be empty");
        }
    }

    @Test
    public void testConcatWithRegularInput() {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!";
        String expect = str1 + str2 + str3;
        String actual = StringUtils.concat(str1, str2, str3);
        assertEquals(expect, actual);
    }

    @Test
    public void testConcatWithNullInput() {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = null;
        String expect = str1 + str2;
        String actual = StringUtils.concat(str1, str2, str3);
        assertEquals(expect, actual);
    }
}