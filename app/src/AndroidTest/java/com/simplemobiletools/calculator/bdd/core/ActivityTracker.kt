package com.simplemobiletools.calculator.bdd.core

import android.app.Activity
import android.app.Application
import android.os.Bundle

class ActivityTracker {

    var currentActivity: Activity? = null

    fun registerActivityLifecycle(activity: Activity) {
        activity.application?.registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {
            override fun onActivityPaused(activity: Activity?) {}
            override fun onActivityResumed(activity: Activity?) {
                if (activity != null) {
                    currentActivity = activity
                }
            }

            override fun onActivityStarted(activity: Activity?) {}
            override fun onActivityDestroyed(activity: Activity?) {}
            override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {}
            override fun onActivityStopped(activity: Activity?) {}
            override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {}
        })
    }
}