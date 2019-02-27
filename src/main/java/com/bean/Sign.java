package com.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by ${邹} on 2019/2/24.
 * 描述：
 */
public class Sign {
    private Long id;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date time;
    private Long uId;
    private User user;
    private List<User> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Sign{" +
                "id=" + id +
                ", time=" + time +
                ", uId=" + uId +
                ", user=" + user +
                ", users=" + users +
                '}';
    }
}
