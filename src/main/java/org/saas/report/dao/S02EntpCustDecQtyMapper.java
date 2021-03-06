package org.saas.report.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.saas.report.entity.S02EntpCustDecQty;
import org.saas.report.entity.S02EntpCustDecQtyExample;
import org.saas.report.entity.S02EntpCustDecQtyKey;

public interface S02EntpCustDecQtyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    long countByExample(S02EntpCustDecQtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int deleteByExample(S02EntpCustDecQtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int deleteByPrimaryKey(S02EntpCustDecQtyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int insert(S02EntpCustDecQty row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int insertSelective(S02EntpCustDecQty row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    List<S02EntpCustDecQty> selectByExample(S02EntpCustDecQtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    S02EntpCustDecQty selectByPrimaryKey(S02EntpCustDecQtyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByExampleSelective(@Param("row") S02EntpCustDecQty row, @Param("example") S02EntpCustDecQtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByExample(@Param("row") S02EntpCustDecQty row, @Param("example") S02EntpCustDecQtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByPrimaryKeySelective(S02EntpCustDecQty row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_entp_cust_dec_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByPrimaryKey(S02EntpCustDecQty row);
}