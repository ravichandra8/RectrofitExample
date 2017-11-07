package com.ravi.rectrofitexample.rest;




import com.ravi.rectrofitexample.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("GetAllPSbyDist?District=2060")
    Call<MoviesResponse> getTopRatedMovies();
    //Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);
//    Call<MoviesResponse> getTopRatedMovies();
//    @GET("movie/{id}")
//    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
