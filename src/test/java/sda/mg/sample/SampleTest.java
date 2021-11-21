package sda.mg.sample;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    private static String sampleValue;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("beforeAllTests");
        sampleValue = "AAA";
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("afterAllTests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach test");
    }

    @Test
    @DisplayName("Metoda testowa numer 1")
    void shouldPrint1() {
        System.out.println("test 1");
        assertEquals(sampleValue, new String("AAA"));
    }

    @Test
    @Disabled
    void shouldPrint2() {
        System.out.println("test 2");
    }

    @Test
    void shouldCompareStringsSample() {
        //given
        String actualValue = "aa";

        //then
//        assertAll(
//                assertNotNull(actualValue),
//                assertEquals(new String("aa"), actualValue)
//        );

        assertNotNull(actualValue);
        assertEquals(new String("aa"), actualValue);
//        assertSame(new String("aa"), actualValue);
    }

    // metoda niewidoczna dla JUnit (ponieważ nie została oznaczona adnotacją @Test)
    void shouldTest() {
        //given
        String actualValue = "ab";

        //then
        assertNotNull(actualValue);
        assertEquals(new String("ab"), actualValue);
    }
}
