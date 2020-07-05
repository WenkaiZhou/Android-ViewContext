package com.kevin.viewcontext;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

/**
 * ViewContext
 *
 * @author zwenkai@foxmail.com, Created on 2020-07-05 11:08:17
 * Major Function：<b>View Context</b>
 * <p/>
 * Note: If you modify this class please fill in the following content as a record.
 * @author mender，Modified Date Modify Content:
 */

public interface ViewContext {

    @NonNull
    Context getContext();

    @NonNull
    Activity getActivity();

    @NonNull
    LifecycleOwner getLifecycleOwner();

    @NonNull
    Resources getResources();

}