package com.example.whowroteit;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import androidx.annotation.NonNull;

public class BookLoader extends AsyncTaskLoader<String> {

    private String mQueryString;
    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(mQueryString);
    }
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
    }

    public BookLoader(Context context, String queryString) {
        super(context);
        mQueryString = queryString;
    }
}
