/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.raihanproject1;

/**
 *
 * @author User
 */
public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHp(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public String getJenisHp(){
        return jenis_hp;
    }
    
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    
    public static void main(String[] args){
        HandPhone hp = new HandPhone();
        String jenis_hp = "Infinix";
        int tahun_pembuatan = 2021;
        hp.setDataHp(jenis_hp, tahun_pembuatan);
        System.out.println(hp.getJenisHp());
        System.out.println(hp.getTahunPembuatan());
    }
}
