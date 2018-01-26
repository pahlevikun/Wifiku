# Wifiku
A simple Android network-info libs. It's very difficult when you don't know how to get information from access-point or testing your connection.
So this is a simple libs for making your jobs more efficient.
<br><br>*Sebuah library Android sederhana untuk informasi jaringan. Sangat sulit ketika kamu tidak tahu bagaimana caranya mendapatkan informasi
dari access-point atau ketika mencoba koneksi internet. Inilah sebuah library sederhana untuk membuat pekerjaanmu lebih efisien.*

## Support 
Support from Android 4.0 Ice Cream Sandwich / Minimum API 14
<br>*Dukungan mulai Android versi 4.0 Ice Cream Sandwich / Minimal API 14*

## Permission 
Don't forget to add network permission in AndroidManifest
<br>*Jangan lupa untuk menambahkan permission di AndroidManifest*
```XML
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
```

## Installing 
Add repository in build.gradle
<br>*Tambahkan repository di build.gradle*
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```
And add dependencies
<br>*Dan tambahkan dependencies*
```gradle
dependencies {
    implementation 'com.github.pahlevikun:wifiku:0.0.1'
}
```

## Sample Code 
Getting SSID
<br>*Mendapatkan SSID*
```java
String SSID = WifiKu.getWifiSSID(this);
```
Getting BSSID
<br>*Mendapatkan BSSID*
```java
String BSSID = WifiKu.getWifiBSSID(this);
```
Getting Original RSSI
<br>*Mendapatkan RSSI asli*
```java
int RSSI = WifiKu.getWifiRSSIPlain(this);
```
Getting RSSI Strength
<br>*Mendapatkan kekuatan RSSI*
```java
int RSSI = WifiKu.getWifiRSSIStrength(this,4);
```
Getting Original IP ADDRESS
<br>*Mendapatkan IP ADDRESS Asli*
```java
int IPADDRESS = WifiKu.getWifiIPAdressPlain(this);
```
Getting Formatted IP ADDRESS
<br>*Mendapatkan IP ADDRESS Terformat*
```java
String IPADDRESS = WifiKu.getWifiIPAdressFormatted(this);
```
Getting MAC ADDRESS
<br>*Mendapatkan MAC ADDRESS*
```java
String MACADDRESS = WifiKu.getWifiMacAddress(this);
```
