package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
    public static void main(String[] args) {

        // drawWithoutSpring();
        // drawWithBeanFactory();
        // drawWithApplicationContext();
        drawWithAbstractApplicationContext();
    }

    private static void drawWithAbstractApplicationContext() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        drawPointerTriangle(context);
    }

    private static void drawWithApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // drawSimpleTriangle(context);
        // drawTypedTriangle(context);
        drawPointerTriangle(context);
        // drawComplexTriangle(context);
    }

    private static void drawPointerTriangle(ApplicationContext context) {
        // PointerTriangle pointerTriangle = (PointerTriangle) context.getBean("pointerTriangle");
        // PointerTriangle pointerTriangle = (PointerTriangle) context.getBean("triangle");
        PointerTriangle pointerTriangle = (PointerTriangle) context.getBean("pointerTriangle1");
        pointerTriangle.draw();
    }

    private static void drawTypedTriangle(ApplicationContext context) {
        TypedTriangle typedTriangle = (TypedTriangle) context.getBean("typedTriangle");
        typedTriangle.draw();
    }

    private static void drawSimpleTriangle(ApplicationContext context) {
        SimpleTriangle simpleTriangle = (SimpleTriangle) context.getBean("simpleTriangle");
        simpleTriangle.draw();
    }

    private static void drawComplexTriangle(ApplicationContext context) {
        ComplexTriangle complexTriangle = (ComplexTriangle) context.getBean("complexTriangle");
        complexTriangle.draw();
    }

    @SuppressWarnings("deprecation")
    private static void drawWithBeanFactory() {
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        SimpleTriangle simpleTriangle = (SimpleTriangle) beanFactory.getBean("simpleTriangle");
        simpleTriangle.draw();
    }

    private static void drawWithoutSpring() {
        SimpleTriangle simpleTriangle = new SimpleTriangle();
        simpleTriangle.draw();
    }
}
