package com.jaebok.inflearn.intellij;


public class EmailSender {
    private Integer id;
    private String name;
    private String email;

    public EmailSender() {
    }

    public EmailSender(Integer id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void send(String to){
        System.out.println(this.email+" 님이"+to+"님에게 메일을 보냅니다.");
    }
}
