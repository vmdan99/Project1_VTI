package com.example.callapi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {
        @SerializedName("userId")
        @Expose
        private int userId;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("body")
        @Expose
        private String body;

        public int getUserId() {
            return userId;
        }
        public Integer getId() {
            return id;
        }
        public String getTitle() {
            return title;
        }
        public String getBody() {
            return body;
        }

    public Post(int userId, Integer id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post(int userId, String title, String body) {
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
      String content = "";
      content += getUserId() +"\n"
              + getId()+"\n"
              + getTitle()+"\n"
              +getBody()+"\n" +"\n";
      return content;
    }
}
