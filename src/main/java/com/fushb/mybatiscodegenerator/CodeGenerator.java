package com.fushb.mybatiscodegenerator;

import org.mybatis.generator.api.ShellRunner;

/**
 * @ClassName CodeGenerator
 * @Description TODO
 * @Author fushb
 * @Date 2022/6/23 14:21
 **/
public class CodeGenerator {
    public static void main(String[] args) {

        String config = CodeGenerator.class.getClassLoader()
                .getResource("generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite" };
        ShellRunner.main(arg);
    }
}
