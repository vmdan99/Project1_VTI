package com.example.callapi.Api;

import com.example.callapi.Model.ResponeLoginTemp;
import com.example.callapi.Model.ResponseRegisterTemp;
import com.example.callapi.Model.ResponseUser_ActiveTemp;
import com.example.callapi.Model.RequestRegisterTemp;
import com.example.callapi.Model.RequestUser_ActiveTemp;
import com.example.callapi.Model.RequestLoginTemp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface UserService {

    /*@POST("authentication/login")
    Call<ResponeLoginTemp> respone_login (@Header("X-CmdId") String cmId, @Header("X-SentTime") String timeSent, @Body RequestLoginTemp requestLogin);


    @PUT("authentication/register")
    Call<ResponseRegisterTemp> register (@Header("X-CmdId") String cmId, @Header("X-SentTime") String timeSent, @Body RequestRegisterTemp requestRegister);

    @POST("authentication/user-active")
    Call<ResponseUser_ActiveTemp> user_active (@Header("X-CmdId") String cmId, @Header("X-SentTime") String timeSent, @Body RequestUser_ActiveTemp requestUser_active);


    @GET("authentication/user-info")
    Call<RequestLoginTemp> takeInfo (@Header("Authotization") String token, @Header("X-CmdId") String cmId, @Header("X-SentTime") String timeSent);*/


}
