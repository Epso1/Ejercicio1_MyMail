package com.example.mymail2.ui.spam;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SpamViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SpamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Spam");
    }

    public LiveData<String> getText() {
        return mText;
    }
}