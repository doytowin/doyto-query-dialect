package win.doyto.query.dialect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * H2DialectTest
 *
 * @author f0rb on 2023/6/10
 * @since 1.0.2
 */
class H2DialectTest {

    @Test
    void buildPageSqlForSelect() {
        H2Dialect dialect = new H2Dialect();
        String pageSql = dialect.buildPageSql("SELECT username, password FROM user WHERE valid = true", 10, 100);
        assertEquals("SELECT username, password FROM user WHERE valid = true LIMIT 10 OFFSET 100", pageSql);
    }

}