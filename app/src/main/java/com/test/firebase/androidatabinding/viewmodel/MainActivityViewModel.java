package com.test.firebase.androidatabinding.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.test.firebase.androidatabinding.model.Profile;
import com.test.firebase.androidatabinding.model.repo.ProfileRepo;
import com.test.firebase.androidatabinding.model.repo.ProfileResponse;

import java.util.ArrayList;

public class MainActivityViewModel extends ViewModel {

    ProfileRepo profileRepo;
    MutableLiveData<ArrayList<Profile>> profileData;

    public ProfileRepo init() {
        if (profileRepo != null) return profileRepo;

        else {
            profileRepo = ProfileRepo.getInstance();
            return profileRepo;
        }
    }

    public LiveData<ArrayList<Profile>> getData() {
        profileData = profileRepo.getProfiles();
        return profileData;
    }
}
