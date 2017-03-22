package wqh.model;

import java.math.BigDecimal;

public class PayDetail {
    private Integer id;

    private Integer stId;

    private String position;

    private BigDecimal attendanceDays;

    private BigDecimal actualDays;

    private BigDecimal baseSalary;

    private BigDecimal subsidy;

    private BigDecimal prize;

    private BigDecimal shouldPay;
    private String stname;
    private BigDecimal taxDeduction;

    private BigDecimal socialSecurity;

    private BigDecimal realPay;

    private String pertainMonth;

    private String provideDate;

    private String notes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
    public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
    public BigDecimal getAttendanceDays() {
        return attendanceDays;
    }

    public void setAttendanceDays(BigDecimal attendanceDays) {
        this.attendanceDays = attendanceDays;
    }

    public BigDecimal getActualDays() {
        return actualDays;
    }

    public void setActualDays(BigDecimal actualDays) {
        this.actualDays = actualDays;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BigDecimal getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    public BigDecimal getPrize() {
        return prize;
    }

    public void setPrize(BigDecimal prize) {
        this.prize = prize;
    }

    public BigDecimal getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(BigDecimal shouldPay) {
        this.shouldPay = shouldPay;
    }

    public BigDecimal getTaxDeduction() {
        return taxDeduction;
    }

    public void setTaxDeduction(BigDecimal taxDeduction) {
        this.taxDeduction = taxDeduction;
    }

    public BigDecimal getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(BigDecimal socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public BigDecimal getRealPay() {
        return realPay;
    }

    public void setRealPay(BigDecimal realPay) {
        this.realPay = realPay;
    }

    public String getPertainMonth() {
        return pertainMonth;
    }

    public void setPertainMonth(String pertainMonth) {
        this.pertainMonth = pertainMonth == null ? null : pertainMonth.trim();
    }

    public String getProvideDate() {
        return provideDate;
    }

    public void setProvideDate(String provideDate) {
        this.provideDate = provideDate == null ? null : provideDate.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}