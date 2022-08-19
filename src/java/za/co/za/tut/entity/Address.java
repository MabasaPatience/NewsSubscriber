/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.co.za.tut.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author patience
 */
@Entity
@Table(name = "ADDRESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a"),
    @NamedQuery(name = "Address.findByAddressid", query = "SELECT a FROM Address a WHERE a.addressid = :addressid"),
    @NamedQuery(name = "Address.findByResidentialaddress", query = "SELECT a FROM Address a WHERE a.residentialaddress = :residentialaddress"),
    @NamedQuery(name = "Address.findByResidatialcode", query = "SELECT a FROM Address a WHERE a.residatialcode = :residatialcode"),
    @NamedQuery(name = "Address.findByIssome", query = "SELECT a FROM Address a WHERE a.issome = :issome"),
    @NamedQuery(name = "Address.findByPostaladdress", query = "SELECT a FROM Address a WHERE a.postaladdress = :postaladdress"),
    @NamedQuery(name = "Address.findByPostalcode", query = "SELECT a FROM Address a WHERE a.postalcode = :postalcode")})
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ADDRESSID")
    private Integer addressid;
    @Column(name = "RESIDENTIALADDRESS")
    private String residentialaddress;
    @Column(name = "RESIDATIALCODE")
    private Integer residatialcode;
    @Column(name = "ISSOME")
    private Boolean issome;
    @Column(name = "POSTALADDRESS")
    private String postaladdress;
    @Column(name = "POSTALCODE")
    private Integer postalcode;
    @OneToMany(mappedBy = "addressidFk")
    private List<Users> usersList;

    public Address() {
    }

    public Address(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getResidentialaddress() {
        return residentialaddress;
    }

    public void setResidentialaddress(String residentialaddress) {
        this.residentialaddress = residentialaddress;
    }

    public Integer getResidatialcode() {
        return residatialcode;
    }

    public void setResidatialcode(Integer residatialcode) {
        this.residatialcode = residatialcode;
    }

    public Boolean getIssome() {
        return issome;
    }

    public void setIssome(Boolean issome) {
        this.issome = issome;
    }

    public String getPostaladdress() {
        return postaladdress;
    }

    public void setPostaladdress(String postaladdress) {
        this.postaladdress = postaladdress;
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }

    @XmlTransient
    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

   
    @Override
    public String toString() {
        return "za.co.za.tut.entity.Address[ addressid=" + addressid + " ]";
    }
    
}
