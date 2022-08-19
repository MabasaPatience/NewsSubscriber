/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.co.za.tut.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author patience
 */
@Entity
@Table(name = "NEWSLETTERSUBSCRIBE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Newslettersubscribe.findAll", query = "SELECT n FROM Newslettersubscribe n"),
    @NamedQuery(name = "Newslettersubscribe.findBySubscriptionid", query = "SELECT n FROM Newslettersubscribe n WHERE n.subscriptionid = :subscriptionid"),
    @NamedQuery(name = "Newslettersubscribe.findByIssubscribe", query = "SELECT n FROM Newslettersubscribe n WHERE n.issubscribe = :issubscribe"),
    @NamedQuery(name = "Newslettersubscribe.findByNewsletters", query = "SELECT n FROM Newslettersubscribe n WHERE n.newsletters = :newsletters"),
    @NamedQuery(name = "Newslettersubscribe.findByStartdate", query = "SELECT n FROM Newslettersubscribe n WHERE n.startdate = :startdate"),
    @NamedQuery(name = "Newslettersubscribe.findByEnddate", query = "SELECT n FROM Newslettersubscribe n WHERE n.enddate = :enddate")})
public class Newslettersubscribe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUBSCRIPTIONID")
    private Integer subscriptionid;
    @Column(name = "ISSUBSCRIBE")
    private Boolean issubscribe;
    @Column(name = "NEWSLETTERS")
    private Integer newsletters;
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.DATE)
    private Date startdate;
    @Column(name = "ENDDATE")
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @JoinColumn(name = "USERNAME_FK", referencedColumnName = "USERNAME")
    @ManyToOne
    private Users usernameFk;

    public Newslettersubscribe() {
    }

    public Newslettersubscribe(Integer subscriptionid) {
        this.subscriptionid = subscriptionid;
    }

    public Integer getSubscriptionid() {
        return subscriptionid;
    }

    public void setSubscriptionid(Integer subscriptionid) {
        this.subscriptionid = subscriptionid;
    }

    public Boolean getIssubscribe() {
        return issubscribe;
    }

    public void setIssubscribe(Boolean issubscribe) {
        this.issubscribe = issubscribe;
    }

    public Integer getNewsletters() {
        return newsletters;
    }

    public void setNewsletters(Integer newsletters) {
        this.newsletters = newsletters;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Users getUsernameFk() {
        return usernameFk;
    }

    public void setUsernameFk(Users usernameFk) {
        this.usernameFk = usernameFk;
    }

  

    @Override
    public String toString() {
        return "za.co.za.tut.entity.Newslettersubscribe[ subscriptionid=" + subscriptionid + " ]";
    }
    
}
