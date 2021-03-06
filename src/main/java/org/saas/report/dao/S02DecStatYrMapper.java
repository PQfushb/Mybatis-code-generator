package org.saas.report.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.saas.report.entity.S02DecStatYr;
import org.saas.report.entity.S02DecStatYrExample;

public interface S02DecStatYrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    long countByExample(S02DecStatYrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int deleteByExample(S02DecStatYrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int deleteByPrimaryKey(String yr);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int insert(S02DecStatYr row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int insertSelective(S02DecStatYr row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    List<S02DecStatYr> selectByExample(S02DecStatYrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    S02DecStatYr selectByPrimaryKey(String yr);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByExampleSelective(@Param("row") S02DecStatYr row, @Param("example") S02DecStatYrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByExample(@Param("row") S02DecStatYr row, @Param("example") S02DecStatYrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByPrimaryKeySelective(S02DecStatYr row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s02_dec_stat_yr
     *
     * @mbg.generated Thu Jun 23 14:31:43 CST 2022
     */
    int updateByPrimaryKey(S02DecStatYr row);
}