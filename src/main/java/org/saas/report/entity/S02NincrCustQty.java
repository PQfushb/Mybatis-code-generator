package org.saas.report.entity;

public class S02NincrCustQty extends S02NincrCustQtyKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s02_nincr_cust_qty.cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    private Integer custQty;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s02_nincr_cust_qty.cust_qty
     *
     * @return the value of s02_nincr_cust_qty.cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    public Integer getCustQty() {
        return custQty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s02_nincr_cust_qty.cust_qty
     *
     * @param custQty the value for s02_nincr_cust_qty.cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    public void setCustQty(Integer custQty) {
        this.custQty = custQty;
    }
}