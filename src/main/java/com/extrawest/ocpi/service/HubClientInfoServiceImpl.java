package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.ClientInfoDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HubClientInfoServiceImpl implements HubClientInfoService {
    @Override
    public List<ClientInfoDto> getClientInfoList(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public long getTotalCount(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return 0;
    }
}
