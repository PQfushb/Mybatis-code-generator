package org.saas.report.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.saas.report.entity.S02NincrCustQty;
import org.saas.report.entity.S02NincrCustQtyExample;
import org.saas.report.entity.S02NincrCustQtyKey;

public interface S02NincrCustQtyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    long countByExample(S02NincrCustQtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int deleteByExample(S02NincrCustQtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int deleteByPrimaryKey(S02NincrCustQtyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int insert(S02NincrCustQty row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int insertSelective(S02NincrCustQty row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    List<S02NincrCustQty> selectByExample(S02NincrCustQtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    S02NincrCustQty selectByPrimaryKey(S02NincrCustQtyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByExampleSelective(@Param("row") S02NincrCustQty row, @Param("example") S02NincrCustQtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByExample(@Param("row") S02NincrCustQty row, @Param("example") S02NincrCustQtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByPrimaryKeySelective(S02NincrCustQty row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_nincr_cust_qty
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByPrimaryKey(S02NincrCustQty row);
}