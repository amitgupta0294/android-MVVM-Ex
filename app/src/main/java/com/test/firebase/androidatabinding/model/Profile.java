
package com.test.firebase.androidatabinding.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.annotations.SerializedName;

public class Profile extends BaseObservable {

    @SerializedName("address")
    private Address mAddress;
    @SerializedName("company")
    private Company mCompany;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("id")
    private Long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("phone")
    private String mPhone;
    @SerializedName("username")
    private String mUsername;
    @SerializedName("website")
    private String mWebsite;

    public Address getAddress() {
        return mAddress;
    }

    public void setAddress(Address address) {
        mAddress = address;
    }

    public Company getCompany() {
        return mCompany;
    }

    public void setCompany(Company company) {
        mCompany = company;
    }

    @Bindable
    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    @Bindable
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String website) {
        mWebsite = website;
    }
}
