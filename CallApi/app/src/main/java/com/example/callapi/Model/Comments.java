package com.example.callapi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comments {
        @SerializedName("postId")
        @Expose
        private Integer postId;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("body")
        @Expose
        private String body;

        public Integer getPostId() {
            return postId;
        }
        public Integer getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public String getEmail() {
            return email;
        }
        public String getBody() {
            return body;
        }

    public Comments(Integer postId, Integer id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    @Override
    public String toString() {
        String content = "";
        content += "Post ID: " + getPostId()
                + " \nID: " + getId()
                + "\nName: " + getName()
                +"\nEmail: "+ getEmail()
                +"\nBody: " + getBody()+'\n'+'\n';
        return content;
    }
}
