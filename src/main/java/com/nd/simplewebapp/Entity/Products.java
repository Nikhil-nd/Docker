package com.nd.simplewebapp.Entity;

import org.springframework.stereotype.Component;

@Component
public class Products {
    private Integer prodid;
    private String prodname;
    
    private Double prodrice;
    
    public Products(int prodid, String prodname, double prodrice) {
        this.prodid = prodid;
        this.prodname = prodname;
        this.prodrice = prodrice;
    }


    public Products() {
    }


    public Integer getProdid() {
        return prodid;
    }

    public void setProdid(Integer prodid) {
        this.prodid = prodid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public Double getProdrice() {
        return prodrice;
    }

    public void setProdrice(Double prodrice) {
        this.prodrice = prodrice;
    }
}
