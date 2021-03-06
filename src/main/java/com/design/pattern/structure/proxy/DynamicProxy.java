package com.design.pattern.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author chenpeng
 */
public class DynamicProxy {

    /**
     * 创建动态代理
     *
     * @param proxiedObject 被代理的对象
     * @return 代理对象
     */
    public Object createProxy(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, dynamicProxyHandler);
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private final Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // 计算程序开始时间
            long startTime = System.currentTimeMillis();
            // 执行方法
            Object result = method.invoke(proxiedObject, args);
            // 计算程序结束时间
            long endTime = System.currentTimeMillis();
            // 返回时间
            long responseTime = endTime - startTime;
            // 方法名称
            String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
            System.out.println(apiName + "程序执行时间:" + responseTime);
            return result;
        }
    }
}
