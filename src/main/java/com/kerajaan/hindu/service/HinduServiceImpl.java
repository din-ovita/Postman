package com.kerajaan.hindu.service;

import com.kerajaan.hindu.model.Hindu;
import com.kerajaan.hindu.repository.HinduRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ServiceLoader;

// postman
@Service
public class HinduServiceImpl implements HinduService{
//    agar terhubung dengan repository
    @Autowired
    HinduRepository hinduRepository;

//    mengaktifkan method untuk post/create
    @Override
    public Hindu addHindu(Hindu kerajaan_hindu) {
        return hinduRepository.save(kerajaan_hindu);
    }

//    mengaktifkan method untuk get
    @Override
    public Hindu getHinduById(Long id) {
        return hinduRepository.findById(id).get();
    }

//    mengaktifkan method untuk put/update
    @Override
    public Hindu editSekolahById(Long id, String kerajaanHindu, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah) {
        Hindu kerajaan_hindu = hinduRepository.findById(id).get();
        kerajaan_hindu.setKerajaanHindu(kerajaanHindu);
        kerajaan_hindu.setLetak(letak);
        kerajaan_hindu.setTahunBerdiri(tahunBerdiri);
        kerajaan_hindu.setRajaTerkenal(rajaTerkenal);
        kerajaan_hindu.setPeninggalanSejarah(peninggalanSejarah);
        return hinduRepository.save(kerajaan_hindu);
    }

//    mengaktifkan method untuk get all(membaca/mengambil semua data)
    @Override
    public List<Hindu> getAllHindu() {
        return hinduRepository.findAll();
    }

//    mengaktifkan method delete
    @Override
    public void deleteHinduById(Long id) {
        hinduRepository.deleteById(id);
    }
}
