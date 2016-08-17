package com.skyline.learn.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/8/17.
 */
@Component
public class BlogProperties {

    @Value("${com.skyline.learn.name}")
    private String name;

    @Value("${com.skyline.learn.title}")
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
