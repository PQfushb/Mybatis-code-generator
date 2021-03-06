package org.saas.report.entity;

public class S02EntpCustDecQty extends S02EntpCustDecQtyKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s02_entp_cust_dec_qty.entp_typ_desc
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    private String entpTypDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s02_entp_cust_dec_qty.im_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    private Integer imDecQty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s02_entp_cust_dec_qty.e_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    private Integer eDecQty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s02_entp_cust_dec_qty.tot_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    private Integer totDecQty;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s02_entp_cust_dec_qty.entp_typ_desc
     *
     * @return the value of s02_entp_cust_dec_qty.entp_typ_desc
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    public String getEntpTypDesc() {
        return entpTypDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s02_entp_cust_dec_qty.entp_typ_desc
     *
     * @param entpTypDesc the value for s02_entp_cust_dec_qty.entp_typ_desc
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    public void setEntpTypDesc(String entpTypDesc) {
        this.entpTypDesc = entpTypDesc == null ? null : entpTypDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s02_entp_cust_dec_qty.im_dec_qty
     *
     * @return the value of s02_entp_cust_dec_qty.im_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    public Integer getImDecQty() {
        return imDecQty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s02_entp_cust_dec_qty.im_dec_qty
     *
     * @param imDecQty the value for s02_entp_cust_dec_qty.im_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    public void setImDecQty(Integer imDecQty) {
        this.imDecQty = imDecQty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s02_entp_cust_dec_qty.e_dec_qty
     *
     * @return the value of s02_entp_cust_dec_qty.e_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    public Integer geteDecQty() {
        return eDecQty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s02_entp_cust_dec_qty.e_dec_qty
     *
     * @param eDecQty the value for s02_entp_cust_dec_qty.e_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    public void seteDecQty(Integer eDecQty) {
        this.eDecQty = eDecQty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s02_entp_cust_dec_qty.tot_dec_qty
     *
     * @return the value of s02_entp_cust_dec_qty.tot_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    public Integer getTotDecQty() {
        return totDecQty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s02_entp_cust_dec_qty.tot_dec_qty
     *
     * @param totDecQty the value for s02_entp_cust_dec_qty.tot_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    public void setTotDecQty(Integer totDecQty) {
        this.totDecQty = totDecQty;
    }
}