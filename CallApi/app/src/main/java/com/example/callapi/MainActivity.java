package com.example.callapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.callapi.Api.ApiClient;
import com.example.callapi.Api.InJsonPlaceHolder;
import com.example.callapi.Model.Comments;
import com.example.callapi.Model.Post;
import com.example.callapi.Model.ResponseRegisterTemp;
import com.example.callapi.Model.RequestRegisterTemp;
import com.example.callapi.Model.RequestLoginTemp;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView textView,textView1;
    private static final String TAG = "MainActivity";
    protected InJsonPlaceHolder inJsonPlaceHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_info_activity);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        inJsonPlaceHolder = retrofit.create(InJsonPlaceHolder.class);
        hhello();

        /*InJsonPlaceHolder inJsonPlaceHolder = retrofit.create(InJsonPlaceHolder.class);
        Call<List<Post>> posts = inJsonPlaceHolder.getPosts(new Integer[]{2,3,6},3,"abc");

        posts.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if(!response.isSuccessful()){
                    Log.d(TAG, "onResponse: "+"Response failed");
                }
                List<Post> posts1 = response.body();
                for(Post i :posts1){
                    textView.append(i.toString());
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Log.d(TAG, "onFailure: Failed");

            }
        });*/
        /*Call<List<Comments>> comments = inJsonPlaceHolder.getComments();
        comments.enqueue(new Callback<List<Comments>>() {
            @Override
            public void onResponse(Call<List<Comments>> call, Response<List<Comments>> response) {
                if(!response.isSuccessful()){
                    Log.d(TAG, "onResponse: " +" Failed");
                }
                List<Comments> comments1 = response.body();
                for(Comments i: comments1){

                   textView.append(i.toString());


                }
            }

            @Override
            public void onFailure(Call<List<Comments>> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());

            }
        });*/
      /*  Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        InJsonPlaceHolder jsonPlaceHolder = retrofit.create(InJsonPlaceHolder.class);
        Call<List<Post>> call = jsonPlaceHolder.getPosts();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if(!response.isSuccessful()){
                    textView.setText("Code"+response.code());
                    return;
                }
                List<Post> posts = response.body();
                for(Post post : posts){
                    String content = "";
                    content += "User ID: " + post.getUserId()
                            + " \nID: " + post.getId()
                            + "\nTitle: " +post.getTitle()
                            +"\nBody: "+post.getBody() + '\n'+'\n';
                    textView.append(content);
                }

            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });*/

        //Register();
//        Register();
//        User_Active();

    }
    public void hhello(){
        Post post = new Post(1000,"abcdefghihlj","jahfhajfhjkahf");
      Call<Post> postCall = inJsonPlaceHolder.createPost(post);
        postCall.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if(!response.isSuccessful()){
                    Log.d(TAG, "onResponse: Failed");
                }
                Post post1 = response.body();
                textView.setText(post1.toString());

            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage());

            }
        });


    }

    /*public void Register(){
        Call<ResponseRegisterTemp> resLogin = ApiClient.getUserService().register("X","12",
                new RequestRegisterTemp(null,null,"vumanhdan99@gmail.com",0,"abcde"));
        resLogin.enqueue(new Callback<ResponseRegisterTemp>() {
            @Override
            public void onResponse(Call<ResponseRegisterTemp> call, Response<ResponseRegisterTemp> response) {
                if(response.isSuccessful()){
                   ResponseRegisterTemp responseLogins = response.body();
                    Toast.makeText(MainActivity.this,"responseLogins.toString()", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<ResponseRegisterTemp> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());
            }
        });

    }*/
    /*
     Call<List<ResponseLogin>> resLogin = ApiClient.getUserService().respone_login(null,null,"gafha@gmail.com","fhahfa");
        resLogin.enqueue(new Callback<List<ResponseLogin>>() {
            @Override
            public void onResponse(Call<List<ResponseLogin>> call, Response<List<ResponseLogin>> response) {
                if(response.isSuccessful()){
                    List<ResponseLogin> responseLogins = response.body();
                }

            }

            @Override
            public void onFailure(Call<List<ResponseLogin>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());
            }
        });

    }
     Call<List<ResponseLogin>> resLogin = ApiClient.getUserService().respone_login(null,null,"gafha@gmail.com","fhahfa");
        resLogin.enqueue(new Callback<List<ResponseLogin>>() {
            @Override
            public void onResponse(Call<List<ResponseLogin>> call, Response<List<ResponseLogin>> response) {
                if(response.isSuccessful()){
                    List<ResponseLogin> responseLogins = response.body();
                }

            }

            @Override
            public void onFailure(Call<List<ResponseLogin>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());
            }
        });

    }
    public void Register(){
        Call<List<ResponeRegister>> resResgis = ApiClient.getUserService().register("10","10");
        resResgis.enqueue(new Callback<List<ResponeRegister>>() {
            @Override
            public void onResponse(Call<List<ResponeRegister>> call, Response<List<ResponeRegister>> response) {
                List<ResponeRegister> responeRegisters = response.body();
            }

            @Override
            public void onFailure(Call<List<ResponeRegister>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());

            }
        });
    }
    public  void User_Active(){
        Call<List<ResponeUser_Active>> resUser_Active = ApiClient.getUserService().user_active("10","10");
        resUser_Active.enqueue(new Callback<List<ResponeUser_Active>>() {
            @Override
            public void onResponse(Call<List<ResponeUser_Active>> call, Response<List<ResponeUser_Active>> response) {
                List<ResponeUser_Active> responeUser_actives = response.body();
            }

            @Override
            public void onFailure(Call<List<ResponeUser_Active>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());

            }
        });
    }*/
}