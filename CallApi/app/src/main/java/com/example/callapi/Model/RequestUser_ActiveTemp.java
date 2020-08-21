package com.example.callapi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestUser_ActiveTemp {
        @SerializedName("activeTransactionId")
        @Expose
        private String activeTransactionId;
        @SerializedName("deviceId")
        @Expose
        private String deviceId;
        @SerializedName("deviceName")
        @Expose
        private String deviceName;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("otp")
        @Expose
        private String otp;

        public String getActiveTransactionId() {
            return activeTransactionId;
        }

        public void setActiveTransactionId(String activeTransactionId) {
            this.activeTransactionId = activeTransactionId;
        }


        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }


        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }


    public RequestUser_ActiveTemp(String activeTransactionId, String deviceId, String deviceName, String email, String otp) {
        this.activeTransactionId = activeTransactionId;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.email = email;
        this.otp = otp;
    }

    @Override
    public String toString() {
        return "ResponeUser_Active{" +
                "activeTransactionId='" + activeTransactionId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", email='" + email + '\'' +
                ", otp='" + otp + '\'' +
                '}';
    }
}
