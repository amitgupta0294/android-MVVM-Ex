package com.test.firebase.androidatabinding.model.repo;

import androidx.lifecycle.MutableLiveData;

import com.test.firebase.androidatabinding.ApiInterface;
import com.test.firebase.androidatabinding.RetrofitService;
import com.test.firebase.androidatabinding.model.Profile;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ProfileRepo {

    private static ProfileRepo profileRepo;
    private ApiInterface apiInterface;

    public static ProfileRepo getInstance() {
        if (profileRepo != null)  {
            return profileRepo;
        } else {
            profileRepo = new ProfileRepo();
            return profileRepo;
        }
    }

    public ProfileRepo() {
        this.apiInterface = RetrofitService.cteateService(ApiInterface.class);
    }

    public MutableLiveData<ArrayList<Profile>> getProfiles() {

        final MutableLiveData<ArrayList<Profile>> data = new MutableLiveData<>();

        apiInterface.getprofiles().enqueue(new Callback<ArrayList<Profile>>() {
            @Override
            public void onResponse(Call<ArrayList<Profile>> call, Response<ArrayList<Profile>> response) {

                if (response.isSuccessful()) {
                    data.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Profile>> call, Throwable t) {

            }
        });

        return data;
    }
}
