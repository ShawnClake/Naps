package com.shawnclake.auth;

public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private String stats;
    private String settings;

    public User()
    {
        id = 0;
        username = "";
        password = "";
        email = "";
        stats = "";
        settings = "";
    }

    public User(int id, String username, String password, String email, String stats, String settings) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.stats = stats;
        this.settings = settings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }
}
