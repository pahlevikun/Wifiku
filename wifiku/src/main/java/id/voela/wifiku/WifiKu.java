package id.voela.wifiku;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

import java.io.IOException;
import java.net.InetAddress;

import static android.content.Context.WIFI_SERVICE;

/**
 * Created by farhan on 1/26/18.
 */

public class WifiKu {

    public static String getWifiSSID(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        return wifiInfo.getSSID();
    }

    public static String getWifiBSSID(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        return wifiInfo.getBSSID();
    }

    public static String getWifiMacAddress(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        return wifiInfo.getMacAddress();
    }

    public static int getWifiIPAdressPlain(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        return wifiInfo.getIpAddress();
    }

    public static int getWifiRSSIPlain(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        return wifiInfo.getRssi();
    }


    public static int getWifiRSSIStrength(Context context, int level) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        return WifiManager.calculateSignalLevel(wifiInfo.getRssi(), level);
    }

    @SuppressLint("DefaultLocale")
    public static String getWifiIPAdressFormatted(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        int ip = wifiInfo.getIpAddress();
        return String.format(
                "%d.%d.%d.%d",
                (ip & 0xff),
                (ip >> 8 & 0xff),
                (ip >> 16 & 0xff),
                (ip >> 24 & 0xff));
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null;
    }

    public static boolean isInternetAvailable(String siteUrl) {
        try {
            if (siteUrl.isEmpty()) {
                siteUrl = "google.com";
            }
            InetAddress ipAddr = InetAddress.getByName(siteUrl);
            return !ipAddr.equals("");
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isPingSuccess(String siteUrl) throws InterruptedException, IOException {
        String command;
        if (siteUrl.isEmpty()) {
            command = "google.com -c 1 google.com";
        } else {
            command = "ping -c 1 " + siteUrl;
        }
        return (Runtime.getRuntime().exec(command).waitFor() == 0);
    }
}
