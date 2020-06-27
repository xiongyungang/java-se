package com.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Yungang(test1 = "test", test2 = 3.0)
public class Test {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void test1()
    {
        //弃用
    }

    @SuppressWarnings("all")
    public void test2()
    {
        //压制所有警告
    }

    @Yungang(test1 = "test2", test2 = 1.0)
    public void test3(){

    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Calculator calculator = new Calculator();
        Class aClass = calculator.getClass();
        Method[] methods = aClass.getMethods();

        for (Method method: methods
             ) {
            // 查看方法是否存在JunitDemo注解
            if (method.isAnnotationPresent(JunitDemo.class))
            {
                try {
                    // 执行方法，并捕获异常
                    method.invoke(calculator);
                }catch (Exception e) {
                    System.out.println("method: " +method.getName() + " have exception , type is "+ e);
                }
            }
        }
    }
}
