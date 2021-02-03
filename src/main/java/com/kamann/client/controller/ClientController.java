package com.kamann.client.controller;

import com.kamann.client.dto.ClientBaseDto;
import com.kamann.client.service.ClientCreateService;
import com.kamann.client.service.ClientListService;
import com.kamann.common.PagedResponseDto;
import com.kamann.common.request.ListPageRequest;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ClientController {

  private final ClientCreateService clientCreateService;
  private final ClientListService clientListService;

  @PostMapping
  private ClientBaseDto createClient(@RequestBody ClientBaseDto clientBaseDto) {
    return clientCreateService.save(clientBaseDto);
  }

//  @GetMapping
//  private PagedResponseDto<?> getClientList(@RequestParam ListPageRequest listPageRequest) {
//    return clientListService.execute()
//  }
  //todo: implement POST end-point with pagination
  //implement All the end-points with services



}
