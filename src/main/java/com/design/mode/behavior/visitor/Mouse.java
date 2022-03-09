package com.design.mode.behavior.visitor;

/**
 * 鼠标
 *
 * @author chenpeng
 */
public class Mouse implements ComputerPart{
    @Override
    public void visit(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
