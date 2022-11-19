package com.kerajaan.hindu.model;

import javax.persistence.*;

// membuat table
@Entity
@Table(name = "kerajaan_hindu")
public class Hindu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    menambah kolom table
    @Column(name = "kerajaan_hindu")
    private String kerajaanHindu;

    @Column(name = "letak")
    private String letak;

    @Column(name = "tahun_berdiri")
    private String tahunBerdiri;

    @Column(name = "raja_terkenal")
    private String rajaTerkenal;

    @Column(name = "peninggalan_sejarah")
    private String peninggalanSejarah;

    public Hindu() {
    }

//    constructor untuk
    public Hindu(String kerajaanHindu, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah) {
        this.kerajaanHindu = kerajaanHindu;
        this.letak = letak;
        this.tahunBerdiri = tahunBerdiri;
        this.rajaTerkenal = rajaTerkenal;
        this.peninggalanSejarah = peninggalanSejarah;
    }

//    getter & setter : membuat method data table
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKerajaanHindu() {
        return kerajaanHindu;
    }

    public void setKerajaanHindu(String kerajaanHindu) {
        this.kerajaanHindu = kerajaanHindu;
    }

    public String getLetak() {
        return letak;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public String getRajaTerkenal() {
        return rajaTerkenal;
    }

    public void setRajaTerkenal(String rajaTerkenal) {
        this.rajaTerkenal = rajaTerkenal;
    }

    public String getPeninggalanSejarah() {
        return peninggalanSejarah;
    }

    public void setPeninggalanSejarah(String peninggalanSejarah) {
        this.peninggalanSejarah = peninggalanSejarah;
    }

//    toString untuk output data
    @Override
    public String toString() {
        return "KerajaanHindu{" +
                "id=" + id +
                ", kerajaanHindu='" + kerajaanHindu + '\'' +
                ", letak='" + letak + '\'' +
                ", tahunBerdiri='" + tahunBerdiri + '\'' +
                ", rajaTerkenal='" + rajaTerkenal + '\'' +
                ", peninggalanSejarah='" + peninggalanSejarah + '\'' +
                '}';
    }
}
