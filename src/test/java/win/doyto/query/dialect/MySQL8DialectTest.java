package win.doyto.query.dialect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * MySQL8DialectTest
 *
 * @author f0rb on 2021-06-12
 */
class MySQL8DialectTest {

    @Test
    void wrapLabel() {
        MySQL8Dialect mySQL8Dialect = new MySQL8Dialect();
        assertEquals("`rank`", mySQL8Dialect.wrapLabel("rank"));
    }
}