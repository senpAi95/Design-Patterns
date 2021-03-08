package com.designpatterns.creational.factory;

public class Blog extends Website{
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
    }
}
