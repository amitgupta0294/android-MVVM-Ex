package com.test.firebase.androidatabinding;

import com.test.firebase.androidatabinding.model.Profile;
import com.test.firebase.androidatabinding.model.repo.ProfileResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("users")
    Call<ArrayList<Profile>> getprofiles();
}
