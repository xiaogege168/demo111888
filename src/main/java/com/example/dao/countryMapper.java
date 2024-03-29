package com.example.dao;

import com.example.entity.country;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface countryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated
     */
    int insert(country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated
     */
    int insertSelective(country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated
     */
    country selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(country record);
}