package com.kerajaan.hindu.controller;

import com.kerajaan.hindu.model.Hindu;
import com.kerajaan.hindu.service.HinduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// requestmapping untuk membuat alamat tempat table
@RestController
@RequestMapping("/kerajaanhindu")
public class HinduContoller {
    @Autowired
    private HinduService hinduService;

//    create data
    @PostMapping
    public Hindu addHindu(@RequestBody Hindu kerajaan_hindu) {
        return hinduService.addHindu(kerajaan_hindu);
    }

//    read & get by id
    @GetMapping("/{id}")
    public Hindu getHinduById(@PathVariable("id") Long id) {
        return hinduService.getHinduById(id);
    }

//    update by id
    @PutMapping("/{id}")
    public Hindu editHinduById(@PathVariable("id") Long id, @RequestBody Hindu kerajaan_hindu) {
        return hinduService.editSekolahById(id, kerajaan_hindu.getKerajaanHindu(), kerajaan_hindu.getLetak(), kerajaan_hindu.getTahunBerdiri(), kerajaan_hindu.getRajaTerkenal(), kerajaan_hindu.getPeninggalanSejarah());
    }

//   read & get all
    @GetMapping("/all")
    public List<Hindu> getAllHindu() {
        return hinduService.getAllHindu();
    }

//    delete by id
    @DeleteMapping("/{id}")
    public void deleteHinduById(@PathVariable("id") Long id) {
       hinduService.deleteHinduById(id);
    }
}
