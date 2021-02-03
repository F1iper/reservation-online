package com.kamann.client.service;

import com.kamann.common.PagedResponseDto;
import com.kamann.common.request.ListPageRequest;

public interface ClientListService {
  PagedResponseDto<?> execute(ListPageRequest listPageRequest);

}
