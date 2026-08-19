package com.ishtar.service;

import com.ishtar.dto.ShiftDto;
import com.ishtar.mapper.ShiftMapper;
import com.ishtar.models.ShiftModel;
import com.ishtar.repo.ShiftRepo;
import org.springframework.stereotype.Service;

@Service
public class ShiftService extends AbstractService<ShiftModel, ShiftRepo, ShiftMapper, ShiftDto>{

}
