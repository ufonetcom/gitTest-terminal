package com.jaebok.inflearn.intellij;

public class EmailSender {
    private Long id;
    private String name;
    private String email;

    public EmailSender(Long id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void send(String to){
        System.out.println(this.email+" 님이"+to+"님에게 메일을 보냅니다.");
    }
}
