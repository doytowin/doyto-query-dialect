package win.doyto.query.dialect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * HSQLDBDialectTest
 *
 * @author f0rb on 2021-06-12
 */
class HSQLDBDialectTest {

    private HSQLDBDialect hsqldbDialect = new HSQLDBDialect();

    @Test
    void buildPageSqlForSelect() {
        String pageSql = hsqldbDialect.buildPageSql("SELECT username, password FROM user WHERE valid = true", 10, 100);
        assertEquals("SELECT username, password FROM user WHERE valid = true LIMIT 10 OFFSET 100", pageSql);
    }

    @Test
    void buildPageSqlForDelete() {
        String pageSql = hsqldbDialect.buildPageSql("DELETE FROM user WHERE valid = true", 10, 100);
        assertEquals("DELETE FROM user WHERE valid = true LIMIT 10", pageSql);
    }
}