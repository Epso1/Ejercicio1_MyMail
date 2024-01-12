package com.example.mymail2.ui.trash;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrashViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TrashViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Trash");
    }

    public LiveData<String> getText() {
        return mText;
    }
}