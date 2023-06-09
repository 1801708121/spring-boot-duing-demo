package com.duing.mapper;

import com.duing.model.guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface GuestMapper {

    @Select("select name, role from guest")
    List<guest> getGuests();
}
