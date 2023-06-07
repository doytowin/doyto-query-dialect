package win.doyto.query.dialect;

import java.util.HashSet;
import java.util.Set;

/**
 * MysqlDialect
 *
 * @author f0rb on 2020-04-02
 */
public class MySQL8Dialect extends MySQLDialect {

    private final Set<String> keywords;

    public MySQL8Dialect() {
        keywords = new HashSet<>();
        keywords.add("rank");
    }

    @Override
    public String wrapLabel(String fieldName) {
        return keywords.contains(fieldName) ? "`" + fieldName + "`" : fieldName;
    }
}
