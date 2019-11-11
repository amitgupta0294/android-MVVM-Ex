package com.test.firebase.androidatabinding.model.repo;

import com.google.gson.annotations.SerializedName;
import com.test.firebase.androidatabinding.model.Profile;

import java.io.Serializable;
import java.util.ArrayList;

public class ProfileResponse implements Serializable {

    private ArrayList<Profile> profiles;

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }
}
