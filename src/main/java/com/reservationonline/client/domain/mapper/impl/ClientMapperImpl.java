package com.reservationonline.client.domain.mapper.impl;

import com.reservationonline.client.domain.entity.Client;
import com.reservationonline.client.domain.dto.ClientDto;
import com.reservationonline.client.domain.mapper.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientMapperImpl implements ClientMapper {

    private final ModelMapper modelMapper;

    @Override
    public Client ClientDtoToClient(ClientDto clientDto) {
        return modelMapper.map(clientDto, Client.class);
    }

    @Override
    public ClientDto clientToClientDto(Client client) {
        return modelMapper.map(client, ClientDto.class);
    }
}
