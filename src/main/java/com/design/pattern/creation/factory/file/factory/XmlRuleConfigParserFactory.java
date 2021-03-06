package com.design.pattern.creation.factory.file.factory;

import com.design.pattern.creation.factory.file.parser.RuleConfigParser;
import com.design.pattern.creation.factory.file.parser.XmlRuleConfigParser;

/**
 * xml解析器工厂
 *
 * @author chenpeng
 * @date 2022/2/23
 */
public class XmlRuleConfigParserFactory implements RuleConfigParserFactory {

    @Override
    public RuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
