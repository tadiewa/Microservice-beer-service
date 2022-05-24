package tadiewa.spring.microservice.beer.service.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tadiewa.spring.microservice.beer.service.domain.Beer;
import java.util.UUID;


@Repository
public interface BeerRepository  extends PagingAndSortingRepository<Beer, UUID> {
}
