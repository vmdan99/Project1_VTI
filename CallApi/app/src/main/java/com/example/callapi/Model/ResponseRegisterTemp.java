package com.example.callapi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseRegisterTemp {




        @SerializedName("activeTransactionId")
        @Expose
        private String activeTransactionId;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("otp")
        @Expose
        private String otp;
        @SerializedName("responseTime")
        @Expose
        private Integer responseTime;

        public String getActiveTransactionId() {
            return activeTransactionId;
        }

        public void setActiveTransactionId(String activeTransactionId) {
            this.activeTransactionId = activeTransactionId;
        }



        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }



        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }



        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }


        public Integer getResponseTime() {
            return responseTime;
        }

        public void setResponseTime(Integer responseTime) {
            this.responseTime = responseTime;
        }


    public ResponseRegisterTemp(String activeTransactionId, String code, String message, String otp, Integer responseTime) {
        this.activeTransactionId = activeTransactionId;
        this.code = code;
        this.message = message;
        this.otp = otp;
        this.responseTime = responseTime;
    }

    @Override
    public String toString() {
        return "RequestRegister{" +
                "activeTransactionId='" + activeTransactionId + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", otp='" + otp + '\'' +
                ", responseTime=" + responseTime +
                '}';
    }
}
