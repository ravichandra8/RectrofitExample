package com.ravi.rectrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ravi.rectrofitexample.model.Movie;
import com.ravi.rectrofitexample.model.MoviesResponse;
import com.ravi.rectrofitexample.model.Post;
import com.ravi.rectrofitexample.model.PostReponseChild;
import com.ravi.rectrofitexample.model.PostResponseParent;
import com.ravi.rectrofitexample.rest.ApiClient;
import com.ravi.rectrofitexample.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Body;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//   for get url uncomment this code
//        ApiInterface apiService =
//                ApiClient.getClient().create(ApiInterface.class);

//        Call<MoviesResponse> call = apiService.getTopRatedMovies();
//        call.enqueue(new Callback<MoviesResponse>() {
//            @Override
//            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
//                int statusCode = response.code();
//                Log.d("status",statusCode+"");
//                List<Movie> movies = response.body().getResults();
////                recyclerView.setAdapter(new MoviesAdapter(movies, R.layout.list_item_movie, getApplicationContext()));
//
//              for (int i=0;i<movies.size();i++)
//
//              {
//                  Log.d("psnames",movies.get(i).getPoliceStation());
//              }
//
//            }
//
//            @Override
//            public void onFailure(Call<MoviesResponse> call, Throwable t) {
//                // Log error here since request failed
//                Log.e("response", t.toString());
//            }
//        });

//post response

                ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);


            Post post=new Post("","","3","","22","","","");
        //for form enording
      //  Call<PostResponseParent> call = apiService.savePost("","","3","","22","","","");
        //for header format
       Call<PostResponseParent> call = apiService.savePost1(post);
        call.enqueue(new Callback<PostResponseParent>() {
            @Override
            public void onResponse(Call<PostResponseParent> call, Response<PostResponseParent> response) {
                int statusCode = response.code();
                Log.d("status",statusCode+"");
                List<PostReponseChild> child = response.body().getCrimeDetails();
//                recyclerView.setAdapter(new MoviesAdapter(movies, R.layout.list_item_movie, getApplicationContext()));

              for (int i=0;i<child.size();i++)

              {
                  Log.d("crimeno",child.get(i).getCrimeId());
              }

            }

            @Override
            public void onFailure(Call<PostResponseParent> call, Throwable t) {

            }

        });


    }
}
