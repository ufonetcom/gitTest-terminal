package com.jaebok.inflearn.intellij;

public class ViewArguments {
    public void viewArguments(){
        EmailSender emailSender = new EmailSender(1L, "jaebok", "ufozx@naver.com");

        emailSender.send("test@gmail.com");
    }
}
