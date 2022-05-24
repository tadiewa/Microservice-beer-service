package tadiewa.spring.microservice.beer.service.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import tadiewa.spring.microservice.beer.service.domain.Beer;

import java.util.UUID;

public interface BeerRepository  extends PagingAndSortingRepository<Beer, UUID> {
}
