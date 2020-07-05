package com.kevin.viewcontext

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner

/**
 * ViewContextEx
 *
 * @author zwenkai@foxmail.com, Created on 2020-07-05 11:08:51
 *         Major Function：<b>View Context extension</b>
 *         <p/>
 *         Note: If you modify this class please fill in the following content as a record.
 * @author mender，Modified Date Modify Content:
 */

val ComponentActivity.viewContext: ViewContext
    get() {
        val activity = this
        return object : ViewContext {
            override fun getContext(): Context {
                return activity.applicationContext
            }

            override fun getActivity(): Activity {
                return activity
            }

            override fun getLifecycleOwner(): LifecycleOwner {
                return activity
            }

            override fun getResources(): Resources {
                return activity.resources
            }

        }
    }

val Fragment.viewContext: ViewContext
    get() {
        val fragment = this
        return object : ViewContext {
            override fun getContext(): Context {
                return fragment.requireContext().applicationContext
            }

            override fun getActivity(): Activity {
                return fragment.requireActivity()
            }

            override fun getLifecycleOwner(): LifecycleOwner {
                return fragment.viewLifecycleOwner
            }

            override fun getResources(): Resources {
                return fragment.resources
            }

        }
    }