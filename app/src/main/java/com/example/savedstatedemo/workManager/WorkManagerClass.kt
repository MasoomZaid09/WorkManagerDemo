package com.example.savedstatedemo.workManager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class WorkManagerClass(context: Context, workerParameters: WorkerParameters) : Worker(context,workerParameters){

    override fun doWork(): Result {

        Log.e("Tag","Services running....")

        return Result.success()
    }
}