package com.example.aldiros.coba_firebase;

/**
 * Created by aldiros on 03/03/2018.
 */

class UserInformation {
    public String name;
    public String address;
    public String phone;
    public String pekerjaan;

    public UserInformation(){

    }

    public UserInformation(String name, String address, String phone, String pekerjaan) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.pekerjaan = pekerjaan;
    }

}
