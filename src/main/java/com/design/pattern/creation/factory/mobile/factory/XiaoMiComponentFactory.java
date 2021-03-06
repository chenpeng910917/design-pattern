package com.design.pattern.creation.factory.mobile.factory;

import com.design.pattern.creation.factory.mobile.accessories.Camera;
import com.design.pattern.creation.factory.mobile.accessories.Cpu;
import com.design.pattern.creation.factory.mobile.accessories.Screen;
import com.design.pattern.creation.factory.mobile.accessories.apple.AppleCamera;
import com.design.pattern.creation.factory.mobile.accessories.apple.AppleCpu;
import com.design.pattern.creation.factory.mobile.accessories.apple.AppleScreen;

/**
 * 小米手机抽象工厂
 *
 * @author chenpeng
 */
public class XiaoMiComponentFactory implements ComponentFactory {
    @Override
    public Camera createCamera() {
        return new AppleCamera();
    }

    @Override
    public Cpu createCpu() {
        return new AppleCpu();
    }

    @Override
    public Screen createScreen() {
        return new AppleScreen();
    }
}
