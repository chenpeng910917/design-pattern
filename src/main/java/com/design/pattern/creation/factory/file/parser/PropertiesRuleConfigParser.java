package com.design.pattern.creation.factory.file.parser;

/**
 * properties文件解析器
 *
 * @author chenpeng
 * @date 2022/2/23
 */
public class PropertiesRuleConfigParser implements RuleConfigParser {
    @Override
    public String parser() {
        return "已解析出properties数据";
    }
}
