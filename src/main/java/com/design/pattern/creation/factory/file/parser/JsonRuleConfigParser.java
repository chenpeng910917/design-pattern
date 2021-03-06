package com.design.pattern.creation.factory.file.parser;

import com.design.pattern.creation.factory.file.annotations.ParserStrategyAnnotation;

/**
 * json文件解析器
 *
 * @author chenpeng
 * @date 2022/2/23
 */
@ParserStrategyAnnotation(fileFormat = FileFormatEnum.JSON)
public class JsonRuleConfigParser implements RuleConfigParser {
    @Override
    public String parser() {
        return "已解析出json数据";
    }
}
