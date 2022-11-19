package com.kerajaan.hindu.service;

import com.kerajaan.hindu.model.Hindu;

import java.util.List;

public interface HinduService {
//    method untuk post
    Hindu addHindu(Hindu kerajaan_hindu);
//    Hindu = nama class java
//    kerajaan_hindu = name table

//    method untuk get
    Hindu getHinduById(Long id);

//    method get all
    List<Hindu> getAllHindu();

//    method untuk put
    Hindu editSekolahById(Long id, String kerajaanHindu, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah);

//    method untuk delete
    void deleteHinduById(Long id);

}
