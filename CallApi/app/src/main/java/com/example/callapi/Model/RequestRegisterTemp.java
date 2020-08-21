package com.example.callapi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestRegisterTemp {

        @SerializedName("deviceId")
        @Expose
        private String deviceId;
        @SerializedName("deviceName")
        @Expose
        private String deviceName;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("merchantId")
        @Expose
        private Integer merchantId;
        @SerializedName("password")
        @Expose
        private String password;

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



        public Integer getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(Integer merchantId) {
            this.merchantId = merchantId;
        }


        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    public RequestRegisterTemp(String deviceId, String deviceName, String email, Integer merchantId, String password) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.email = email;
        this.merchantId = merchantId;
        this.password = password;
    }

    @Override
    public String toString() {
        return "ResponeRegister{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", email='" + email + '\'' +
                ", merchantId=" + merchantId +
                ", password='" + password + '\'' +
                '}';
    }
}
