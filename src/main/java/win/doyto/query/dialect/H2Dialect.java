package win.doyto.query.dialect;

import win.doyto.query.core.Dialect;

/**
 * H2Dialect
 *
 * @author f0rb on 2023/6/10
 * @since 0.0.3
 */
public class H2Dialect implements Dialect {
    @Override
    public String buildPageSql(String sql, int limit, long offset) {
        return sql + " LIMIT " + limit + " OFFSET " + offset;
    }
}
