package com.example.savedstatedemo.workManager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest
import com.example.savedstatedemo.R
import com.example.savedstatedemo.workManager.WorkManagerClass

class WorkManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_manager)

        val uploadWorkRequest: WorkRequest = OneTimeWorkRequestBuilder<WorkManagerClass>().build()

        // Submit the WorkRequest to the system
        WorkManager.getInstance(this).enqueue(uploadWorkRequest)

    }

}