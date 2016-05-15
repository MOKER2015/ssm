import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MOKER on 2016/5/13.
 */
public class AuthoSql {
    public static void main(String[] args) {
        AuthoSql ac=new AuthoSql();
        ac.authSql("generatorConfig.xml");

    }
    public void authSql(String fileName) {
        try {
            List<String> warnings = new ArrayList<String>();
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp
                    .parseConfiguration(this.getClass().getClassLoader().getResourceAsStream(fileName));

            DefaultShellCallback shellCallback = new DefaultShellCallback(true);

            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
            myBatisGenerator.generate(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

