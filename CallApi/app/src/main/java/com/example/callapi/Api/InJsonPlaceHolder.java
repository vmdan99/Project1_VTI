package com.example.callapi.Api;

import com.example.callapi.Model.Comments;
import com.example.callapi.Model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface InJsonPlaceHolder {
   /* @GET ("posts")
    Call<List<Post>> getPosts() ;

    @GET("posts/1/comments")
    Call<List<Comments>> getComments();*/

   /* @GET("posts/{id}/comments")
    Call<List<Comments>> getComments(@Path("id") int postId);*/
   @GET("posts")
    Call<List<Post>> getPosts(@Query("userId") Integer[] userid,
   @Query("data") int data, @Query("index") String index);

   @POST("posts")
    Call<Post> createPost(@Body Post post);
}
