package com.kamann.client.mapper;

import com.kamann.client.domain.User;
import com.kamann.client.dto.ClientDto;

public interface ClientMapper {

        User userDtoToUser(ClientDto clientDto);
        ClientDto userToUserDto(User user);
        //todo: List<UserDto> UserListToUserDtoList(List<User>

}
