package com.najim.rabbit.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import java.util.Arrays;


/**
 * 代码生成器，填写好jdbc的URL、userName、password后，直接运行run方法则可以直接生成
 */
public class FastGenerator {
    /**
     * 执行 run
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rabbit?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC";
        String username = "root";
        String password = "123456";
        DataSourceConfig.Builder dataSourceConfig = new DataSourceConfig
                .Builder(url, username, password);
        FastAutoGenerator.create(dataSourceConfig)
                // 全局配置
                .globalConfig((scanner, builder) -> builder.author(scanner.apply("请输入作者名称？")).fileOverride())
                // 包配置
                .packageConfig((scanner, builder) -> builder.parent(scanner.apply("请输入包名？")))
                // 策略配置,表配置

                .strategyConfig((scanner, builder) -> {
                    String[] tables = scanner.apply("请输入需要生成的表名，英文逗号分割").split(",");
                    builder.addInclude(Arrays.asList(tables));
                })
                /*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                 */
                .execute();
    }
}
