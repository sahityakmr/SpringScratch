package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;

import java.time.ZonedDateTime;
import java.util.Locale;

public class ShapedCircle implements Shape, ApplicationEventPublisherAware {
    private CircleDimen circleDimen;

    @Autowired
    private MessageSource messageSource;

    private ApplicationEventPublisher publisher;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public CircleDimen getCircleDimen() {
        return circleDimen;
    }

    /*
    @SuppressWarnings("deprecation")
    @Required
    */
    /*
    Will work when only one bean of Point is present
    @Autowired
    */
    @Autowired
    public void setCircleDimen(CircleDimen circleDimen) {
        this.circleDimen = circleDimen;
    }

    @Override
    public void draw() {
        System.out.println(messageSource.getMessage("circle.greeting", new String[]{"Sahitya", ZonedDateTime.now().toString()}, "Default", Locale.GERMAN ));
        System.out.println("Drawing ShapedCircle with dimens : " + circleDimen);
        publisher.publishEvent(new DrawEvent(this));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("Setting Publisher");
        this.publisher = applicationEventPublisher;
    }
}
