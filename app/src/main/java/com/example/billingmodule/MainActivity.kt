package com.example.billingmodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.android.billingclient.api.BillingClient

class MainActivity : ComponentActivity() {

    private lateinit var billingClient: BillingClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        billingClient = BillingClient.newBuilder(this)
            .setListener { _, _ -> }
            .build()
    }
}
