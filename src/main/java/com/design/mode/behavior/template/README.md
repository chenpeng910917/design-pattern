# 模板模式
模板 是抽象类中定义final(避免子类重写)骨架方法 在定义其他抽象方法(强制子类必须实现的方法)

模板模式有两大作用：
复用和扩展。
其中，复用指的是，所有的子类可以复用父类中提供的模板方法的代码。
扩展指的是，框架通过模板模式提供功能扩展点，让框架用户可以在不修改框架源码的情况下，基于扩展点定制化框架的功能。

JdbcTemplate就属于回调函数
org.springframework.jdbc.core.JdbcTemplate#query(java.lang.String, org.springframework.jdbc.core.ResultSetExtractor<T>)