package win.doyto.query.dialect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * MySQL8DialectTest
 *
 * @author f0rb on 2021-06-12
 */
class MySQL8DialectTest {
    MySQL8Dialect mySQL8Dialect = new MySQL8Dialect();

    @Test
    void wrapLabel() {
        assertEquals("`rank`", mySQL8Dialect.wrapLabel("rank"));
    }

    @Test
    void shouldNotWrapForNonKeywords() {
        assertEquals("some_name", mySQL8Dialect.wrapLabel("some_name"));
    }
}