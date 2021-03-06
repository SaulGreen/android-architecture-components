package com.example.srt.plainonotes3.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.example.srt.plainonotes3.database.AppRepository;
import com.example.srt.plainonotes3.database.NoteEntity;

public class EditorViewModel extends AndroidViewModel {

    public MutableLiveData<NoteEntity> mLiveNote = new MutableLiveData<>();
    private AppRepository mRepository;

    public EditorViewModel(@NonNull Application application) {
        super(application);

        mRepository = AppRepository.getInstance(getApplication());
    }
}
