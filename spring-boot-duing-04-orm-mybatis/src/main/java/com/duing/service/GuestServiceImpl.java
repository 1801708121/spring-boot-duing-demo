package com.duing.service;

import com.duing.mapper.GuestMapper;
import com.duing.model.guest;
import com.duing.tk.mapper.TkGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService{

//    @Autowired
//    private GuestMapper mapper;

    @Autowired
    private TkGuestMapper mapper;

    @Override
    public List<guest> list() {
        return mapper.selectAll();
    }

}
