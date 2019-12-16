package com.yh.service;

import com.yh.mapper.DoorMapper;
import com.yh.pojo.Door;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoorServiceImpl implements DoorSerivce{
    @Autowired
    DoorMapper doorMapper;
    public List<Door> findAll() {
        return doorMapper.findAll();
    }

    public void addDoor(Door door) {
        doorMapper.addDoor(door);
    }

    public void delDoor(Integer id) {
        doorMapper.delDoor(id);
    }

    public Door findById(Integer id) {
        return doorMapper.findById(id);
    }

    public void update(Door door) {
        doorMapper.update(door);
    }
}
