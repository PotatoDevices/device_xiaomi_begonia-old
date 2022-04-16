package org.lineageos.dt2w.begonia

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class OnBootCompleteReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val sIntent = Intent(context, DT2WServiceBegonia::class.java)
        context.startServiceAsUser(sIntent, UserHandle.CURRENT)
    }
} 