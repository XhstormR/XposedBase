package com.example.leo.monitor.xposed.net

import de.robv.android.xposed.XC_MethodHook
import java.io.OutputStream
import java.net.Socket

object SocketOutputStreamHook : XC_MethodHook() {

    override fun afterHookedMethod(param: MethodHookParam) {
        val socket = param.thisObject as Socket

        param.result = MonitorOutputStream(
            socket.inetAddress.hostAddress,
            socket.inetAddress.hostName,
            socket.port,
            param.result as OutputStream
        )
    }
}
